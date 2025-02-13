import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào số lượng phần tử: ");
        int size = sc.nextInt();
        int[] arr = new int[size];

        System.out.println("Nhập vào " + arr.length + " phần tử cần sắp xếp: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Danh sách phần tử của bạn: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println("\nBắt đầu sắp xếp chèn...");
        InsertionSort.insertionSort(arr);

        System.out.println("Mảng sau khi sắp xếp:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}
