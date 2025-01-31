import java.util.Scanner;

public class Student {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size;
        int[] points;
        do {
            System.out.println("Nhập số lượng học sinh: ");
            size = sc.nextInt();
            if (size < 0 || size > 30) {
                System.out.println("Số lượng không hợp lệ!");
            }
        } while (size < 0 || size > 30);
        points = new int[size];
        int i = 0;
        while (i < size) {
            do {
                System.out.println("Nhập điểm học sinh thứ " + (i + 1) + ": ");
                points[i] = sc.nextInt();
                if (points[i] < 0 || points[i] > 10) {
                    System.out.println("Nhập đúng điểm!");
                }
            } while (points[i] < 0 || points[i] > 10);
            i++;
        }
        System.out.println("Danh sách điểm: ");
        for (i = 1; i <= size; i++) {
            System.out.print(i + "\t");
        }
        System.out.println("\n");
        for(i=0; i<size; i++) {
            System.out.print("-\t");
        }
        System.out.println("\n");
        for (i = 0; i < points.length; i++) {
            System.out.print(points[i] + "\t");
        }
        int count = 0;
        for (int j = 0; j < points.length; j++) {
            if (points[j] > 5) {
                count++;
            }
        }
        System.out.println("\nSố lượng học sinh đạt là:  " + count);
    }
}
