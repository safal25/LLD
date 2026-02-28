public class App {
    public static void main(String[] args) throws Exception {
        Document document = new Document();
        Persistence persistence = new SaveToFile();
        DocumentEditor documentEditor = new DocumentEditor(document, persistence);
        documentEditor.addText("Hello, World!");
        documentEditor.addImage("path/to/image.jpg");
        documentEditor.render();
        documentEditor.saveDocument();
    }
}
