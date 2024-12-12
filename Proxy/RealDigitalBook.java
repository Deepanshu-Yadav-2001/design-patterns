public class RealDigitalBook implements DigitalBook {
    private final Book book;

    public RealDigitalBook(Book book) {
        this.book = book;
    }

    @Override
    public void read(User user) {
        System.out.printf("User %s is reading book %s.%n", user.getId(), book.getTitle());
    }

    @Override
    public void download(User user) {
        System.out.printf("User %s is downloading book %s.%n", user.getId(), book.getTitle());
        System.out.println(book.getContent());
    }
}
