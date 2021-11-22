package org.kie.kogito.examples;

import org.drools.modelcompiler.dsl.pattern.D;
import org.drools.model.Index.ConstraintType;
import org.kie.kogito.rules.RuleUnitData;
import org.kie.kogito.rules.DataStore;
import org.kie.kogito.rules.DataSource;

public abstract class Rules471B42E068A21F8D5BEF529A54AE3B27 implements org.drools.model.Model {

    public final static java.time.format.DateTimeFormatter DATE_TIME_FORMATTER = new java.time.format.DateTimeFormatterBuilder().parseCaseInsensitive().appendPattern(org.drools.core.util.DateUtils.getDateFormatMask()).toFormatter(java.util.Locale.ENGLISH);

    @Override
    public String getName() {
        return "org.kie.kogito.examples";
    }

    @Override
    public java.util.List<org.drools.model.EntryPoint> getEntryPoints() {
        return java.util.Arrays.asList(D.entryPoint("persons"));
    }

    @Override
    public java.util.List<org.drools.model.Global> getGlobals() {
        return globals;
    }

    @Override
    public java.util.List<org.drools.model.TypeMetaData> getTypeMetaDatas() {
        return typeMetaDatas;
    }

    public static final org.drools.model.Global<org.kie.kogito.examples.Result> var_result = D.globalOf(org.kie.kogito.examples.Result.class,
                                                                                                        "org.kie.kogito.examples",
                                                                                                        "result");

    public static final org.drools.model.Global<org.kie.kogito.rules.DataStore> var_persons = D.globalOf(org.kie.kogito.rules.DataStore.class,
                                                                                                         "org.kie.kogito.examples",
                                                                                                         "persons");

    public static final org.drools.model.Query0Def queryDef_hello = D.query("org.kie.kogito.examples",
                                                                            "hello");

    java.util.List<org.drools.model.Global> globals = new java.util.ArrayList<>();

    java.util.List<org.drools.model.TypeMetaData> typeMetaDatas = new java.util.ArrayList<>();

    {
        globals.add(var_result);
        globals.add(var_persons);
        typeMetaDatas.add(D.typeMetaData(org.kie.kogito.examples.Hello.class));
    }
}
