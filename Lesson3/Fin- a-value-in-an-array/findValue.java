import java.util.*;

public class findValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arr = new String[4];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter number " + (i + 1) + ": ");
            arr[i] = sc.nextLine();
        }
        System.out.println("Mảng tên của bạn là: ");
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + " ");
        }
        System.out.println("\n");
        System.out.println("Nhập tên bạn muốn tìm");
        String s = sc.nextLine();
        boolean flag = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(s)) {
                flag = true;
                System.out.println("Tên bạn muốn tìm ở vị trí thứ " + i);
            }
        }
        if (!flag) {
            System.out.println("Không tìm thấy " + s);        }
    }
}
