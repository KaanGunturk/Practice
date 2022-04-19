import java.util.Scanner;

public class Q28 {
     /*
        Type java code by using while loop,
       Write a program to count the factors of an integer which is entered by user.
       Factors of 12 = 1, 2, 3, 4, 6, 12 ==> 6
       Factors of 8  = 1, 2, 4, 8 ==> 4
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Sayi giriniz");
        int sayi=Math.abs(scanner.nextInt());

        int carpan=1;
        int count =0;

        while (carpan<=sayi){
            if (sayi%carpan==0){
                count++;

            }
            carpan++;
        }
        System.out.println("sayinin carpan sayisi : " + count);

    }

}
