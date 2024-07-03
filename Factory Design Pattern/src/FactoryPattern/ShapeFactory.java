package FactoryPattern;

public class ShapeFactory {

    Shape getShape(String input){

        return switch (input) {
            case "CIRCLE" -> new Circle();
            case "RECTANGLE" -> new Rectangle();
            case "SQUARE" -> new Square();
            default -> null;
        };
    }
}
