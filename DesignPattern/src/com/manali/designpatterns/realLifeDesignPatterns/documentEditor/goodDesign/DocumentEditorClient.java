package com.manali.designpatterns.realLifeDesignPatterns.documentEditor.goodDesign;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class DocumentEditorClient {
    public static void main(String[] args) {
        Document doc = new Document();
        DBPersistance dbPersistance = new FilePersistence();

        DocumentEditor documentEditor = new DocumentEditor(doc, dbPersistance);

        documentEditor.addText("Hello world!");
        documentEditor.addNewLine();
        documentEditor.addImage("img1.png");

        System.out.println(documentEditor.renderDocument());
        documentEditor.saveDocument();
    }

}

interface DocumentElement {
    String render();
}

class TextElement implements DocumentElement {

    private String text;

    public TextElement(String text) {
        this.text = text;
    }

    @Override
    public String render() {
        return text;
    }

}

class ImageElement implements DocumentElement {

    private String imagePath;

    public ImageElement(String imagePath) {
        this.imagePath = imagePath;
    }

    @Override
    public String render() {
        return imagePath;
    }
}

class NewLineElement implements DocumentElement {
    @Override
    public String render() {
        return "\n";
    }
}

class TabSpaceElement implements DocumentElement {

    @Override
    public String render() {
        return "\t";
    }
}

class Document {
    List<DocumentElement> documentElements = new ArrayList<>();

    public void addElement(DocumentElement element) {
        documentElements.add(element);
    }

    public String render() {
        StringBuilder result = new StringBuilder();
        for (DocumentElement element : documentElements) {
            result.append(element.render());
        }
        return result.toString();
    }
}

interface DBPersistance {
    void save(String data);
}

class FilePersistence implements DBPersistance {
    @Override
    public void save(String data) {
        try {
            FileWriter file = new FileWriter("document.txt");
            file.write(data);
            file.close();
            System.out.println("Document.txt saved successfully");
        } catch (IOException e) {
            System.out.println("Error in saving file");
        }
    }
}

class DocumentEditor {
    private Document document;
    private DBPersistance dbPersistance;
    private String renderedDocument = "";

    public DocumentEditor(Document document, DBPersistance dbPersistance) {
        this.document = document;
        this.dbPersistance = dbPersistance;
    }

    public void addText(String text) {
        document.addElement(new TextElement(text));
    }

    public void addImage(String imagePath) {
        document.addElement(new ImageElement(imagePath));
    }

    public void addNewLine() {
        document.addElement(new NewLineElement());
    }

    public void addTabSpace() {
        document.addElement(new TabSpaceElement());
    }

    public String renderDocument() {
        if (renderedDocument.isEmpty()) {
            renderedDocument = document.render();
        }
        return renderedDocument;
    }

    public void saveDocument() {
        dbPersistance.save(renderDocument());
    }


}
