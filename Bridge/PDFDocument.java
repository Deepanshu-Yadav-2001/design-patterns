public class PDFDocument extends Document {
    public PDFDocument(StorageService storageService) {
        super(storageService);
    }

    @Override
    void save(String content) {
        storageService.save(content);
        System.out.println("Saved as PDF");
    }

    @Override
    String load(String name) {
        storageService.load(name);
        System.out.println("Loaded as PDF");
        return name;
    }

    @Override
    void delete(String name) {
        storageService.delete(name);
        System.out.println("Deleted PDF");
    }
}
