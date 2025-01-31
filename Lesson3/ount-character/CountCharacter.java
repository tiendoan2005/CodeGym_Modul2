import java.util.Scanner;

public class CountCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arr;
        int size;
        System.out.print("Nhập số lượng ký tự: ");
        size = sc.nextInt();
        arr = new String[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Nhập ký tự thứ " + (i + 1) + " :");
            arr[i] = sc.next();
        }
        System.out.println("Mảng ký tự bạn vừa nhập: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("\nNhập ký tự của bạn: ");
        String charactor = sc.next();
        int count = 0;
        boolean flag = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(charactor)) {
                count++;
                flag = true;
            }
        }
        if (flag) {
            System.out.println("Số lượng ký tự " + charactor + " là: " + count);
        } else {
            System.out.println("Ký tự không xuất hiện trong mảng!");
        }
    }
}
