package day08_Loops.DE08_Loops.L01_ForLoops.Tasks02;

public class Task02_11 {
    public static void main(String[] args) {
        // Bir text veriliyor, tekstin içerisindeki kelimelerden , kaç tanesi 'a' veya 'A' ile başlıyordur.
        // Örnek    input : "Ahmet ile ayşe top almışlar"
        //          output: 3
        String str = "Ahmet  ile ayşe top almışlar ";
        int aIleBaslayanSayisi=0;
        for (int i = 0; i <str.length()-1 ; i++) {
            String harf = str.substring(i,i+1); // i.sadece  elemanı al
            if(i==0 || harf.equals(" ")) {
                if (harf.equals(" ")) harf = str.substring(i+1,i+2); // boşluktan sonraki karekteri alsın
                // kelimenin ilk harfini bulduk
                if (harf.equalsIgnoreCase("a")) aIleBaslayanSayisi++;
            }
        }
        System.out.println("aIleBaslayanSayisi = " + aIleBaslayanSayisi);

        //2.yol, best practise
        aIleBaslayanSayisi=0;
        for (int i = 0; i <str.length()-1 ; i++) {
            String harf = str.substring(i,i+1);
            if (harf.equals(" ") && str.substring(i+1,i+2).equalsIgnoreCase("a")) aIleBaslayanSayisi++;
        }

        if (str.substring(0,1).equalsIgnoreCase("a")) aIleBaslayanSayisi++;

        System.out.println("aIleBaslayanSayisi = " + aIleBaslayanSayisi);

        //3.yol
        aIleBaslayanSayisi=0;
        for (int i = 0; i <str.trim().length() ; i++) {
            String harf = str.trim().substring(i,i+1);
            if (harf.equals(" ") && str.substring(i+1,i+2).equalsIgnoreCase("a")) aIleBaslayanSayisi++;
        }

        if (str.substring(0,1).equalsIgnoreCase("a")) aIleBaslayanSayisi++; // ilk karekter "a" mı sorusu

        System.out.println("aIleBaslayanSayisi = " + aIleBaslayanSayisi);



    }
}
