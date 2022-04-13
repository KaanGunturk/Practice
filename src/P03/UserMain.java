package P03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class UserMain {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Kullanici adi ve sifre girinizi arada bir bosluk olacak sekilde giriniz.");
        String kullanici =scanner.nextLine();

        String[] kisi=kullanici.toString().split(" ");

        String userName=kisi[0];
        String password=kisi[1];

        ArrayList<String> account=new ArrayList();
        account.add(userName);
        account.add(password);

        User user=new User();
        user.setPassword(password);





    }
}