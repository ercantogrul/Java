package day33_ProjeTanimi.Yeni_Proje;

import day33_ProjeTanimi.Proje_FarukHoca.InterFile;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class FileHizmetler implements InterFile {
    final static String filePath=System.getProperty("user.dir")+"/dosyaIslem.txt";

    @Override
    public void dosyayaYaz() {
        //String filePath = "C:\\Deneme\\erc\\Desktop/SucuYapilanIslemler.txt";
        File file = new File(filePath); // dosya objesini path+isim ile oluşturuyoruz
        if (!file.exists()) { // file yoksa oluşturalım
            try {
                file.createNewFile();
            } catch (IOException e) {
                System.out.println("FileKisiler 10 -> dosya bulunamadı : "+e);
            }
        }
        try {
            FileWriter fWriter = new FileWriter(file,false);
            BufferedWriter bWriter = new BufferedWriter(fWriter);

            for (Map.Entry<Integer, Hizmetler> val : SuTesisatciRunner.islemListe.entrySet()) {
                String line=val.getValue().getSatisID()+"*";
                line = line+val.getValue().getMusteriID()+"*";
                line = line+val.getValue().getTarih()+"*";
                line = line+val.getValue().getIslem()+"*";
                line = line+val.getValue().getTutar()+"*";
                line = line+val.getValue().getTahsilat()+"*";
                line = line+val.getValue().isDurum();
                bWriter.write(line);  // ekleme yapıyorsak bWriter.append(str1)
                bWriter.newLine();
            }
            bWriter.close();
            fWriter.close();
        } catch (Exception e){
            System.out.println(e);
        }

    }

    @Override
    public void dosyadanOku() {

        // dosyadan oku, listeye aktar
        // dosyayı açalım
       // String filePath = "C:\\Deneme\\erc\\Desktop/SucuYapilanIslemler.txt";
        File file = new File(filePath); // dosya objesini path+isim ile oluşturuyoruz
        if (!file.exists()) { // file yoksa oluşturalım
            try {
                file.createNewFile();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        try {
            FileReader fileReader = new FileReader(filePath);
            BufferedReader bReader = new BufferedReader(fileReader);
            String line;

            while ((line=bReader.readLine()) !=null){
                // line dan 1 kişi verisini alalım
                String[] dizi = line.split("\\*");
                int satisID = Integer.parseInt(dizi[0]);
                int musteriID = Integer.parseInt(dizi[1]);
                String tarih = dizi[2];
                String yapilanIslem = dizi[3];
                int tutar = Integer.parseInt(dizi[4]);
                int tahsilat = Integer.parseInt(dizi[5]);
                boolean durum= Boolean.parseBoolean(dizi[6]);
                // aldığımız bu veriyi, map a ekleyelim
                Hizmetler islem = new Hizmetler(satisID,musteriID,tarih,yapilanIslem,tutar,tahsilat,durum);
                SuTesisatciRunner.islemListe.put(satisID,islem);

                // en büyük id yi buluyoruz, çünki yeni kayıt eklerken bundan
                // bir fazlasını id olarak vereceğiz, aksi halde proğramdan
                // çıkıp tekrar giddiğimizde Runner.adresSonID 1 den başlar ve olay karış
                if (satisID> SuTesisatciRunner.SatisSonID) SuTesisatciRunner .SatisSonID = satisID;
            }
            bReader.close();
            fileReader.close();
        } catch (Exception e) {
            System.out.println(e);
        }


    }
}
