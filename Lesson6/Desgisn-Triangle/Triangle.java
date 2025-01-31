public class Triangle extends Shape {
    private double side1;
    private double side2;
    private double side3;
    private String color;

    public Triangle() {
        this.side1 = 1.0;
        this.side2 = 1.0;
        this.side3 = 1.0;
        this.color = "unknown";
    }

    public Triangle(double side1, double side2, double side3, String color) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        this.color = color;
    }

    public double getSide1() {
        return side1;
    }

    public double getSide2() {
        return side2;
    }

    public double getSide3() {
        return side3;
    }
    public String getColor() {
        return color;
    }

    public double getArea() {
        double s = getPerimeter() / 2;  // Nửa chu vi
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    public double getPerimeter() {
        return side1 + side2 + side3;
    }

    @Override
    public String toString() {
        return "Triangle[color=" + color + ", side1=" + side1 + ", side2=" + side2 + ", side3=" + side3 + "]";
    }
}
