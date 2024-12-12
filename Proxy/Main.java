public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        library.addBook(new Book(
                "Design Patterns",
                "Deepanshu Yadav",
                "This is the book for learning design patterns"));
        library.addBook(new Book(
                "Java Programming",
                "Deepanshu Yadav",
                "This is the book for learning Java"));

        User user = new User("user1");
        user.addBook("Design Patterns");

        DigitalBook book = library.getBook("Design Patterns");
        book.read(user);  // Should print "User user1 is reading book Design Patterns"

        book = library.getBook("Java Programming");
        book.read(user);  // Should print "User doesn't have the permission to read the book"
    }
}