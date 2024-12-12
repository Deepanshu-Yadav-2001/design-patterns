public class TemplateMethodPatternDemo {
    public static void main(String[] args) {
        DocumentProcessor pdfProcessor = new PDFProcessor(new Document("Java Programming", DocumentType.PDF, "This is the pdf book for Java programming"));
        pdfProcessor.processDocument();

        DocumentProcessor wordProcessor = new WordProcessor(new Document("Design Patterns", DocumentType.WORD, "This is the word book for Design Patterns"));
        wordProcessor.processDocument();

        DocumentProcessor excelProcessor = new ExcelProcessor(new Document("Java Programming", DocumentType.PDF, "This is the pdf book for Java programming"));
        // should throw an error
        excelProcessor.processDocument();
    }
}