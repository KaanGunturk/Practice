package P04_Okul;

import java.util.ArrayList;

public class Ogrenci extends SchoolMember{

    private String no;
    private int sinif;



    public Ogrenci(String adSoyad, String kimlikNo, int yas , String no , int sinif) {
        super(adSoyad, kimlikNo, yas);
        this.no=no;
        this.sinif=sinif;
    }


    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public int getSinif() {
        return sinif;
    }

    public void setSinif(int sinif) {
        this.sinif = sinif;
    }


}
