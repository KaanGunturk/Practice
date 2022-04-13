import java.util.Arrays;
import java.util.Scanner;

public class Q21 {
    public static void main(String[] args) {

      /*
        Given String array

        reverse the String array

        print the reversed array

        NOTE: While printing the array dont use for loop
        Use Arrays.toString(your_array_name);
     */

        Scanner scanner=new Scanner(System.in);
        String str= scanner.nextLine();

        String[] newStr=str.split(" ");

        String[] reverseStr= new String[newStr.length];

        int counter=0;


        for (int i = newStr.length-1 ; i>=0 ; i--) {
                reverseStr[counter++]=newStr[i];
        }
        System.out.println(Arrays.toString(reverseStr));
    }
}
