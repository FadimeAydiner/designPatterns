package creationalDP.factoryDP;

public class ShapeFactory {

    public Shape getShape(String shapeType){
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
