package org.kie.kogito.examples;

import org.kie.kogito.examples.*;
import org.kie.kogito.rules.RuleUnitData;
import org.kie.kogito.rules.DataStore;
import org.kie.kogito.rules.DataSource;

public class Hello implements java.io.Serializable, org.drools.core.factmodel.GeneratedFact, org.drools.core.factmodel.AccessibleFact, RuleUnitData {

    public Hello() {
    }

    @Override()
    public Object getValue(java.lang.String fieldName) {
        switch(fieldName) {
            case "result":
                return this.result;
            case "persons":
                return this.persons;
            default:
                return null;
        }
    }

    @Override()
    public void setValue(java.lang.String fieldName, java.lang.Object value) {
        switch(fieldName) {
            case "result":
                this.result = (Result) value;
                break;
            case "persons":
                this.persons = (DataStore<Person>) value;
                break;
        }
    }

    @org.kie.api.definition.type.Position(value = 0)
    private Result result = new Result();

    public void setResult(Result result) {
        this.result = result;
    }

    public Result getResult() {
        return result;
    }

    @org.kie.api.definition.type.Position(value = 1)
    private DataStore<Person> persons = DataSource.createStore();

    public void setPersons(DataStore<Person> persons) {
        this.persons = persons;
    }

    public DataStore<Person> getPersons() {
        return persons;
    }

    public Hello(Result result, DataStore<Person> persons) {
        super();
        this.result = result;
        this.persons = persons;
    }

    @java.lang.Override()
    public java.lang.String toString() {
        return "Hello" + "( " + "result=" + result + ", " + "persons=" + persons + " )";
    }
}
