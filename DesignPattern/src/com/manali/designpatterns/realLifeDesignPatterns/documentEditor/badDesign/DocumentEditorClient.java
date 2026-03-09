package com.manali.designpatterns.realLifeDesignPatterns.documentEditor.badDesign;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class DocumentEditorClient {
    public static void main(String[] args) {
        DocumentEditor documentEditor = new DocumentEditor();

        documentEditor.addText("Hello World");
        documentEditor.addImage("https/google/image1.png");
        documentEditor.addText("Close the world");
        documentEditor.addImage("https/google/image2.png");

        System.out.println(documentEditor.renderDocument());
        documentEditor.saveToFile();
    }
}

class DocumentEditor {
    private List<String> documentElements;
    private String renderedDocument;

    public DocumentEditor() {
        documentElements = new ArrayList<>();
        renderedDocument = "";
    }

    void addText(String text) {
        documentElements.add(text);
    }

    void addImage(String path) {
        documentElements.add(path);
    }

    public String renderDocument() {
        if(renderedDocument.isEmpty()) {
            StringBuilder res = new StringBuilder();
            for(String element : documentElements) {
                if(element.length()>4 && (element.endsWith(".jpg") || element.endsWith(".png"))) {
                    res.append("[Image: ").append(element).append("]\n");
                } else {
                    res.append(element).append("\n");
                }
            }
            renderedDocument = res.toString();
        }
        return renderedDocument;
    }

    public void saveToFile() {
        try {
            FileWriter file = new FileWriter("document.txt");
            file.write(renderedDocument);
            file.close();
            System.out.println("Document saved in file document.txt");
        } catch (IOException e) {
            System.out.println("Error in saving Document");

        }
    }


}
