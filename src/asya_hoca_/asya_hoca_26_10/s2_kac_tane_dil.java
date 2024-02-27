package asya_hoca_.asya_hoca_26_10;

public class s2_kac_tane_dil {
    public static void main(String[] args) {
        // Dilim seni dilim dilim kesmeli
        //kaç tane "dil" içermektedir.
String str = "Dilim seni dilim dilim kesmeli";
int sayac =0;


        for (int i = 0; i <str.length()-3 ; i++) {
            String kelime =str.substring(i,i+3);
            if(kelime.equalsIgnoreCase("dil")){
                sayac ++;
            }

        }
        System.out.println(sayac);


        // ikinci yötem ============================
        String str1 = "Dilim seni dilim dilim kesmeli";
        str1 = str1.toLowerCase();
        int sayac1 = 0;
        int n = str1.length();
        for (int i = 0; i < n; i++) {
            if (str1.startsWith("dil", i)) {
                sayac1++;
            }
        }
        System.out.println("sayac1 = " + sayac1);






    }
}
