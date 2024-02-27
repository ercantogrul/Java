package asya_hoca_.sorular_19_09;

import java.util.Scanner;

public class s2 {
    public static void main(String[] args) {
        //Girilen mailde "_ " işareti varsa kelimelerin yerini değiştirip yazdırın
//"_" yok ise aynı şekilde yazdırın
//Örnek: //"asya_cool@gmail.com";--> cool_asya@gmail
        //"asyacool@gmail.com"---> asyacool@gmail.com


        Scanner scan = new Scanner(System.in);
        System.out.print(" bir imail adresi giriniz: ");
        String str = scan.nextLine();
        int i = str.indexOf("_");
        int a = str.indexOf("@");

        String ilkP = str.substring(0,i);
        String ikinciP = str.substring(i+1,a);
        String ucuncuP = str.substring(a+1);

       /*// bunda hata var
       if (i>0){
           System.out.println(ikinciP+"_"+ilkP+ucuncuP);
       }else System.out.println(str);
        */

       // ikinci yol================================

        boolean b = str.contains("_");
        if (b) {
            String s1 = str.substring(0,str.indexOf("_"));
            String s2 = str. substring(str.indexOf("_")+1,str.indexOf("@"));
            System.out.println(s2+"_"+s1+"@gmail.com");
        }else System.out.println(str);



















    }
}
