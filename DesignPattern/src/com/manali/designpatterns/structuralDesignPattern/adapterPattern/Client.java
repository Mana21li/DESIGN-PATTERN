package com.manali.designpatterns.structuralDesignPattern.adapterPattern;

public class Client {
    public void getReports(Reports reports, String rawData) {
        System.out.println("Processed Json: " + reports.getJsonData(rawData));

    }
}
