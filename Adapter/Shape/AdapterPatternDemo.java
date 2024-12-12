package Shape;

public class AdapterPatternDemo {
    public static void main(String[] args) {
        DrawingApp drawingApp = new DrawingApp();

        drawingApp.draw("rectangle");
        drawingApp.draw("circle");
        drawingApp.draw("triangle");
    }
}