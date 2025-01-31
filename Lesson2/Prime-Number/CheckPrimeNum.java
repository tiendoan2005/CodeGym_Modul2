import java.util.Scanner;
public class CheckPrimeNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        if(num<2){
            System.out.println("Not a prime number");
        }else{
            int i=2;
            boolean flag=true;
            while(i<= Math.sqrt(num)){
                if(num%i==0){
                    flag=false;
                    break;
                }
                }
            if(flag){
                System.out.println("Prime number");
            }else{
                System.out.println("Not a prime number");
            }
        }
    }
}
