import java.util.Scanner;

public class AddNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println("Nhập vị trí bạn muốn thêm vào mảng: ");
        int n = sc.nextInt();
        System.out.println("Nhập số bạn muốn thêm vào mảng: ");
        int m = sc.nextInt();

        if (n < 0 || n > arr.length) {
            System.out.println("Vị trí không tồn tại.");
        } else {
            int[] newArr = addToArray(arr, n, m);
            System.out.println("Mảng của bạn sau khi thêm là:");
            for (int num : newArr) {
                System.out.print(num + " ");
            }
        }
    }

    public static int[] addToArray(int[] array, int position, int value) {
        int[] newArray = new int[array.length + 1];
        for (int i = 0; i < position; i++) {
            newArray[i] = array[i];
        }
        newArray[position] = value;
        for (int i = position; i < array.length; i++) {
            newArray[i + 1] = array[i];
        }

        return newArray;
    }
}
