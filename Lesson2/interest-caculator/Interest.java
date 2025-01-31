import java.util.Scanner;

public class Interest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter số tiền gửi: ");
        double soTiengui = sc.nextDouble();
        System.out.println("Enter số tháng gửi: ");
        int soThanggui = sc.nextInt();
        System.out.println("Nhập lãi suất hàng tháng: ");
        double laiSuat = sc.nextDouble();
        double tong = 0;
        for (int i = 0; i < soThanggui; i++) {
            tong += soTiengui * (laiSuat/100)/12*soThanggui;
        }
        System.out.println("Số tền lãi: " + tong);
    }
}
