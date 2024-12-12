public abstract class DocumentProcessor {
    private final Document document;
    private String content;

    public DocumentProcessor(Document document) {
        this.document = document;
        this.content = "";
    }

    public void processDocument() {
        openDocument();
        readContent();
        processContent();
        saveDocument();
        closeDocument();
    }

    public void openDocument() {
        if (document.getIsOpen()) {
            System.out.println("Document is already open");
            return;
        }
        System.out.println("Opening the document " + document.getTitle());
        document.setIsOpen(true);
    }

    public void readContent() {
        if (!document.getIsOpen()) {
            throw new RuntimeException("Please open the document first");
        }
        System.out.println("Reading content...");
        content = document.getContent();
    }

    abstract void processContent();

    public void saveDocument() {
        if (!document.getIsOpen()) {
            throw new RuntimeException("Please open the document first");
        }
        System.out.println("Saving document with content " + getContent() + "....");
        document.setContent(content);
    }

    public void closeDocument() {
        if (!document.getIsOpen()) {
            System.out.println("Document is already closed");
            return;
        }
        System.out.println("Closing document...");
        document.setIsOpen(false);
    }

    public String getContent() {
        return content;
    }

    public void updateContent(String content) {
        this.content = content;
    }
}
