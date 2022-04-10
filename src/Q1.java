import java.util.Scanner;

public class Q1 {

    public static void main(String[] args) {

        //Write a Java program to get a number from the user and print whether it is positive or negative

        Scanner scan =new Scanner(System.in);
        System.out.println("Please input a number");
        int sayi= scan.nextInt();

        if (sayi>0){
            System.out.println("number is positive");
        }else if(sayi<0) {
            System.out.println("number is negative");
        }else {
            System.out.println("number is zero");
        }
    }
}
