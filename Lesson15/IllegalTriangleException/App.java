import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Nhập cạnh a: ");
            double a = scanner.nextDouble();
            System.out.print("Nhập cạnh b: ");
            double b = scanner.nextDouble();
            System.out.print("Nhập cạnh c: ");
            double c = scanner.nextDouble();

            TriangleValidator.checkTriangle(a, b, c);
            System.out.println("Ba cạnh nhập vào tạo thành một tam giác hợp lệ.");
        } catch (IllegalTriangleException e) {
            System.out.println("Lỗi: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Lỗi: Vui lòng nhập số hợp lệ.");
        }
    }
}
