import java.util.Scanner;

public class sumColum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[5][5];

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("Enter array element " + i + "-" + j + ": ");
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("Mảng 2 chiều của bạn: ");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("Nhập cột bạn muốn tính tổng (từ 0 - 4): ");
        int n = sc.nextInt();
        if (n >= 0 && n < 5) {
            int total = 0;
            for (int i = 0; i < arr.length; i++) {
                total += arr[i][n];
            }
            System.out.println("Tổng của cột " + n + " là: " + total);
        } else {
            System.out.println("Cột không hợp lệ. Vui lòng nhập từ 0 đến 4.");
        }
    }
}
