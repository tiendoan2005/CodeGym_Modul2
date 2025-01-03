import java.util.Scanner;

public class LinearEquationResolver {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("___ax+b=0___");
        System.out.print("Enter a: ");
        int a = Integer.parseInt(sc.next());
        System.out.print("Enter b: ");
        int b = Integer.parseInt(sc.next());
        if (a == 0) {
            if (b == 0) {
                System.out.println("Phương trình vô số nghiệm!");
            } else {
                System.out.println("Phương trình vô nghiệm");
            }
        } else {
            double x = (double) -b / a;
            System.out.println("Phương trình có nghiệm: " + x);
        }
    }
}
