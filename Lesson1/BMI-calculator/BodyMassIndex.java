import java.util.Scanner;
public class BodyMassIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the weight: ");
        double weight= sc.nextDouble();
        System.out.print("Enter the height: ");
        double height= sc.nextDouble();
        double bmi = weight / Math.pow(height, 2);
        if(bmi < 18.5) {
            System.out.println("You are underweight");
        }else if(bmi >= 18.5 && bmi < 25) {
            System.out.println("You are normal");
        }else if(bmi >= 25 && bmi < 30) {
            System.out.println("You are overweight");
        }else if(bmi >= 30) {
            System.out.println("You are obese");
        }
    }
}
