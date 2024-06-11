package zadanie5;

public class ShapeFactory {

    public Shape createShape(String shapeType, double size1, double size2) {
        if (shapeType == null) {
            return null;
        }
        if (shapeType.equalsIgnoreCase("CIRCLE")) {
            return new Circle(size1);
        } else if (shapeType.equalsIgnoreCase("SQUARE")) {
            return new Square(size1);
        } else if (shapeType.equalsIgnoreCase("TRIANGLE")) {
            return new Triangle(size1, size2);
        }
        return null;
    }
}