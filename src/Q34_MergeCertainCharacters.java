import java.util.Scanner;

public class Q34_MergeCertainCharacters {
    /*
     * Kulanicidan alinan bir Stringin ilk ve son harfini yine kulanicidan alinan sayi kadar
     * return eden metod yaziniz
     *
     * ornek:  input            output
     *         elma  2           eaea
     *         army  3           ayayay

     */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Bir isim giriniz");
        String str=scan.nextLine();

        System.out.println("Bir sayi giriniz");
        int sayi= scan.nextInt();

        System.out.println(ilkSonHarf(str, sayi));


    }

    private static String ilkSonHarf(String str, int sayi) {

        String harfler=str.substring(0,1)+str.substring(str.length()-1);

        String sonuc="";

        for (int i = 0; i <sayi ; i++) {
            sonuc+=harfler;
        }
        return sonuc;
    }
}
