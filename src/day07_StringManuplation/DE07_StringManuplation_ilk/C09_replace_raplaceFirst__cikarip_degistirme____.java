package day07_StringManuplation.DE07_StringManuplation_ilk;

public class C09_replace_raplaceFirst__cikarip_degistirme____ {
    public static void main(String[] args) {
        /** replace()
         * Metin icerisindeki karakter ya da bir parcasinin, istenilen karakter ya da metinle degistirilmesini
         * (update -set) saglar. Sonuc String'dir..
         *
         */

        //replace=====tümünü==================================
        String str = "Merhaba dünya";
        str = str.replace("a","*"); //a larin yerine yildiz yaz--- string icin cift tirnak
        str = str.replace('a','*');  //a larin yerine yildiz yaz--- char icin tek tirnak kullanabiliriz
        System.out.println(str);                            //Merh*b* düny*

        str = str.replace("a","");  System.out.println(str);   //Merh*b* düny*
        //önemli===========================
        System.out.println(str.replace("v","V").replace("n","N")); //olur
        System.out.println(str.replace('v','V').replace('n','N')); //ollur

        // yukarıdaki string de kaç adet * vardır
        int strUzunluk = str.length();  System.out.println(str+"  "+strUzunluk  );  // Merh*b* düny*  13

        String str2=str.replace("*",""); // tüm yıldızları sil
        System.out.println(str2);   // Merhb düny
        int str2Uzunluk = str2.length();  System.out.println(str2+"   "+str2Uzunluk); //Merhb düny   10


        String str3=str.replace("*"," "); // tüm yıldızların yerine bosluk
        System.out.println(str3);  //Merh b  düny
        String str4=str.replace('*',' '); // tüm yıldızların yerine bosluk
        System.out.println(str4); //Merh b  düny


        int yildizsayisi = str.length() - str.replace("*","").length();
        System.out.println(yildizsayisi);                     //
//================================================================
        String str7 = "Javayi anliyorum ama yazamiyorum";
        // var olan bir String'in istedigimiz bolumunu degistirebiliriz

        System.out.println(str7.replace('J', 'T'));  // Tavayi anliyorum ama yazamiyorum
        System.out.println(str7.replace('a', '*'));  // J*v*yi *nliyorum *m* y*z*miyorum
        System.out.println(str7.replace("ama yazamiyorum", "ve yazabiliyorum"));
        // Javayi anliyorum ve yazabiliyorum
        System.out.println(str7.replace("Java","AA"));   // AAyi anliyorum ama yazamiyorum


        //replaceFirst====sadece birinciyi===============================
        String st = "Merhaba dünya";
        st = st.replaceFirst("a","X");       //sadece ilk a  yerine yildiz yaz--- string icin cift tirnak
        System.out.println(st);  //MerhXba dünya

        System.out.println(st.replaceFirst("d","D")); //MerhXba Dünya


        // ilk sayiyi space haline donusturun
        System.out.println(str.replaceFirst("\\d", " "));
        // Java Candir, kendisini cok seviyoruz 23.


        // ilk ozel karakteri * olarak degistirin
        System.out.println(str.replaceFirst("\\W", "*"));
        // Java*Candir, kendisini cok seviyoruz123.






    }
}
