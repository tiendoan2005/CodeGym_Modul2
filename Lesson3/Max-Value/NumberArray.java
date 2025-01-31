import java.util.Scanner;

public class NumberArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr;
        int size;
        System.out.println("Nhập số lượng phần tử bạn muốn: ");
        size = sc.nextInt();
        if (size <= 0 || size > 20) {
            System.out.println("Vui lòng nhập đúng số lượng!");
        } else {
            arr = new int[size];
            for (int i = 0; i < size; i++) {
                System.out.println("Nhập vào số thứ " + (i + 1));
                arr[i] = sc.nextInt();
            }
            System.out.println("Mảng của bạn là: ");
            for (int j = 0; j < size; j++) {
                System.out.print(arr[j] + " ");
            }
            System.out.println("\n");
            int max = arr[0];
            for (int i = 0; i < arr.length; i++) {
                if(arr[i] > max){
                    max = arr[i];
                }
            }
            System.out.println("Số lớn nhất trong mảng là: " + max);

        }

    }
}
