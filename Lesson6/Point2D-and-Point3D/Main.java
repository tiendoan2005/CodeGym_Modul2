public class Main {
    public static void main(String[] args) {
        Point2D point2D = new Point2D(3.5f, 4.2f);
        System.out.println("Point2D: " + point2D);

        point2D.setXY(1.1f, 2.2f);
        System.out.println("Updated Point2D: " + point2D);

        Point3D point3D = new Point3D(1.0f, 2.0f, 3.0f);
        System.out.println("Point3D: " + point3D);

        point3D.setXYZ(4.4f, 5.5f, 6.6f);
        System.out.println("Updated Point3D: " + point3D);
    }
}
