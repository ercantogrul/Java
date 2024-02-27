package day07_StringManuplation.DE07_StringManuplation_ilk;

public class C06_indexOf_lastIndexOf___ {
    public static void main(String[] args) {
       /* indexOf()
          char karakter ya da String metnin kacinci indexden basladigini veren bir method dur. Sonuc integer dir.
          Bu method index'i sorulan char'in String icindeki ilk gorunumunun index'ini return eder
          contains den farkı indexini verir, contains ise true false
        */
        String str = "Merhaba dünya";

        // str1 stringinde " " kaçıncı idextir
        int indexOfBosluk = str.indexOf(" ");  System.out.println(indexOfBosluk); // boslugun indexi 7
        int i = str.indexOf("rh");  System.out.println(i); // 2
        //Merhaba'nin indexi nedir
        int i2 = str.indexOf("r");  // r index'in de  2 var
        System.out.println("i2 = " + i2);

        // str1 text ini , merhaba ve dünya olarak alt alta yazdırınız.
        System.out.println(str.substring(0,indexOfBosluk)); // Merhaba
        System.out.println(str.substring(indexOfBosluk+1)); // Dunya

        //=========ÖNEMLI===========================================
        String str1 = "Merhaba dünya";
        int index = str1.indexOf("a");  // ilk a nin index degeri --4
        int index1 = str1.indexOf("a",5);  // 5 inci index ten itibaren ilk  a nin index degeri --6
        int index2 = str1.indexOf("a",5,7);  // 5 ile 7 arasindaki  a nin index degeri --6

        if (str1.indexOf("aba")!=-1){          // -1 ise icermiyor ama (!= -1) olunca iceriyor
            System.out.println("icermektedir");
        }
        //=======LASTINDEXOF=================================
        System.out.println(str1.lastIndexOf("a"));// a nin son index yerini verir  //6
        System.out.println(str1.lastIndexOf("a",indexOfBosluk));
        // bosluktan itibaran (öne dogru) a nin son index yerini verir //4


        String str6 = "Ali topu at, topu at ali";

        // ilk top metin parcasinin index'ini yazdirin
        System.out.println(str6.indexOf("top")); // 4
        // ikinci top metin parcasinin index'ini yazdirin
        System.out.println(str6.indexOf("top",5)); // 13
        System.out.println(str6.indexOf("top",str6.indexOf("top")+1)); //13

        // k harfinin son kullaniminin indexini yazdiralim
        System.out.println(str6.lastIndexOf('t')); // 19  // sadece string olarak degil char olarak da aratabiliriz
        System.out.println(str6.indexOf('i'));  //2


        // Metne bakmadan e harfinin 2 kere veya daha fazla kullanilip kullanilmadigini kontrol edin
        int ilkIndex = str.indexOf("e");
        int sonIndex = str.lastIndexOf("e");

        if (ilkIndex == -1){
            System.out.println("Hic e kullanilmamis");
        } else if (ilkIndex == sonIndex) {
            System.out.println("Sadece 1 e kullanilmis");
        }else{
            System.out.println("e harfi 2 kere veya daha fazla kullanilmis");
        }










    }

}
