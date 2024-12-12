import java.util.ArrayList;
import java.util.List;

public class User {
    private final String id;
    private final List<String> permittedBooks;

    public User(String id) {
        this.id = id;
        permittedBooks = new ArrayList<>();
    }

    public String getId() {
        return id;
    }

    public List<String> getPermittedBooks() {
        return permittedBooks;
    }

    public void addBook(String bookTitle) {
        permittedBooks.add(bookTitle);
    }

    public void removeBook(String bookTitle) {
        permittedBooks.remove(bookTitle);
    }
}
