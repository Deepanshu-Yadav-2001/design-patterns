package Shape;

public class Circle implements AdvancedShape {
    private final int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public void drawCircle() {
        System.out.println("Drawing a circle of radius " + radius);
    }
}
