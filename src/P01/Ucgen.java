package P01;

public class Ucgen {

    double kenar1;
    double kenar2;
    double kenar3;

    public Ucgen(double kenar1, double kenar2, double kenar3) {
        if (!this.ucgenKontrol(kenar1,kenar2,kenar3)){
            throw new RuntimeException("Girdiginiz degerlerle bir ucgen olusturulamaz");
        }


        this.kenar1 = kenar1;
        this.kenar2 = kenar2;
        this.kenar3 = kenar3;
    }

    public boolean ucgenKontrol(double kenar1, double kenar2, double kenar3){

        if (kenar1+kenar2>kenar3 && kenar2+kenar3>kenar1 && kenar1+kenar3>kenar2 &&
            Math.abs(kenar1-kenar2)<kenar3 && Math.abs(kenar2-kenar3)<kenar1 && Math.abs(kenar1-kenar3)<kenar2){
            return true;
        }
        return false;
    }
}
