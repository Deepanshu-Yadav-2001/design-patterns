import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class Library {
    private final Map<String, DigitalBook> books;

    public Library() {
        books = new HashMap<>();
    }

    public void addBook(Book book) {
        books.put(book.getTitle(), new ProxyDigitalBook(book));
    }

    public DigitalBook getBook(String title) {
        return Optional.ofNullable(books.get(title)).orElseThrow(
                () -> new RuntimeException("Book not found for title " + title)
        );
    }
}
