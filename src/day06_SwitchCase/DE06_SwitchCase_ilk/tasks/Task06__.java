package day06_SwitchCase.DE06_SwitchCase_ilk.tasks;

import java.util.Scanner;

public class Task06__ {

    public static void main(String[] args) {
        //Task-> Girilen  VIP (Very Important Person) kisaltmasindaki harflerin anlamini print eden code create ediniz
        // bu harflerden(v,i,p) biri girilecek ve çıktı olarak uzun hali(Very, Important, Person) yazacak



        String vip="VIP";
        System.out.println(vip);
        Scanner scanner=new Scanner(System.in);
        System.out.println("Merak ettiğiniz harfin anlamını öğrenmek için lütfen giriş yapınız:");

        char c=scanner.next().toLowerCase().charAt(0);
        switch (c) {
            case 'v':
                System.out.println("Very");
                break;
            case 'i':
                System.out.println("Important");
                break;
            case 'p':
                System.out.println("Person");
                break;
            default:
                System.out.println("Böyle bir harf içermemektedir.");


//=====================================================asagida===


                Scanner scan = new Scanner(System.in);
                System.out.println("bir harf giriniz : ");
                String harf1 = scan.next();
                System.out.println("ikinci harfi giriniz : ");
                String harf2 = scan.next();
                System.out.println("ucuncu harfi giriniz : ");
                String harf3 = scan.next();


        }    }
}
