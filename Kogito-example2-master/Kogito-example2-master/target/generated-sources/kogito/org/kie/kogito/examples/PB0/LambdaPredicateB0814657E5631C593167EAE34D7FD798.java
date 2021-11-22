package org.kie.kogito.examples.PB0;

import static org.kie.kogito.examples.Rules471B42E068A21F8D5BEF529A54AE3B27.*;
import org.kie.kogito.examples.*;
import org.kie.kogito.rules.RuleUnitData;
import org.kie.kogito.rules.DataStore;
import org.kie.kogito.rules.DataSource;
import org.drools.modelcompiler.dsl.pattern.D;

@org.drools.compiler.kie.builder.MaterializedLambda()
public enum LambdaPredicateB0814657E5631C593167EAE34D7FD798 implements org.drools.model.functions.Predicate1<org.kie.kogito.examples.Person>, org.drools.model.functions.HashedExpression {

    INSTANCE;

    public static final String EXPRESSION_HASH = "BDA1A6AB1E0608E7B647948AC7BE1773";

    public java.lang.String getExpressionHash() {
        return EXPRESSION_HASH;
    }

    @Override()
    public boolean test(org.kie.kogito.examples.Person _this) throws java.lang.Exception {
        return org.drools.modelcompiler.util.EvaluationUtil.greaterThanNumbers(_this.getAge(), 18);
    }

    @Override()
    public org.drools.model.functions.PredicateInformation predicateInformation() {
        org.drools.model.functions.PredicateInformation info = new org.drools.model.functions.PredicateInformation("age > 18");
        info.addRuleNames("older than 18", "C:/CodeBank/cmd/Kogito-example2-master/Kogito-example2-master/src/main/resources/org/kie/kogito/examples/Hello.drl");
        return info;
    }
}
