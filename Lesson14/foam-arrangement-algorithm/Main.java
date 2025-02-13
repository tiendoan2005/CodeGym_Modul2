import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào kích thước mảng số nguyên: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Nhập vào " + arr.length + " phân tử: ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Mảng của bạn: ");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("Bắt đầu sắp xếp......");
        BubbleSortByStep.bubbleSortByStep(arr);
        System.out.println("Mảng sau khi sắp xếp: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
