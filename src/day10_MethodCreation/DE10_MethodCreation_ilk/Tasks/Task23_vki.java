package day10_MethodCreation.DE10_MethodCreation_ilk.Tasks;

import java.util.Scanner;

public class Task23_vki {
    static Scanner input = new Scanner(System.in);//gunes eyledim ki herkeşler erişebile

    public static void main(String[] args) {
        /*
        Task-> vucüt kitleendexini print eden METHOD create ediniz
        vki->kg(mt*mt)
     18,5 kg/m2 ve daha düşük değerler = Zayıf.
     18,5 ve 24,9 kg/m2 arasındaki değerler = Normal ağırlıkta.
     25,0 ve 29,9 kg/m2 arasındaki değerler = Kilolu.
     30,0 ve üstü =  obezite.

         */
        Scanner input = new Scanner(System.in);
        System.out.print("kg olarak kilonuzu giriniz : ");
        double kilo = input.nextDouble();
        System.out.print("metre türünden boyunuzu giriniz : ");
        double boy = input.nextDouble();

        vucutKitleEndexi(kilo,boy);

    }//main sonu

    private static void vucutKitleEndexi(double kilo, double boy) {
        double vki = kilo/(boy*boy);
        System.out.println(vki);
        if (vki>=30.0){
            System.out.println("Obezite");
        } else if (vki>=25.0) {
            System.out.println("Kilolu");
        } else if (vki>=18.5) {
            System.out.println("Normal");
        }else System.out.println("Zayif");
        

    }


}
