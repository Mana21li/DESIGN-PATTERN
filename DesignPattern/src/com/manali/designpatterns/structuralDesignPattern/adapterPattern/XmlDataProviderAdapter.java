package com.manali.designpatterns.structuralDesignPattern.adapterPattern;

public class XmlDataProviderAdapter implements Reports{
    private final XMLDataProvider xmlDataProvider;

    public XmlDataProviderAdapter(XMLDataProvider provider) {
        this.xmlDataProvider = provider;
    }

    @Override
    public String getJsonData(String data) {
        String xmlData = xmlDataProvider.getXmlData(data);

        int startName = xmlData.indexOf("<name>")+6;
        int endName = xmlData.indexOf("</name>");
        String name = xmlData.substring(startName, endName);

        int startId = xmlData.indexOf("<id>")+4;
        int endId = xmlData.indexOf("</id>");
        String id = xmlData.substring(startId, endId);

        return "{\"name\":\""+name+"\",\"id\":\""+id+"\"}";
    }
}
