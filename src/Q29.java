import java.util.Scanner;

public class Q29 {
     /*
            How many times a given number is repeated in a sequence
            Create the Java program that finds it.
     */
     public static void main(String[] args) {

          int arr [] = {1,1,1,22,23,85,58,77,66,22,23,77};

          int count=0;
          Scanner scanner= new Scanner(System.in);
          System.out.println("input a number");
          int num= scanner.nextInt();

          for (int i = 0; i <arr.length ; i++) {
               if (num==arr[i]){
                    count++;
               }
          }
          System.out.println("number : " + num + "repeat : " + count);
     }
}
