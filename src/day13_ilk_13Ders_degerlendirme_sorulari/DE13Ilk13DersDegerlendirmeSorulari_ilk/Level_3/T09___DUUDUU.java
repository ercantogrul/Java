package day13_ilk_13Ders_degerlendirme_sorulari.DE13Ilk13DersDegerlendirmeSorulari_ilk.Level_3;

import java.util.Arrays;

public class T09___DUUDUU {
    public static void main(String[] args) {
        /*  Bir yürüyüşçü dağlık bir alanda yürümektedir, her bir adımı
        ya aşağıya doğru yada yukarıya doğru atmaktadır,
        ve bu adımlar bir String içerisinde verilmiştir
        String str = "DDUUUDUDDU"  // D:down   U:UP
         yürüyüşe başladığı ve bitirdiği noktalar aynı yüksekliktedir ve bu nokta sıfır
         noktası kabul ediliyor.
         aşağıya doğru inip tekrar sıfır noktasına geldiğinde bir vadi geçmiş oluyor
         kaç vadi geçtiğini hesaplayınız
         Açıklama, üstteki örnekte
         adımlar sıra ile
         D : bir aşağı indi
         D : bir daha aşağı indi
         U : bir yukarı çıktı
         U : bir daha yukarı çıktı aynı sevyeye geldi ve bir vadi tamamlandı
         U : bir yukarı çıktı
         D : bir aşağı indi , yine sıfır noktasına geldi ama tepeye çıkıp indi bunu syamıyoruz
         sadece vadiler sayılıyor
         U :
         D : ustteki ile aynı senaryo yin sıfıra geldi ama saymadık
         D : aşağı indi
         U : yukarı çıktı ve sıfıra geldi vadi tamamlandı say ( vadi sayısı 2 oldu)


         */

        String str = "DDUUUDUDDUDUDDUUUD";
        String[] arr = str.split("");
        System.out.println(Arrays.toString(arr));

        birinciyol(arr);
        ikinciyol();




    }

    private static void ikinciyol() {

        String path = "DDUUUDUDDUDUDDUUUD";
        int level =0;
        int birOncekiSeviye =0;
        int vadi =0;

        for (int i = 0; i < path.length(); i++) {
            birOncekiSeviye=level;
            if (path.substring(i,i+1).equals("U")) level++;else level--;
            if (level==0 && birOncekiSeviye<0){
                vadi++;
            }

        }
        System.out.println("vadi = " + vadi);


    }

    private static void birinciyol(String[] arr) {
        int count = 0;
        int vadiSayisi = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals("D")) count = count - 1;

            if (arr[i].equals("U")) count = count + 1;

            if (count == 0 && arr[i].equals("U")) vadiSayisi += 1;
        }
        System.out.println(vadiSayisi);
    }
}
