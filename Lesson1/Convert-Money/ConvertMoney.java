import java.util.Scanner;
public class ConvertMoney {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Giá VND hện nay là 25300");
        System.out.print("Nhập USD cần chuyển đổi: ");
        double usd = sc.nextDouble();
        double vnd = 25300;
        double kq = usd * vnd;
        System.out.println("KQ chuyển đổi: " + kq);
    }

}
