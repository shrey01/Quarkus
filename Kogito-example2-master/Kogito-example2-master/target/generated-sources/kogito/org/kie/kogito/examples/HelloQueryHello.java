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
import org.kie.kogito.rules.RuleUnitInstance;
import static java.util.stream.Collectors.toList;

public class HelloQueryHello implements org.kie.kogito.rules.RuleUnitQuery<List<org.kie.kogito.examples.Result>> {

    private final RuleUnitInstance<org.kie.kogito.examples.Hello> instance;

    public HelloQueryHello(RuleUnitInstance<org.kie.kogito.examples.Hello> instance) {
        this.instance = instance;
    }

    @Override
    public List<org.kie.kogito.examples.Result> execute() {
        return instance.executeQuery("hello").stream().map(this::toResult).collect(toList());
    }

    private org.kie.kogito.examples.Result toResult(Map<String, Object> tuple) {
        return (org.kie.kogito.examples.Result) tuple.get("$r");
    }
}
