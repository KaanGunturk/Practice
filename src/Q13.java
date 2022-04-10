import java.util.Arrays;

public class Q13 {
    /*
		 TASK :
		 $ ve  £  isareti olanlarin toplamlarini ayri ayri bulup yazdıran java code create ediniz.

        String str = "$1 $23 $134 $2 $7 $24 £32 £40 £2 £65 £4 ";
        */

    public static void main(String[] args) {
        String str = "$1 $23 $134 $2 $7 $24 £32 £40 £2 £65 £4 ";
        String[]arr=str.split(" ");
        System.out.println(Arrays.toString(arr));

        int dolar=0;
        int euro=0;
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i].contains("$")){
                dolar+=Integer.parseInt(arr[i].replace("$",""));

            }else{
                euro+= Integer.parseInt((arr[i]).replace("£", ""));
            }
        }
        System.out.println("dolar toplami: " + dolar);
        System.out.println("euro toplami:" + euro);
    }
}
