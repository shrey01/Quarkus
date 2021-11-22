package org.kie.kogito.examples;
public class DomainClassesMetadata471B42E068A21F8D5BEF529A54AE3B27 {

    public static final org.drools.model.DomainClassMetadata org_kie_kogito_examples_Person_Metadata_INSTANCE = new org_kie_kogito_examples_Person_Metadata();
    private static class org_kie_kogito_examples_Person_Metadata implements org.drools.model.DomainClassMetadata {

        @Override
        public Class<?> getDomainClass() {
            return org.kie.kogito.examples.Person.class;
        }

        @Override
        public int getPropertiesSize() {
            return 2;
        }

        @Override
        public int getPropertyIndex( String name ) {
            switch(name) {
                case "age": return 0;
                case "name": return 1;
             }
             throw new RuntimeException("Unknown property '" + name + "' for class class class org.kie.kogito.examples.Person");
        }
    }

    public static final org.drools.model.DomainClassMetadata org_kie_kogito_rules_DataStore_Metadata_INSTANCE = new org_kie_kogito_rules_DataStore_Metadata();
    private static class org_kie_kogito_rules_DataStore_Metadata implements org.drools.model.DomainClassMetadata {

        @Override
        public Class<?> getDomainClass() {
            return org.kie.kogito.rules.DataStore.class;
        }

        @Override
        public int getPropertiesSize() {
            return 0;
        }

        @Override
        public int getPropertyIndex( String name ) {
            switch(name) {
             }
             throw new RuntimeException("Unknown property '" + name + "' for class class interface org.kie.kogito.rules.DataStore");
        }
    }

    public static final org.drools.model.DomainClassMetadata org_kie_kogito_examples_Result_Metadata_INSTANCE = new org_kie_kogito_examples_Result_Metadata();
    private static class org_kie_kogito_examples_Result_Metadata implements org.drools.model.DomainClassMetadata {

        @Override
        public Class<?> getDomainClass() {
            return org.kie.kogito.examples.Result.class;
        }

        @Override
        public int getPropertiesSize() {
            return 1;
        }

        @Override
        public int getPropertyIndex( String name ) {
            switch(name) {
                case "adultPersonNameList": return 0;
             }
             throw new RuntimeException("Unknown property '" + name + "' for class class class org.kie.kogito.examples.Result");
        }
    }

}