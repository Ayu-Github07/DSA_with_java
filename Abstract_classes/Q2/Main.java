package Abstract_classes.Q2;

/**
 * Write a Java program to create an
 * abstract class Shape with
 * abstract methods calculateArea()
 * 
 * and calculatePerimeter(). Create subclasses Circle and Triangle that extend
 * the Shape class and implement the respective methods to calculate the area
 * and perimeter of each shape.
 **/

public class Main {

    public static void main(String[] args) {

        float r = 4.0f;
        Circle circle = new Circle(r);
        int ts1 = 3, ts2 = 4, ts3 = 5;
        Triangle triangle = new Triangle(ts1, ts2, ts3);

        circle.calculateArea();
        circle.calculatePerimeter();

        triangle.calculateArea();
        triangle.calculatePerimeter();

    }

}
