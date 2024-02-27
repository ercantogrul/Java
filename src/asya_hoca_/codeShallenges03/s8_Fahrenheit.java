package asya_hoca_.codeShallenges03;

import java.util.Scanner;

public class s8_Fahrenheit {
    public static void main(String[] args) {

         /*     Sıcaklığı Fahrenheit'tan Santigrat derecesine çeviren bir
     Java programı yazın. (Scanner class)
          formül
          c = (f-32)*5/9
    ex:
   Input F :120
   Output :48

        //double sayilari , virgül ile giriyoruz
          */

        Scanner scan = new Scanner(System.in);
        System.out.println("sicakligi fehrenayt olarak giriniz");
        double f = scan.nextDouble();
        double c = (f-32)*5/9;
        System.out.println("fahrenayt : "+ f);
        System.out.println("santigrad derece : " +c);



    }
}
