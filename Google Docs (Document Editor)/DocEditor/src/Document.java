import java.util.List;
import java.util.ArrayList;

public class Document {

    private List<DocumentElement> documentElements;

    public Document(){
        this.documentElements = new ArrayList<DocumentElement>();
    }

   public void addElement(DocumentElement element) {
       documentElements.add(element);
   }

   public void render() {

       StringBuilder renderedContent = new StringBuilder();
       for (DocumentElement element : documentElements) {
           renderedContent.append(element.render());
       }
       System.out.println(renderedContent.toString());
   }

}
