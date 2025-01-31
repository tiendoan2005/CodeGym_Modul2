import java.util.Scanner;
public class Printf {
    public static void main(String[] args) {
        int choice = -1;
        Scanner sc = new Scanner(System.in);
        while (choice != 0) {
            System.out.println("_____Menu_____");
            System.out.println("1. Print the rectangle");
            System.out.println("2. Print isosceles triangle");
            System.out.println("3. Print the square triangle (The corner is square at 4 different angles: top-left, top-right, botton-left, botton-right)");
            System.out.println("0. Exit");
            System.out.println("Enter your choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    for (int i = 0; i <=5; i++) {
                        for (int j = 0; j<=20; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;
                    case 2:
                        for (int i = 0; i <=5; i++) {
                            for(int j=1;j<=i;j++) {
                                System.out.print("*");
                            }
                            System.out.println();
                        }
                        for (int i = 0; i <=5; i++) {
                            for(int j=1;j<=i-1;j++) {
                                System.out.print("");
                            }
                            for(int j=i;j<=5;j++) {
                                System.out.print("*");
                            }
                            System.out.println();
                        }
                        break;
                        case 3:
                            for (int i = 0; i <=5; i++) {
                                for(int j=1;j<=i;j++) {
                                    System.out.print("*");
                                }
                                System.out.println();
                            }
                            System.out.println("\n");
                            for (int i = 1; i <= 5; i++) {
                                for (int j = 5; j > i; j--) {
                                    System.out.print(" ");
                                }
                                for (int j = 1; j <= i; j++) {
                                    System.out.print("*");
                                }
                                System.out.println();
                            }
                            System.out.println("\n");
                            for(int i=1; i<=5; i++) {
                                for(int j=5;j>=i;j--) {
                                    System.out.print("*");
                                }
                                System.out.println();
                            }
                            System.out.println("\n");
                            for(int i=1; i<=5; i++) {
                                for(int j=1;j<i;j++) {
                                    System.out.print(" ");
                                }
                                for (int j = 5; j >= i; j--) {
                                    System.out.print("*");
                                }
                                System.out.println();
                            }
                            break;
                            case 0:
                                System.out.println("Goodbye!");
                                break;

            }
        }
    }
}
