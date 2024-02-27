package day16_LocaleDateTime.DE16_LocaleDateTime.Tasks;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class T08_dogum_gunu_haftasonu_mu {
    // doğum gününüz haftasonumudur
    public static void main(String[] args) {

        LocalDate dogumTarihi = LocalDate.of(1978,4,13);
        DayOfWeek gun = dogumTarihi.getDayOfWeek();
        System.out.println(gun);
        gun= DayOfWeek.of(gun.getValue());

        if (gun.getValue()>5){
            System.out.println("dogum gunu hafta sonudur");
        }else System.out.println();
        System.out.println("dogum gunu hafta sonu degildir");



        //===========================================================
        LocalDate dogumGunu1 = LocalDate.of(1978,4,13);
        DayOfWeek gun1 =dogumGunu1.getDayOfWeek();
        System.out.println(gun1);

        if (gun1.equals("Saturday") || gun1.equals("Sunday")){
            System.out.println("dogum gunu hafta sonudur");
        }else System.out.println("dogum gunu hafta sonu degildir");




    }
}
