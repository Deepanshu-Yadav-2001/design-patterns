package Shape;

public class ShapeAdapter implements Shape {
    private final AdvancedShape advancedShape;

    public ShapeAdapter(AdvancedShape advancedShape) {
        this.advancedShape = advancedShape;
    }

    @Override
    public void draw() {
        advancedShape.drawCircle();
    }
}
