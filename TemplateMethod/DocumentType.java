public enum DocumentType {
    PDF("PDF"),
    WORD("WORD"),
    EXCEL("EXCEL");

    private final String value;

    DocumentType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public DocumentType getFromValue(String value) {
        for (DocumentType documentType: values()) {
            if (documentType.getValue().equals(value)) {
                return documentType;
            }
        }
        return null;
    }
}
