package asya_hoca_.codeShallenges03;

import java.util.Scanner;

public class s11_mantiksal_Operatorler {
    public static void main(String[] args) {
        //Input  int salary,int age, boolean isCreditCard
        //if salary bigger than 1000$ and age >24 than can be taken credit card

        Scanner scan = new Scanner(System.in);
        System.out.println("maasi giriniz");
        double maas = scan.nextDouble();
        System.out.println("yasinizi giriniz");
        int yas = scan.nextInt();

        String sonuc = maas>=1000 && yas>=24? "credit card alabilir " : "credit card alamaz ";
        System.out.println(sonuc);

        //  ====boolean tanimlama=======

        boolean isCreaditCard = yas>=24 && maas>=1000;
        System.out.println("credit card alabilir" + isCreaditCard ); // alabilirse true yazar, alamazsa false yazar.




    }
}
