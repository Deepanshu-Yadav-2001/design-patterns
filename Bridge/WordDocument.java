public class WordDocument extends Document {
    public WordDocument(StorageService storageService) {
        super(storageService);
    }

    @Override
    void save(String content) {
        storageService.save(content);
        System.out.println("Saved as Word file");
    }

    @Override
    String load(String name) {
        storageService.load(name);
        System.out.println("Loaded as Word file");
        return name;
    }

    @Override
    void delete(String name) {
        storageService.delete(name);
        System.out.println("Deleted Word file");
    }
}
