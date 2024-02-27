package day15_Varargs.DE15_Varargs_ilk;

public class Task03_enUzunStringxsayi____ {
    public static void main(String[] args) {
         /*
        Task ->  girilen bir sayı ile girilen String'lerin en uzun harf sayısını çarpıp print eden METHOD create ediniz.
         */

        int sayi1 = 7;
        String str1 = "sefil javacı Haluk";//
        String str2 = "perfect javacı Abdulhamit";//
        String str3 = "beleştepe muhtarı CEREN";//
        metott(sayi1, str1,str2,str3);
        System.out.println("---");
        metott2(sayi1, str1,str2,str3);
        System.out.println("---");
        metott3(sayi1, str1,str2,str3);



    }//main sonu

    private static void metott(int sayi1, String...str) {
        // sayi yı en uzun string uzunluğu ile çarptık
        int enUzun=0;
        for (String val:str) {
            if (val.length()>enUzun) enUzun = val.length();
        }
        System.out.println(enUzun*sayi1);
    }
    private static void metott2(int sayi1, String...str) {
        // sayıyı stringler içerisinde en uzun kelime uzunluğu ile çarptık
        int enUzun=0;
        for (String val:str) {
            String[] ss = val.split(" ");
            for (String kelime:ss) {
                if (kelime.length()>enUzun) enUzun = kelime.length();
            }
        }
        System.out.println(enUzun*sayi1);
    }
    private static void metott3(int sayi1, String...str) {
        // sayıyı stringler içerisinde en uzun kelime uzunluğu ile çarptık

        for (String val:str) {
            int enUzun=0;
            String[] ss = val.split(" ");
            for (String kelime:ss) {
                if (kelime.length()>enUzun) enUzun = kelime.length();
            }
            System.out.println(enUzun*sayi1);
        }

    }


}
