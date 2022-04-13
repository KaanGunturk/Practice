package P01;

public class Cember extends Sekil{

    double yariCap;
    final double PI=3.14;

    public Cember(double yariCap){
        this.yariCap=yariCap;
    }
    public double alanHesapla(){
        return PI*yariCap*yariCap;
    }
}
