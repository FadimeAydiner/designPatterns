package creationalDP.factoryDP;

public class FactoryPatternDemo {
    public static void main(String[] args) {
        Shape circle1=new Circle();
        circle1.draw();

        Shape square1=new Square();
        square1.draw();

        Shape rectangle1=new Rectangle();
        rectangle1.draw();

        ShapeFactory shapeFactory=new ShapeFactory();
        Shape shape1=shapeFactory.getShape("rectangle");
        Shape shape2=shapeFactory.getShape("square");
        Shape shape3=shapeFactory.getShape("circle");
        Shape shape4=shapeFactory.getShape("dikdörtgen");
        shape1.draw();
        shape2.draw();
        shape3.draw();
        shape4.draw();


    }
}
