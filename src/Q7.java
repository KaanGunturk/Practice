import java.util.Arrays;

public class Q7 {
    public static void main(String[] args) {
        /* TASK :
        multidimensional arrayin iç array lerindeki tüm elemanların toplamını birer birer bulan
        ve herbir sonucu yeni bir arrayin elemanı yapan ve yeni array i ekrana yazdıran programı yaziniz.
        input {{10,20,30},{4},{6,7,20}}==> output ={60,4,33}

         */
        int arr1[][] = {{10, 20, 30}, {4}, {6, 7, 20}};
        int[] arrYeni=new int[arr1.length];

        for (int i = 0; i <arr1.length ; i++) {
            for (int j = 0; j < arr1[i].length ; j++) {
                arrYeni[i]+=arr1[i][j];
            }
            System.out.println(Arrays.toString(arrYeni));
        }
    }
}