import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Enter size: ");
            size = sc.nextInt();
            if (size <= 0 || size > 20) {
                System.out.println("Invalid size");
            }
        } while (size > 20);
        array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
        System.out.println("Mảng đã nhập vào: ");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
        System.out.println("\n");
        System.out.println("Mảng sau khi reverse: ");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }
    }
}
