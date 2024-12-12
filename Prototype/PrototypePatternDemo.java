public class PrototypePatternDemo {
    public static void main(String[] args) {
        // Create a ScienceBook
        Book scienceBook = new Book("Physics Fundamentals", "John Doe", "1234567890", "Science");
        System.out.println(scienceBook);

        // Clone the ScienceBook to create a PhysicsBook
        Book physicsBook = scienceBook.clone();
        physicsBook.setTitle("Advanced Physics");
        physicsBook.setAuthor("Jane Smith");
        physicsBook.setISBN("0987654321");
        System.out.println(physicsBook);
    }
}