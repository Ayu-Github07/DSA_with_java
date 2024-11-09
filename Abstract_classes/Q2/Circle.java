package Abstract_classes.Q2;

public class Circle extends Shape {

    float radius;

    Circle(float radius) {
        this.radius = radius;
    }

    @Override
    void calculateArea() {
        this.area = (float) (Math.PI * Math.pow(radius, 2));
        System.out.println("Area of the circle is: - " + this.area);
    }

    @Override
    void calculatePerimeter() {
        this.parimeter = (float) (4 * Math.PI * radius);
        System.out.println("Perimeter of the circle is: - " + this.parimeter);
    }

}
