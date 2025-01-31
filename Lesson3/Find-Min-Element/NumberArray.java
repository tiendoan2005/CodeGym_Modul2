import java.util.Scanner;

public class NumberArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr;
        System.out.println("Nhập số lượng phần tử: ");
        int n = sc.nextInt();
        arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Nhập phần tử thứ " + (i + 1));
            arr[i] = sc.nextInt();
        }
        System.out.println("Mảng bạn vừa nhập: ");
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + " ");
        }
        System.out.println("\n");
        int index = minValue(arr);
        System.out.println("Số phần tử nhỏ nhất trong mảng là: " + arr[index]);
    }

    public static int minValue(int[] array) {
        int index = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[index]) {
                index = i;
            }
        }
        return index;
    }
}
