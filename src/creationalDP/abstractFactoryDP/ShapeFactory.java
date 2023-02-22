package creationalDP.abstractFactoryDP;

public class ShapeFactory extends AbstractFactory {


    @Override
    Color getColor(String color) {
        return null;
    }

    @Override
    public Shape getShape(String shapeType) {
        if(shapeType==null)
            return null;
        if(shapeType.equalsIgnoreCase("rectangle") || shapeType.equalsIgnoreCase("dikdörtgen"))
            return new Rectangle();
        else if(shapeType.equalsIgnoreCase("square"))
            return new Square();
        else if(shapeType.equalsIgnoreCase("circle"))
            return new Circle();

        return null;
    }
}
