public class TestCircle {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.setRadius(20);
        circle.setColor("green");
        circle.getArea();
        System.out.println(circle);
        System.out.println("Area = " + circle.getArea());
    }
}
