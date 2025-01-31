import java.util.Scanner;

public class MinValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số lượng phần tử: ");
        int size = sc.nextInt();
        int[] arr;
        if (size < 0) {
            System.out.println("Nhập đúng số lượng!");
        } else {
            arr = new int[size];
            for (int i = 0; i < size; i++) {
                System.out.println("Nhập phần tử thứ " + (i + 1));
                arr[i] = sc.nextInt();
            }
            System.out.println("Mảng của bạn vừa nhập: ");
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println("\n");
            int min = arr[0];
            for (int i = 1; i < arr.length; i++) {
                if (arr[i] < min) {
                    min = arr[i];
                }
            }
            System.out.print("Giá trị nhỏ nhất trong mảng: " + min);

        }
    }
}
