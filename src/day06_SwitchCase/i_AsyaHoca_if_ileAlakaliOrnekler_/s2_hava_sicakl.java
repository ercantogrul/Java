package day06_SwitchCase.i_AsyaHoca_if_ileAlakaliOrnekler_;

import java.util.Scanner;

public class s2_hava_sicakl {
    public static void main(String[] args) {

//Kullanıcıdan alınan hava sıcıklığını
//30 ve üzeri ise sıcak
//20 ve 30 arasında ılık
//20 'nin altında soğuk
//use single if statement

        Scanner scanner = new Scanner(System.in);
        System.out.println(" Hava sicakligi giriniz : ");
        int temperature = scanner.nextInt();
        boolean isHot = temperature>30;
        boolean isWarm = temperature<30;
        boolean isCold = temperature<20;

        if (isHot) {
            System.out.println("Hot");
        }if (isWarm) {
            System.out.println("warm ");
        }if (isCold){
            System.out.println("Cold ");
        }
        //=======================
        String durum = temperature>30? " Hot" : temperature<30? "warm" : temperature<20? "Cold" : "hatali giris";
        System.out.println(durum);


    }


}
