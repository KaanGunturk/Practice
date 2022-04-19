import java.util.Scanner;

public class Q31 {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("input a number");
        int number=scanner.nextInt();

        factorial(number);

    }


    private static int factorial(int number) {
        int factorial=1;

        for (int i = number; i>=1 ; i--) {
            factorial*=i;
            System.out.print(i+"*");
        }
        System.out.println("="+factorial);

        return factorial;
    }
}
