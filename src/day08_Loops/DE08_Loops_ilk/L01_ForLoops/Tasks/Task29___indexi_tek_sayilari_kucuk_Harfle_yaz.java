package day08_Loops.DE08_Loops_ilk.L01_ForLoops.Tasks;

public class Task29___indexi_tek_sayilari_kucuk_Harfle_yaz {

    public static void main(String[] args) {
        // task-> girilen bir Stringde  index'i tek sayi olanlari kucuk harfle
        // index'i cift sayi olanlari buyuk harfle print eden code create ediniz
        // ornek : Haluk  output: HaLuK


        String str= "Java candir, Selenium heyecandir";
        str = "JAVA CANDIR ";
        for (int i = 0; i <str.length() ; i++) {
            if (i%2 == 0) System.out.print(str.substring(i, i + 1).toUpperCase());
            else System.out.print(str.substring(i, i + 1).toLowerCase());
        }
        System.out.println();
        // 2.yol===================================================================
        String yeniMetin="";
        for (int i = 0; i <str.length() ; i++) {
            if (i%2 == 0) yeniMetin=yeniMetin+str.substring(i, i + 1).toUpperCase();
            else yeniMetin=yeniMetin+str.substring(i, i + 1).toLowerCase();
        }
        System.out.println(yeniMetin);

        // 3.yol==========zorrr========================================================
        for (int i = 0; i <str.length() ; i++){
            String harf;
            if (i%2 == 0) harf=str.substring(i, i + 1).toUpperCase();
            else harf=str.substring(i, i + 1).toLowerCase();
            str = str.substring(0,i)+harf+str.substring((i+1));
        }
        System.out.println(str);





    }
}
