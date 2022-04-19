import java.util.Scanner;

public class Q30 {
    /*
    Ask user to enter 2 integer then find GCD (Greatest Common Divisor) and LCM (Least Common Multiple)

Input :

30 and 40

Expected OutPut:

GCD for 30 and 40 = 10

LCM for 30 and 40 = 120
     */

    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);
        System.out.println("input number 1");
        int num1=scanner.nextInt();
        System.out.println("input number 2");
        int num2=scanner.nextInt();
        int gcd=0;


            for (int i = 0; i <=num2 ; i++) {
                if (num1 % i ==0 && num2 % i ==0){
                    gcd=i;
                }
            }

        System.out.println(gcd);
    }
}
