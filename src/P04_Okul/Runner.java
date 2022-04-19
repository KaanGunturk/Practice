package P04_Okul;

public class Runner {
    public static void main(String[] args) {

        Ogrenci ogrenci1=new Ogrenci("kagan gunturk","745390a",23,"285",4);
        Ogrenci ogrenci2=new Ogrenci("furkan ekici","745390b",23,"285",4);
        Ogrenci ogrenci3=new Ogrenci("Mertu ","745390b31",18,"285",4);

        OgrenciManager ogrenciManager=new OgrenciManager();
        ogrenciManager.add(ogrenci1);
        ogrenciManager.add(ogrenci2);
        ogrenciManager.add(ogrenci3);

        ogrenciManager.list();
    }
}
