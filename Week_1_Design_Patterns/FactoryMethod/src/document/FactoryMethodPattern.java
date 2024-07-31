package document;

public class FactoryMethodPattern {
    public static void main(String[] args) throws Exception {
        DocFactory wordFactory = new WordDocFactory();
        Docs wordobj = wordFactory.createDocument();
        wordobj.opening();
        wordobj.upd("This is Word file being written here");
        wordobj.save();
        wordobj.close();

        System.out.println();

        DocFactory pdfFactory = new PdfDocFactory();
        Docs pdfobj = pdfFactory.createDocument();
        pdfobj.opening();
        pdfobj.upd("This is pdf file begin written here");
        pdfobj.save();
         pdfobj.close();

        System.out.println();
        
        DocFactory xlsFactory = new XlsDocFactory();
        Docs xlsobj = xlsFactory.createDocument();
        xlsobj.opening();
        xlsobj.upd("This is excel document being written");
        xlsobj.save();
        xlsobj.close();
    }
}