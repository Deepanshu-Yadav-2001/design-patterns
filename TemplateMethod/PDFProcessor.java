public class PDFProcessor extends DocumentProcessor {
    public PDFProcessor(Document document) {
        super(document);
        if (!document.getDocumentType().equals(DocumentType.PDF)) {
            throw new RuntimeException("Incorrect Document type");
        }
    }

    @Override
    void processContent() {
        updateContent(getContent() + " processed as PDF");
    }
}
