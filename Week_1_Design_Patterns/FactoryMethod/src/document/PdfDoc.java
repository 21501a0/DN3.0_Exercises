package document;
public class PdfDoc implements Docs {
    private String txt;

    @Override
    public void opening() {
        System.out.println("Opening PDF document...");
    }

    @Override
    public void close() {
        System.out.println("Closing PDF document...");
    }

    @Override
    public void save() {
        System.out.println("Saving PDF document with content: " + txt);
    }

    @Override
    public void upd(String txt) {
        this.txt = txt;
        System.out.println("Writing into document: " + txt);
    }
}
