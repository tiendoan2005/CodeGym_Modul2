import java.util.Scanner;
public class Rectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter width: ");
        float width = sc.nextFloat();
        System.out.print("Enter height: ");
        float height = sc.nextFloat();
        double area = width * height;
        System.out.println("Area is " + area);
    }

}
