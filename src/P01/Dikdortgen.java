package P01;

public class Dikdortgen extends Sekil {

    double kisaKenar;
    double uzunKenar;

    public Dikdortgen(double kisaKenar, double uzunKenar) {
        this.kisaKenar = kisaKenar;
        this.uzunKenar = uzunKenar;
    }

    public double dikdortgenAlan(){
        double dikdortgenAlan=kisaKenar*uzunKenar;
        return dikdortgenAlan;
    }
}
