package P04_Okul;

import java.util.ArrayList;

public class OgrenciManager  {

    ArrayList<Ogrenci> ogrenciler=new ArrayList<>();


    public void add(SchoolMember schoolMember) {
        ogrenciler.add((Ogrenci) schoolMember);
    }


    public boolean search(String kimlikNo) {
        for(Ogrenci ogrenci:ogrenciler){
            if (ogrenci.getKimlikNo().equals(kimlikNo))
                return true;
        }
        return false;
    }


    public void delete(String kimlikNo) {
        for (Ogrenci ogrenci:ogrenciler){
            if (search(ogrenci.getKimlikNo())){
                ogrenciler.remove(ogrenci);
            }
        }
    }


    public void list() {
        for (Ogrenci ogrenci:ogrenciler) {
            System.out.println(ogrenci.getAdSoyad());
        }
    }
}
