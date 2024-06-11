package zadanie5;

public class Main {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        // Tworzenie kół
        Shape circle = shapeFactory.createShape("CIRCLE", 5.0, 0);
        circle.draw();

        // Tworzenie kwadratów
        Shape square = shapeFactory.createShape("SQUARE", 4.0, 0);
        square.draw();

        // Tworzenie trójkątów
        Shape triangle = shapeFactory.createShape("TRIANGLE", 3.0, 4.0);
        triangle.draw();
    }
}
