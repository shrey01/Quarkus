package org.kie.kogito.examples;

import java.util.ArrayList;
import java.util.List;

public class Result {

    private List<String> adultPersonNameList = new ArrayList<>();

    public List<String> getAdultPersonNameList() {
        return adultPersonNameList;
    }

    public void setAdultPersonNameList(List<String> adultPersonNameList) {
        this.adultPersonNameList = adultPersonNameList;
    }

    public void addAdultPersonName(String adultPersonName) {
        adultPersonNameList.add(adultPersonName);
    }
}
