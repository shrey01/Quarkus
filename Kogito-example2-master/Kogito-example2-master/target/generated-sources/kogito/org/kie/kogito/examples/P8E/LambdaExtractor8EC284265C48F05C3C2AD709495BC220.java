package org.kie.kogito.examples.P8E;

import static org.kie.kogito.examples.Rules471B42E068A21F8D5BEF529A54AE3B27.*;
import org.kie.kogito.examples.*;
import org.kie.kogito.rules.RuleUnitData;
import org.kie.kogito.rules.DataStore;
import org.kie.kogito.rules.DataSource;
import org.drools.modelcompiler.dsl.pattern.D;

@org.drools.compiler.kie.builder.MaterializedLambda()
public enum LambdaExtractor8EC284265C48F05C3C2AD709495BC220 implements org.drools.model.functions.Function1<org.kie.kogito.examples.Person, Integer>, org.drools.model.functions.HashedExpression {

    INSTANCE;

    public static final String EXPRESSION_HASH = "3EE3D1A775B94428125B5940F101E1AC";

    public java.lang.String getExpressionHash() {
        return EXPRESSION_HASH;
    }

    @Override()
    public Integer apply(org.kie.kogito.examples.Person _this) {
        return _this.getAge();
    }
}
