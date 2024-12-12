public class ExcelProcessor extends DocumentProcessor {
    public ExcelProcessor(Document document) {
        super(document);
        if (!document.getDocumentType().equals(DocumentType.EXCEL)) {
            throw new RuntimeException("Incorrect Document type");
        }
    }

    @Override
    void processContent() {
        updateContent(getContent() + " processed as Excel");
    }
}
