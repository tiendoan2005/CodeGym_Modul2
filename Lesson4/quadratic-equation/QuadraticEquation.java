import java.util.Scanner;

public class QuadraticEquation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a, b, c;
        System.out.println("---ax2+bx+c=0---");
        System.out.print("Nhập a: ");
        a = sc.nextDouble();
        System.out.print("Nhập b: ");
        b = sc.nextDouble();
        System.out.print("Nhập c: ");
        c = sc.nextDouble();
        System.out.println("Phương trình của bạn: " + a + "x2 + " + b + "x2 + " + c);
        User user = new User();
        user.getValues(a, b, c);
        double delta = user.getDiscriminant();
        if (delta > 0) {
            System.out.println("Phương trình củabanjn có 2 nghiệm: x1 = " + user.getRoot1() + " và x2 = " + user.getRoot2());
        }else if(delta == 0) {
            System.out.println("Phương trình có 1 nghiệm duy nhất: x = "+user.getRoot3());
        }else{
            System.out.println("The equation has no roots");
        }

    }
}
