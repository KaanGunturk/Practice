public class Q4 {
    public static void main(String[] args) {

        //Write a Java program to test if an array contains a specific value

        int[]arr={6,4,7};

        int sum=0;
        double avarage=0;

        for (int i = 0; i <arr.length ; i++) {
            sum+=arr[i];
        }
        avarage=sum/arr.length;
        System.out.println(avarage);
    }
}
