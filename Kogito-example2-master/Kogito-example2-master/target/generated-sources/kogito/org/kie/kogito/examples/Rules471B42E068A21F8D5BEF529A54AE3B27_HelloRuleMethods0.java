package org.kie.kogito.examples;

import org.drools.modelcompiler.dsl.pattern.D;
import org.drools.model.Index.ConstraintType;
import org.kie.kogito.rules.RuleUnitData;
import org.kie.kogito.rules.DataStore;
import org.kie.kogito.rules.DataSource;
import static org.kie.kogito.examples.Rules471B42E068A21F8D5BEF529A54AE3B27.*;

public class Rules471B42E068A21F8D5BEF529A54AE3B27_HelloRuleMethods0 {

    /**
     * Rule name: older than 18
     */
    public static org.drools.model.Rule rule_older_32than_3218() {
        final org.drools.model.Variable<org.kie.kogito.examples.Person> var_$p = D.declarationOf(org.kie.kogito.examples.Person.class,
                                                                                                 DomainClassesMetadata471B42E068A21F8D5BEF529A54AE3B27.org_kie_kogito_examples_Person_Metadata_INSTANCE,
                                                                                                 "$p",
                                                                                                 D.entryPoint("persons"));
        org.drools.model.Rule rule = D.rule("org.kie.kogito.examples",
                                            "older than 18")
                                      .unit(org.kie.kogito.examples.Hello.class)
                                      .build(D.pattern(var_$p).expr("GENERATED_02F069AACDD0C698184CCEB7BEB19622",
                                                                    org.kie.kogito.examples.PB0.LambdaPredicateB0814657E5631C593167EAE34D7FD798.INSTANCE,
                                                                    D.alphaIndexedBy(int.class,
                                                                                     org.drools.model.Index.ConstraintType.GREATER_THAN,
                                                                                     DomainClassesMetadata471B42E068A21F8D5BEF529A54AE3B27.org_kie_kogito_examples_Person_Metadata_INSTANCE.getPropertyIndex("age"),
                                                                                     org.kie.kogito.examples.P8E.LambdaExtractor8EC284265C48F05C3C2AD709495BC220.INSTANCE,
                                                                                     18),
                                                                    D.reactOn("age")),
                                             D.on(var_result,
                                                  var_$p).execute(org.kie.kogito.examples.P8C.LambdaConsequence8C533B8A32AB46F918BEC7BB20D83178.INSTANCE));
        return rule;
    }
}
