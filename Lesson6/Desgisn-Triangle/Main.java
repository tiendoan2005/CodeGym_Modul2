public class Main {
    public static void main(String[] args) {
        Triangle defaultTriangle = new Triangle();
        System.out.println("Default Triangle: " + defaultTriangle);
        System.out.println("Area: " + defaultTriangle.getArea());
        System.out.println("Perimeter: " + defaultTriangle.getPerimeter());

        Triangle customTriangle = new Triangle(3.0, 4.0, 5.0, "Black");
        System.out.println("Custom Triangle: " + customTriangle);
        System.out.println("Area: " + customTriangle.getArea());
        System.out.println("Perimeter: " + customTriangle.getPerimeter());
    }
}
