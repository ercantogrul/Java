package asya_hoca_.sorular_19_09;

import java.util.Scanner;

public class s9 {
    public static void main(String[] args) {
        //girilen 3 harfli kelimeyi tersten yan yana print eden code create ediniz
        //eğer girilen kelime tersten okunuşu ile aynı ise palindromdur yazın
        // ala ,ata, asa

        System.out.println("bir metin giriniz");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        if (str.length()<=3) {
            char c1 = str.charAt(0);
            char c2 = str.charAt(1);
            char c3 = str.charAt(2);
            if (c1==c3) {
                System.out.println("palindromdur");
            }else
                System.out.println("palindrom degildir.");
        }
        //=ikinci yontem=================================================
        Scanner scan = new Scanner(System.in);
        System.out.println("3 harfli kelime giriniz : ");
        String kelime = scan.nextLine();
        String kelime2 = kelime.substring(2,3)+kelime.substring(1,2) +kelime.substring(0,1);
        System.out.println("kelime2 = " + kelime2);

        if (kelime.equals(kelime2)){
            System.out.println("palindromdur");
        } else System.out.println("palindrom degildir.");

        //========ucuncu yöntem=============================================
        System.out.println(" kelime giriniz : ");  //abcd
        String str2 = scan.nextLine();
        int uz = str.length();
        System.out.println(uz);
        String  tersm="";

        for (int i = uz; i >0 ; i--) {
            tersm=(""+tersm +str.charAt(i-1));

        }
        System.out.println(tersm);

        if (tersm.equalsIgnoreCase(str2)) {
            System.out.println("palindromdur");

        }else System.out.println("palindrom degildir");






    }
}
