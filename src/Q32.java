import java.util.Scanner;

public class Q32 {
    /*
     *	Using the Java language, have the function AdditivePersistence(num) take the parameter being passed which will always be a positive integer
     *	and return its additive persistence which is the number of times you must add the digits in num until you reach a single digit.
     *
     *	For example: if num is 2718 then your program should return 2 because 2 + 7 + 1 + 8 = 18 and 1 + 8 = 9 and you stop at 9.
     *
     *	Sample:-
     *		Input = 4	Output = 0
     *		Input = 19	Output = 1
     */

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        String num=scanner.next();
        getAdditivePersistence(num);
    }

    private static void getAdditivePersistence(String num) {

        int count   = 0;
        int total   = 0;

        while (num.length()>1){
            total = 0;
            for( int i = 0; i < num.length(); i++)
            {
                total+= Character.getNumericValue(num.charAt(i));
            }
            num = Integer.toString(total);

            count++;

        }
        System.out.println(num);
    }
}

