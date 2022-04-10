import java.util.Scanner;

public class Q19 {
    public static void main(String[] args) {
        /*

    Given an int array as a parameter
    return true if the array contains either 3 even or 3 odd values .

    for Example:

    intArray([2, 1, 3, 5]) result should be true
    intArray([2, 1, 2, 5]) result should be  false
    intArray([2, 4, 2, 5]) result should be  true

     */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir sayi dizisi giriniz");
        String str =scanner.nextLine();

        String[] strDizi=str.trim().split("[ ]+");
        int[] dizi= new int[strDizi.length];

        for (int i = 0; i <dizi.length ; i++) {
            dizi[i]=Integer.parseInt(strDizi[i]);
        }
        boolean sonuc=threeEvenorOdd(dizi);
        System.out.println(sonuc);
    }

    private static boolean threeEvenorOdd(int[] dizi) {

        int countE=0;
        int countO=0;

        for (int i = 0; i <dizi.length ; i++) {
            if (dizi[i] %2 ==0 ){
                countE++;
            }
            if (dizi[i]%2==1){
                countO++;
            }
            if (countE==3 || countO==3){
                return true;
            }
        }
        return false;
    }
}
