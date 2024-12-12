public class WordProcessor extends DocumentProcessor {
    public WordProcessor(Document document) {
        super(document);
        if (!document.getDocumentType().equals(DocumentType.WORD)) {
            throw new RuntimeException("Incorrect Document type");
        }
    }

    @Override
    void processContent() {
        updateContent(getContent() + " processed as Word");
    }
}
