import java.util.Scanner;
public class LeapYearCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the year: ");
        int year = Integer.parseInt(sc.nextLine());
        if(year % 4 == 0){
            if(year % 100 != 0){
                System.out.println("Là năm nhuận");
            }else{
                if(year % 400 == 0){
                    System.out.println("Là năm nhuận");
                }else{
                    System.out.println("Không phải năm nhuận!");
                }
            }
        }else{
            System.out.println("Không phải năm nhuận!");
        }
    }
}
