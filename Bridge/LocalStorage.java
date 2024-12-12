public class LocalStorage implements StorageService {
    @Override
    public void save(String document) {
        System.out.println("Saving the document: " + document + " to local");
    }

    @Override
    public String load(String documentName) {
        System.out.println("Loading the document: " + documentName + " from local");
        return documentName;
    }

    @Override
    public void delete(String documentName) {
        System.out.println("Deleting the document: " + documentName + " from local");
    }
}
