package com.manali.designpatterns.structuralDesignPattern.adapterPattern;

public class XMLDataProvider {

    public String getXmlData(String xmlData){
        int sep = xmlData.indexOf(':');
        String name = xmlData.substring(0, sep);
        String id = xmlData.substring(sep+1);
        return "<user>"
                + "<name>"+name+"</name>"
                + "<id>"+id+"</id>"
                + "</user>";
    }
}
