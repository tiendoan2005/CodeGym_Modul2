import java.util.Scanner;

public class MaxValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[5][5];

            for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.println("Enter array element " + i + "-" + j + ": ");
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("Mảng 2 chiều của bạn: ");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        int[] result = maxValue(arr);
        int maxNum = result[0];
        int maxRow = result[1];
        int maxCol = result[2];

        System.out.println("Giá trị lớn nhất trong mảng 2 chiều là: " + maxNum);
        System.out.println("Vị trí của nó: hàng " + maxRow + ", cột " + maxCol);
    }

    public static int[] maxValue(int[][] array) {
        int max = array[0][0];
        int maxRow = 0;
        int maxCol = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] > max) {
                    max = array[i][j];
                    maxRow = i;
                    maxCol = j;
                }
            }
        }

        return new int[]{max, maxRow, maxCol};
    }
}
