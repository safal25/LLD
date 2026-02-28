public class DocumentEditor {

    private Document document;
    private Persistence persistence;

    public DocumentEditor(Document document, Persistence persistence) {
        this.document = document;
        this.persistence = persistence;
    }

    public void addText(String text){
        TextElement textElement = new TextElement(text);
        document.addElement(textElement);
    }

    public void addImage(String imagePath){
        ImageElement imageElement = new ImageElement(imagePath);
        document.addElement(imageElement);
    }

    public void saveDocument(){
        persistence.save(document);
    }

    public void render(){
        document.render();
    }

}
