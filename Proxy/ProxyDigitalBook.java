public class ProxyDigitalBook implements DigitalBook {
    private final Book book;
    private RealDigitalBook realDigitalBook;

    public ProxyDigitalBook(Book book) {
        this.book = book;
        this.realDigitalBook = null;
    }

    @Override
    public void read(User user) {
        if (!hasPermission(user, book)) {
            System.out.println("User doesn't have the permission to read the book");
            return;
        }
        if (realDigitalBook == null) {
            realDigitalBook = new RealDigitalBook(book);
        }
        realDigitalBook.read(user);
    }

    @Override
    public void download(User user) {
        if (!hasPermission(user, book)) {
            System.out.println("User doesn't have the permission to download the book");
            return;
        }
        if (realDigitalBook == null) {
            realDigitalBook = new RealDigitalBook(book);
        }
        realDigitalBook.download(user);
    }

    private boolean hasPermission(User user, Book book) {
        return user.getPermittedBooks().stream().anyMatch(title -> title.equalsIgnoreCase(book.getTitle()));
    }
}
