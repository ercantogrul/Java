package day07_StringManuplation.DE07_StringManuplation_ilk.tasks;

public class _16_String_methods12__ucden_sonraki_harf_indexi {

    public static void main(String[] args) {

        /*  Florida kelimesinden bir String oluşturun.
            Florida kelimesinin içindeki, sadece  'o'  harfinin bulunduğu indexini yazdırın.  */

        //Kodu aşağıya yazınız.

        String str = "Floridoro";

        int ilk_o_indexi = str.indexOf('o');                                     //ilk "o" index
        System.out.println("ilk_o_indexi = " + ilk_o_indexi);

        int son_o_indexi = str.lastIndexOf("o");                            //son "o" index
        System.out.println("son_o_indexi = " + son_o_indexi);

        // 5. indexten sonraki ilk "o" nun index.
        int index = str.indexOf("o",5);
        System.out.println("index = " + index);                                   // 5 den sonraki ilk "o" indexi

        //3, ve 5. karekter arasındaki "o"
        int index2 = str.indexOf("o",3,5);
        System.out.println("index2 = " + index2);                                // 3, ve 5. karekter arasındaki "o" indexi

        // Soru 2 : "Merhaba Dünya" stringide 2.kelimedeki a harfinin indexi nedir
        str = "Merhaba Dünya";
        int boslukIndex = str.indexOf(" ");
        int ikinciKelimedekiAninIndexi=str.indexOf("a",boslukIndex);          // bosluktan sonraki a nin indeksi
        System.out.println("ikinciKelimedekiAninIndexi = " + ikinciKelimedekiAninIndexi);

        // soru 2 , 2.yol
        ikinciKelimedekiAninIndexi = str.indexOf("a",str.indexOf(" "));   // bosluktan sonraki a nin indeksi
    }
}
