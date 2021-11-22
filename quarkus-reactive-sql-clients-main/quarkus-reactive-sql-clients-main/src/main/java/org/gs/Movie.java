package org.gs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import io.smallrye.mutiny.Multi;
import io.smallrye.mutiny.Uni;
import io.vertx.mutiny.pgclient.PgPool;
import io.vertx.mutiny.sqlclient.Row;
import io.vertx.mutiny.sqlclient.Tuple;

public class Movie {
	

	private Long id;
	private String title;

	public Movie(Long id, String title) {
		this.id = id;
		this.title = title;
	}


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public static Multi<Movie> findAll(PgPool client) {
		return client.query("SELECT id, title FROM movies ORDER BY id asc").execute().onItem()
				.transformToMulti(set -> Multi.createFrom().iterable(set)).onItem().transform(Movie::from);
	}

	public static Uni<Movie> findById(PgPool client, Long id) {
		return client.preparedQuery("SELECT id, title FROM movies WHERE id = $1").execute(Tuple.of(id)).onItem()
				.transform(m -> m.iterator().hasNext() ? from(m.iterator().next()) : null);
	}

	public static Uni<Long> save(PgPool client, String title) {
		return client.preparedQuery("INSERT INTO movies (title) VALUES ($1) RETURNING id").execute(Tuple.of(title))
				.onItem().transform(m -> m.iterator().next().getLong("id"));
	}

	public static Uni<Boolean> delete(PgPool client, Long id) {
		return client.preparedQuery("DELETE FROM movies WHERE id = $1").execute(Tuple.of(id)).onItem()
				.transform(m -> m.rowCount() == 1);
	}

	private static Movie from(Row row) {
		return new Movie(row.getLong("id"), row.getString("title"));
	}

	public static int Update(Long long1, String title) {
		String SQL = "Update movies set title = ? WHERE id = ?";
		Connection conn = null;
		int affectedrows = 0;
		try {
			String url = "jdbc:postgresql://localhost/my_db?user=postgres&password=clovity";
			conn = DriverManager.getConnection(url);
			PreparedStatement pstmt = conn.prepareStatement(SQL);
			pstmt.setString(1, title);
			pstmt.setLong(2, long1);

			affectedrows = pstmt.executeUpdate();

		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return affectedrows;
	}
}
