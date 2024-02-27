package day13_ilk_13Ders_degerlendirme_sorulari.DE13Ilk13DersDegerlendirmeSorulari_ilk.Level_3;

public class T04__kanguru {
    public static void main(String[] args) {
        /*
        2 kanguru bir sayı ekseni üzerinde zıplayacaktır
        1 .kanguru x1 noktasından zıplamya başlar ve her defasında s1 kadar yol alır
        2 .kanguru x2 noktasından zıplamya başlar ve her defasında s2 kadar yol alır
        atlama süreleri eşittir
        herhangi bir anda bu iki kanguru aynı noktada buluşur mu?
        output : evet buluşur / hayır buluşamaz şeklinde olmalıdır
         */

        int x1 =5;
        int x2 =10;
        int v1 = 3;
        int v2=2;

        int konum1,konum2;
        int jump =0;
        String sonuc ="NO";
        do {
            jump++;
            konum1= x1+v1*jump;
            konum2= x2+v2*jump;
            if (konum1==konum2) sonuc="YES";

        }while (konum1<konum2);
        System.out.println("sonuc = " + sonuc);


    }

}
