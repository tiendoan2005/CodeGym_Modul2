public class TestCylinder {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder();
        cylinder.setRadius(5);
        cylinder.setHeight(10);
        cylinder.setColor("Blue");
        cylinder.getArea();
        cylinder.getVolume();
        System.out.println(cylinder);
        System.out.println("Area = " + cylinder.getArea());
        System.out.println("Volume = " + cylinder.getVolume());
    }
}
