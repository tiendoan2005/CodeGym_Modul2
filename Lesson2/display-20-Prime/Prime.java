import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số lượng số nguyên tố cần in: ");
        int n = sc.nextInt();

        int count = 0;
        int num = 2;

        while (count < n) {
            boolean isPrime = true;
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.print(num + " ");
                count++;
            }

            num++;
        }
    }
}
