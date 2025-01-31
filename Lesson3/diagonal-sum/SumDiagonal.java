import java.util.Scanner;

public class SumDiagonal {
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
        int total1= 0;
        for (int i = 0; i < 5; i++) {
            total1 += arr[i][i];
        }
        System.out.println("Tổng đường chéo chính là: " + total1);
        int total2= 0;
        for (int i = 0; i < 5; i++) {
            total2 += arr[i][i]; total2 += arr[i][arr.length - 1 - i];
        }
        System.out.println("Tổng đường chéo phụ là: " + total2);
    }
}