package org.kie.kogito.examples.P8C;

import static org.kie.kogito.examples.Rules471B42E068A21F8D5BEF529A54AE3B27.*;
import org.kie.kogito.examples.*;
import org.kie.kogito.rules.RuleUnitData;
import org.kie.kogito.rules.DataStore;
import org.kie.kogito.rules.DataSource;
import org.drools.modelcompiler.dsl.pattern.D;

@org.drools.compiler.kie.builder.MaterializedLambda()
public enum LambdaConsequence8C533B8A32AB46F918BEC7BB20D83178 implements org.drools.model.functions.Block2<org.kie.kogito.examples.Result, org.kie.kogito.examples.Person>, org.drools.model.functions.HashedExpression {

    INSTANCE;

    public static final String EXPRESSION_HASH = "04204F55C1E1F5994AE657F5622DE49A";

    public java.lang.String getExpressionHash() {
        return EXPRESSION_HASH;
    }

    @Override()
    public void execute(org.kie.kogito.examples.Result result, org.kie.kogito.examples.Person $p) throws java.lang.Exception {
        result.addAdultPersonName("Hello, " + $p.getName());
    }
}
