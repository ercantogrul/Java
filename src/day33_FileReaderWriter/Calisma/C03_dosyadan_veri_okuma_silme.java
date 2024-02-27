package day33_FileReaderWriter.Calisma;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class C03_dosyadan_veri_okuma_silme {
    public static void main(String[] args) throws IOException {
        String ad = "Ahmet";
        String soyad = "Hasan";
        int yas = 25;
        String path = "C:\\Deneme\\erc\\Desktop/dosya.txt";
        File file = new File(path);
        if (!file.exists()) { // bu dosya yok ise demek (dosya olustur)
            file.createNewFile();
        }
        FileReader fReader = new FileReader(file);
        BufferedReader bReader = new BufferedReader(fReader);
        String line;
        while ((line=bReader.readLine())!=null){
            ad = line.substring(0,10);
            ad = ad.replaceAll(" ","");
            soyad = line.substring(10,20);
            soyad= soyad.replaceAll(" ","");
            String yass = (line.substring(20,30));
            yass=yass.replaceAll(" ","");
            yas = Integer.parseInt(yass);
            System.out.println(ad+" "+soyad+" "+yas);
        }
        bReader.close(); // once dosya kapatilir sonra
        if (file.exists()) {  // dosya varsa silinsin
            file.delete();
        }
    }
}
