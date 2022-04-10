import java.util.Scanner;

public class Q20 {
     /*
            Given two string by using scanner class and add each other
            if first word last letter is same with second word first letter then remove one of them.

            Example: "abc", "cat" --> "abcat"
                   "abc", "dog"  -->"abcdog"
        */
     public static void main(String[] args) {

         Scanner scanner=new Scanner(System.in);
         String str= scanner.nextLine();

         String[] letter=str.split(" ");

         String s1=letter[0];
         String s2=letter[1];

         if (s1.substring(s1.length()-1).equals(s2.substring(0,1))){
             String s3=s1.replace(s1.substring(s1.length()-1),"");
             System.out.println(s3+s2);
         }else{
             System.out.println(s1+s2);
         }
     }

}
