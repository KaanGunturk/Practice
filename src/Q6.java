import java.util.Arrays;
import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen arr boyutunu giriniz");
        int arrBoyut= scan.nextInt();

        int[] arr=new int[arrBoyut];

        for (int i = 0; i <arr.length ; i++) {
            System.out.println("arrayin " +(i+1) + ". elemanini giriniz");
            arr[i]=scan.nextInt();
        }
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println("Arr en buyuk degeri: " + arr[arrBoyut-1] +  " en kucuk degeri: " + arr[0]);
    }
}
