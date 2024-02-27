package day10_MethodCreation.DE10_MethodCreation.Tasks;

import java.util.Arrays;

public class Task20 {
    /*
    task->
      Tek bir String içerisinde verilen euro ve dolarların ayrı ayrı toplamlarıni print eden METHOD create ediniz

       [$1 $12 €34 €56 $45 €78]
        dolarToplami: 58
        euroToplami: 168
       */

    public static void main(String[] args) {


       metot();
       metot2();
       metot3();

    }

    private static void metot3() {
        String str = "$1 $12 €34 €56 $45 €78";
        str = str.trim()+"  ";
        int euro=0;
        int dolar=0;
        String yStr = str;
        do {
            int boslukIdx = yStr.indexOf(" ");
            String kelime = yStr.substring(0,boslukIdx);
            System.out.println(kelime);
            if (kelime.startsWith("$"))
                dolar += Integer.parseInt(kelime.substring(1));
            else euro += Integer.parseInt(kelime.substring(1));
            yStr = yStr.substring(boslukIdx+1);
        } while (yStr.length()>2);
        System.out.println("dolar = " + dolar);
        System.out.println("euro = " + euro);
    }

    private static void metot2() {
        String str = "$1 $12 €34 €56 $45 €78";
        str = str.trim()+" ";
        int euro=0;
        int dolar=0;
        int baslangicNoktasi=0;
        for (int i = 0; i <str.length() ; i++) {
            int boslukIdx = str.indexOf(" ",baslangicNoktasi);
            if (boslukIdx<0) break;
            String kelime = str.substring(baslangicNoktasi,boslukIdx);
            if (kelime.substring(0,1).equals("$"))
                dolar += Integer.parseInt(kelime.substring(1));
            else euro += Integer.parseInt(kelime.substring(1));
            baslangicNoktasi=boslukIdx+1;
            i=baslangicNoktasi;
        }
        System.out.println("dolar = " + dolar);
        System.out.println("euro = " + euro);
    }

    private static void metot() {
        String str = "$1 $12 €34 €56 $45 €78";
        String[] sD= str.split(" ");
        System.out.println(Arrays.toString(sD));
        int euro=0;
        int dolar=0;
        for (int i = 0; i <sD.length ; i++) {
            String ilkKarekter = sD[i].substring(0,1);
            String gerisi =sD[i].substring(1);
            if (ilkKarekter.equals("$")) {
                dolar += Integer.parseInt(gerisi);
            } else {
                euro += Integer.parseInt(gerisi);
            }

        }
        System.out.println("dolar = " + dolar);
        System.out.println("euro = " + euro);
    }


}
