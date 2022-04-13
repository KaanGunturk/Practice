import java.util.ArrayList;
import java.util.Arrays;

public class Q25 {
    /*
   Problem Tanımı :
   getSum isminde bir method oluşturun.
   Parametresi ArrayList'tir.
   Dizideki tüm $ ları kaldır ve tüm sayıları topla
   return yaptğımız veri tipi 'int' olmalıdır.
   sonuç 0'dan küçükse, -1 yazdırın.

   Örnek1:
   ArrayList = $13, $15, $20
   Cevap = 48 olmalı

   Örnek 2 :
   ArrayList= $-13, $0, $0
   Cevap = -1 olmalı.
    */

    public static void main(String[] args) {

        ArrayList<String> arrayList=new ArrayList<>(Arrays.asList("$13", "$14", "$58"));

        getSum(arrayList);


    }

    private static void getSum(ArrayList<String> arrayList) {

        int sum=0;

        for (String each:arrayList) {
            String str=each.replace("$","");

            sum+=Integer.parseInt(str);
        }
        System.out.println(sum);

    }
}
