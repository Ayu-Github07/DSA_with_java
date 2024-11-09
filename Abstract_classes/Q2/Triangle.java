package Abstract_classes.Q2;

public class Triangle extends Shape {

    int side1;
    int side2;
    int side3;

    Triangle(int side1, int side2, int side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    @Override
    void calculateArea() {

        int s = (side1 + side2 + side3) / 2;
        this.area = (float) (Math.sqrt(s * (s - side1) * (s - side2) * (s - side3)));
        System.out.println("Area of the triangle is: - " + this.area);

    }

    @Override
    void calculatePerimeter() {
        this.parimeter = side1 + side2 + side3;
        System.out.println("Perimeter of the triangle is: - " + this.parimeter);
    }

}
