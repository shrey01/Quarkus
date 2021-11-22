package org.kie.kogito.examples;

import org.drools.modelcompiler.dsl.pattern.D;
import org.drools.model.Index.ConstraintType;
import org.kie.kogito.rules.RuleUnitData;
import org.kie.kogito.rules.DataStore;
import org.kie.kogito.rules.DataSource;
import static org.kie.kogito.examples.Rules471B42E068A21F8D5BEF529A54AE3B27.*;
import org.drools.model.Query;

public class Rules471B42E068A21F8D5BEF529A54AE3B27_Hello extends Rules471B42E068A21F8D5BEF529A54AE3B27 {

    @Override
    public String getName() {
        return super.getName() + ".Hello";
    }

    @Override
    public String getPackageName() {
        return super.getName();
    }

    /**
     * With the following expression ID:
     * org.drools.modelcompiler.builder.generator.DRLIdGenerator@67e5e4cf
     */
    @Override
    public java.util.List<org.drools.model.Rule> getRules() {
        return rules;
    }

    public java.util.List<org.drools.model.Rule> getRulesList() {
        return java.util.Arrays.asList(Rules471B42E068A21F8D5BEF529A54AE3B27_HelloRuleMethods0.rule_older_32than_3218());
    }

    java.util.List<org.drools.model.Rule> rules = getRulesList();

    final Query query_hello = query_hello();

    @Override
    public java.util.List<org.drools.model.Query> getQueries() {
        return queries;
    }

    private org.drools.model.Query query_hello() {
        final org.drools.model.Variable<org.kie.kogito.examples.Result> var_$r = D.declarationOf(org.kie.kogito.examples.Result.class,
                                                                                                 DomainClassesMetadata471B42E068A21F8D5BEF529A54AE3B27.org_kie_kogito_examples_Result_Metadata_INSTANCE,
                                                                                                 "$r",
                                                                                                 D.from(var_result));
        org.drools.model.Query hello_build = queryDef_hello.build(D.pattern(var_$r,
                                                                            D.from(var_result)));
        return hello_build;
    }

    java.util.List<org.drools.model.Query> queries = new java.util.ArrayList<>();

    {
        queries.add(query_hello);
    }
}
