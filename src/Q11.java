import java.util.Arrays;

public class Q11 {
    public static void main(String[] args) {
        int[] arr = {100, 10001, -90, 845, 8787, 898, 0, 1, -90};

        Arrays.sort(arr);

        int min=arr[0];
        int max=arr[arr.length-1];

        System.out.println("min value" + min + "max value " + max);
    }
}
