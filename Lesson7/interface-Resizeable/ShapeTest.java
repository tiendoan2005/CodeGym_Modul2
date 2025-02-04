public class ShapeTest {
    public static void main(String[] args) {

        Circle circle = new Circle(5.0);
        Rectangle rectangle = new Rectangle(4.0, 6.0);

        System.out.println("Before resizing:");
        System.out.println(circle);
        System.out.println(rectangle);

        double percent = 50.0;
        circle.resize(percent);
        rectangle.resize(percent);

        System.out.println("\nAfter resizing by " + percent + "%:");
        System.out.println(circle);
        System.out.println(rectangle);
    }
}
