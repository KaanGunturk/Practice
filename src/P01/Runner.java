package P01;

import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {

        /*
        Scanner scanner=new Scanner(System.in);
        System.out.println("Karenin kenar uzunlugunu giriniz");
        double kenar=scanner.nextDouble();

        Kare kare=new Kare(kenar);

        System.out.println(kare.dikdortgenAlan());


        System.out.println("Cemberin yarıcap uzunlugunu giriniz");
        double yaricap=scanner.nextDouble();

        Cember cember=new Cember(yaricap);

        System.out.println(cember.alanHesapla());

        System.out.println("Dikdortgen kisakenar uzunkenarini giriniz");
        double kisaKenar=scanner.nextDouble();
        double uzunKenar=scanner.nextDouble();

        Dikdortgen dikdortgen=new Dikdortgen(kisaKenar,uzunKenar);

        System.out.println(dikdortgen.dikdortgenAlan());


         */
        try {
            Ucgen ucgen=new Ucgen(5,4,50);
        } catch (Exception e) {
            e.getMessage();
        }
    }
}
