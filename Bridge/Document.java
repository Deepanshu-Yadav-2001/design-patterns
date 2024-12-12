public abstract class Document {
    protected final StorageService storageService;

    public Document(StorageService storageService) {
        this.storageService = storageService;
    }

    abstract void save(String content);
    abstract String load(String name);
    abstract void delete(String name);
}
