import java.util.Scanner;

public class Q27 {
     /*
        create one int
        do while int is less than 100
        print the number
        increment by 5
        for example: 0   5   10  15  20
     */
     public static void main(String[] args) {
         int sayi=5;

         do {
             System.out.print(sayi + " ");
             sayi+=5;
         }while (sayi<100);
     }
}
