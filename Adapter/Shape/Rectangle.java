package Shape;

public class Rectangle implements Shape {
    private final int length;
    private final int width;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public void draw() {
        System.out.printf("Drawing a rectangle of length %s and width %s.%n", length, width);
    }
}
