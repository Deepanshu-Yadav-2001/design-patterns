package Shape;

public class DrawingApp implements Shape {
    ShapeAdapter shapeAdapter;

    @Override
    public void draw() {
        Rectangle rectangle = new Rectangle(5, 6);
        rectangle.draw();
    }

    public void draw(String shapeType) {
        if (shapeType.equalsIgnoreCase("rectangle")) {
            draw();
        } else if (shapeType.equalsIgnoreCase("circle")) {
            shapeAdapter = new ShapeAdapter(new Circle(5));
            shapeAdapter.draw();
        } else {
            System.out.println("Invalid shape type. " + shapeType + " not supported");
        }
    }
}
