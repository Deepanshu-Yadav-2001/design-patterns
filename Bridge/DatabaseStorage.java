public class DatabaseStorage implements StorageService {
    @Override
    public void save(String document) {
        System.out.println("Saving the document: " + document + " to database");
    }

    @Override
    public String load(String documentName) {
        System.out.println("Loading the document: " + documentName + " from database");
        return documentName;
    }

    @Override
    public void delete(String documentName) {
        System.out.println("Deleting the document: " + documentName + " from database");
    }
}
