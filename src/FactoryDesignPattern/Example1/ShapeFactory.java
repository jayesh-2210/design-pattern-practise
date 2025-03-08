package FactoryDesignPattern.Example1;

public class ShapeFactory {

    Shape shape;

    public Shape getShape(String shapeType) {
        switch (shapeType) {
            case "CIRCLE":
                shape = new Circle();
                break;
            case "RECTANGLE":
                shape = new Rectangle();
                break;
            case "SQUARE":
                shape = new Square();
                break;
            default:
                throw new IllegalArgumentException("Invalid shape type");
        }
        return shape;
    }

}
