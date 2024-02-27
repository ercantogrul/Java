package day07_StringManuplation.DE07_StringManuplation;

import java.util.Scanner;

public class C07_indexOf_lastIndexOf {
    public static void main(String[] args) {
       /* indexOf()
          char karakter ya da String metnin kacinci indexden basladigini veren bir method dur. Sonuc integer dir.
          Bu method index'i sorulan char'in String icindeki ilk gorunumunun index'ini return eder
          contains den farkı indexini verir, contains ise true false
        */
        String str = "Merhaba dünya";
        // str stringinde " " kaçıncı idextir
        int indexOfBosluk = str.indexOf(" ");
        System.out.println(indexOfBosluk);

        // str text ini , merhaba ve dünya olarak alt alta yazdırınız.
        System.out.println(str.substring(0,indexOfBosluk)); // Merhaba
        System.out.println(str.substring(indexOfBosluk+1)); // Dunya




    }

}
