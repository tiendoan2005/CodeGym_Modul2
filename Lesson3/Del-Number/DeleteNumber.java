import java.util.Scanner;

public class DeleteNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter quantity number: ");
        int num = sc.nextInt();
        int[] arr = new int[num];

        for (int i = 0; i < num; i++) {
            System.out.println("Enter number " + (i + 1) + ":");
            arr[i] = sc.nextInt();
        }
        System.out.println("Mảng của bạn: ");
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + " ");
        }
        System.out.println("\n");
        System.out.println("Nhập phần tử cần xóa: ");
        int a = sc.nextInt();
        boolean flag = false;
        int index = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == a) {
                flag = true;
                index = i;
                break;
            }
        }

        if (flag) {
            int[] newArr = new int[arr.length - 1];
            for (int i = 0; i < index; i++) {
                newArr[i] = arr[i];
            }
            for (int i = index + 1; i < arr.length; i++) {
                newArr[i - 1] = arr[i];
            }
            System.out.println("Mảng sau khi xóa phần tử " + a + " là: ");
            for (int j = 0; j < newArr.length; j++) {
                System.out.print(newArr[j] + " ");
            }
        } else {
            System.out.println("Phần tử không xuất hiện trong mảng.");
        }
    }
}
