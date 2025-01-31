import java.util.Scanner;

public class ConvertTemperature {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double fahrenheit;
        double celsius;
        int choice;
        do {
            System.out.println("---Chuyển đổi---");
            System.out.println("1. Chuyển độ C->F");
            System.out.println("2. Chuyển độ F->C");
            System.out.println("0. Exit");
            System.out.println("Enter your choice");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Chuyển C sang F");
                    System.out.println("Nhập vào độ C: ");
                    celsius = sc.nextDouble();
                    System.out.println("Độ F sau khi chuyển: " + celiusToFahrenheit(celsius));
                    break;
                case 2:
                    System.out.println("Chuyển F sang C");
                    System.out.println("Nhập vào độ F: ");
                    fahrenheit = sc.nextDouble();
                    System.out.println("Độ F sau khi chuyển: " + fahrenheitToCelius(fahrenheit));
                    break;
                case 0:
                    System.out.println("End!");
                    break;
            }
        } while (choice != 0);
    }
        public static double celiusToFahrenheit ( double celsius){
            double fahrenheit = (celsius * 9 / 5) + 32;
            return fahrenheit;
        }

        public static double fahrenheitToCelius ( double fahrenheit){
            double celsius = (fahrenheit - 32) * 5 / 9;

            return celsius;
        }
    }
