import java.util.ArrayList;

public class ShapeCalculator {
    public static void main(String[] args){
        Shape circle = new Circle(10, "purple");
        Shape rectangle = new Rectangle(5,5,"black");
        Shape triangle = new Triangle(10,5, "pink");


        ArrayList<Shape> shapes = new ArrayList<>();

        shapes.add(circle);
        shapes.add(rectangle);
        shapes.add(triangle);

        for(Shape shape : shapes){
            System.out.printf("The area of the %s is: %.2f\n",shape, shape.calculateArea());
        }
    }
}
