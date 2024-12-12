public class Document {
    private final String title;
    private final DocumentType documentType;
    private String content;
    private boolean isOpen;

    public Document(String title, DocumentType documentType, String content) {
        this.title = title;
        this.documentType = documentType;
        this.content = content;
        this.isOpen = false;
    }

    public String getTitle() {
        return title;
    }

    public DocumentType getDocumentType() {
        return documentType;
    }

    public String getContent() {
        return content;
    }

    public boolean getIsOpen() {
        return isOpen;
    }

    public void setIsOpen(boolean isOpen) {
        this.isOpen = isOpen;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
