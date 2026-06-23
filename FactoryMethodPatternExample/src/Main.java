public class Main {

    public static void main(String[] args) {

        DocumentFactory wordFactory = new WordDocumentFactory();
        DocumentFactory pdfFactory = new PdfDocumentFactory();
        DocumentFactory excelFactory = new ExcelDocumentFactory();

        Document word = wordFactory.createDocument();
        Document pdf = pdfFactory.createDocument();
        Document excel = excelFactory.createDocument();

        System.out.println(word.getClass().getSimpleName());
        System.out.println(pdf.getClass().getSimpleName());
        System.out.println(excel.getClass().getSimpleName());
    }
}