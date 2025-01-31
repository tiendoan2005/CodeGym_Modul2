import java.util.Scanner;
public class Geometry {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choise = -1;
        while (choise != 0) {
            System.out.println("1. Draw Triangle");
            System.out.println("2. Draw Rectangle");
            System.out.println("3. Draw Square");
            System.out.println("0. Exit");
            System.out.println("Enter your choice: ");
            choise = sc.nextInt();
            System.out.println("No choice!");
            switch (choise) {
                case 1:
                    for (int i = 0; i <= 5; i++) {
                        for (int j = 1; j <= i; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;
                    case 2:
                        for(int i = 0; i <= 5; i++){
                            for(int j = 0; j <= 20; j++){
                                System.out.print("*");
                            }
                            System.out.println();
                        }
                        break;
                        case 3:
                            for(int i = 0; i <= 5; i++){
                                for(int j = 0; j <= 15; j++){
                                    System.out.print("*");
                                }
                                System.out.println();
                            }
                            break;
            }
        }
    }
}
