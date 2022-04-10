public class Q2 {
    public static void main(String[] args) {

        // Write a Java program to sum values of an array.

        int [] arr= {2, 5, 6, 7, 8, 9, 1, 5};

        int sum=0;

        for (int i = 0; i <arr.length ; i++) {
            sum+=arr[i];
        }
        System.out.println("sayilar toplami" + sum);

    }
}
