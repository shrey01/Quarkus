/*
 * Copyright 2021 Red Hat, Inc. and/or its affiliates.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.kie.kogito.examples;

import java.util.List;
import java.util.Map;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import org.kie.kogito.rules.RuleUnit;
import org.kie.kogito.rules.RuleUnitInstance;
import static java.util.stream.Collectors.toList;

@Path("/hello")
public class HelloQueryHelloEndpoint {

    @javax.inject.Inject
    RuleUnit<org.kie.kogito.examples.Hello> ruleUnit;

    public HelloQueryHelloEndpoint() {
    }

    public HelloQueryHelloEndpoint(RuleUnit<org.kie.kogito.examples.Hello> ruleUnit) {
        this.ruleUnit = ruleUnit;
    }

    @POST()
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public List<org.kie.kogito.examples.Result> executeQuery(org.kie.kogito.examples.Hello unitDTO) {
        RuleUnitInstance<org.kie.kogito.examples.Hello> instance = ruleUnit.createInstance(unitDTO);
        // Do not return the result directly to allow post execution codegen (like monitoring)
        List<org.kie.kogito.examples.Result> response = instance.executeQuery(HelloQueryHello.class);
        instance.dispose();
        return response;
    }

    @POST()
    @Path("/first")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public org.kie.kogito.examples.Result executeQueryFirst(org.kie.kogito.examples.Hello unitDTO) {
        List<org.kie.kogito.examples.Result> results = executeQuery(unitDTO);
        org.kie.kogito.examples.Result response = results.isEmpty() ? null : results.get(0);
        return response;
    }
}
