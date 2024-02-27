package day33_FileReaderWriter.Calisma;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class C03_ad_soyad {
    public static void main(String[] args) throws IOException {
        String ad = "Ahmet";
        String soyad = "Hasan";
        int yas = 25;
        String path = "C:\\Deneme\\erc\\Desktop/dosya.txt";
        File file = new File(path);
        if (!file.exists()) { // bu dosya yok ise demek (dosya olustur)
            file.createNewFile();
        }
        FileWriter fWriter = new FileWriter(file, true);
        BufferedWriter bWriter = new BufferedWriter(fWriter);
        String adf = String.format("%10s", ad);
        String soyadf = String.format("%10s", soyad);
        String yasf = String.format("%10s", yas);
        bWriter.write(adf);
        bWriter.write(soyadf);
        bWriter.write(yasf);
        bWriter.newLine();  // burada yeni bir satira gecmis oluyor
        bWriter.close();

    }
}
