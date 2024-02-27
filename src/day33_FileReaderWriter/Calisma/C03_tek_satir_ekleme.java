package day33_FileReaderWriter.Calisma;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class C03_tek_satir_ekleme {
    public static void main(String[] args) throws IOException {

        // dosya olusturma ve kullanma
         String str = "Dosyaya yazilkacak metin";
         String str2 = "Ikinci metin";
         String path = "C:\\Deneme\\erc\\Desktop/dosya.txt";
         File file = new File(path);
         if (!file.exists()){ // bu dosya yok ise demek
             file.createNewFile();
         }
        FileWriter fWriter = new FileWriter(file,false);
        BufferedWriter bWriter = new BufferedWriter(fWriter);
        bWriter.write(str);bWriter.newLine();// bWriter.newLine();yazdiktan sonra alt satira gec demek
        bWriter.write(str2);bWriter.newLine();
        bWriter.close();

        //  FileWriter fWriter = new FileWriter(file,false); burada  false ve
        // bWriter.write(str); burada write yazinca
        //***  dosyayi her sefer sifirdan  olusturuyor:
        /*
        Dosyaya yazilkacak metin
        Ikinci metin______ seklinde hersefer yeniden yazdi
         */

       /*
        String str = "Dosyaya yazilkacak metin";
        String str2 = "Ikinci metin";
        String path = "C:\\Deneme\\erc\\Desktop/dosya.txt";
        File file = new File(path);
        if (!file.exists()){ // bu dosya yok ise demek
            file.createNewFile();
        }
        FileWriter fWriter = new FileWriter(file,true);
        BufferedWriter bWriter = new BufferedWriter(fWriter);
        bWriter.append(str);bWriter.newLine();// bWriter.newLine();yazdiktan sonra alt satira gec demek
        bWriter.append(str2);bWriter.newLine();
        bWriter.close();

        yani
        Dosyaya yazilkacak metin
        Ikinci metin
        Dosyaya yazilkacak metin
        Ikinci metin__seklinde dosyayi mevcut dosyaya ekleme yapiyor
       */
        //ama: FileWriter fWriter = new FileWriter(file,true); burada  true  burada append yazinca
        // *** dosyayi mevcut dosyaya ekleme yapiyor


        /*
        // dosyanin pati belirlenmeli. yerini
        String filePath = System.getProperty("user.dir")+"/dosya.txt";
        System.out.println(filePath);

        File file = new File(filePath);
         */


    }
}
