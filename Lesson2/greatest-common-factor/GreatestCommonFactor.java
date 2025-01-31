import java.util.Scanner;

public class GreatestCommonFactor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int a = sc.nextInt();
        a = Math.abs(a);
        System.out.println("Enter the second number: ");
        int b = sc.nextInt();
        b = Math.abs(b);
        if(a==0 && b==0){
            System.out.println("Không có UCLN");
        }else{
            while (a != b) {
                if (a > b)
                    a = a - b;
                else
                    b = b - a;
            }
            System.out.println("Greatest Common Factor is: " + a);
        }
    }
}
