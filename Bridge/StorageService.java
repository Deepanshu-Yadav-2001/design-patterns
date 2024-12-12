public interface StorageService {
    void save(String document);
    String load(String documentName);
    void delete(String documentName);
}
