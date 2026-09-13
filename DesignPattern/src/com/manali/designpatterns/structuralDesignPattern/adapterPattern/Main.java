package com.manali.designpatterns.structuralDesignPattern.adapterPattern;

public class Main {
    public static void main() {
        XMLDataProvider xmlDataProvider = new XMLDataProvider();
        Reports adapter = new XmlDataProviderAdapter(xmlDataProvider);

        String rawData = "Alice:42";
        Client client = new Client();
        client.getReports(adapter, rawData);
    }
}
