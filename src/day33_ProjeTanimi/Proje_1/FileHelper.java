package day33_ProjeTanimi.Proje_1;

import java.io.*;
import java.util.ArrayList;

public class FileHelper implements Interfile {
    //final static String filePath=System.getProperty("C:\\Deneme\\erc\\Desktop/RehberListesi.txt");

    @Override
    public void dosyayaYaz(ArrayList<Adres> liste) { // listeyi dosyaya yaz
        String filePath = "C:\\Deneme\\erc\\Desktop/RehberListesi.txt";
        File file = new File(filePath);
        if (!file.exists()) { // file yoksa oluşturalım
            try {
                file.createNewFile();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        try {
            FileWriter fWriter = new FileWriter(file, false);
            BufferedWriter bWriter = new BufferedWriter(fWriter);
            for (int i = 0; i < Runner.rehberListe.size(); i++) {
                String line = Runner.rehberListe.get(i).getID() + "*" + Runner.rehberListe.get(i).getAdSoyad() + "*" +
                        Runner.rehberListe.get(i).getTel() + "*" + Runner.rehberListe.get(i).getAdres() + "*" +
                        Runner.rehberListe.get(i).geteMail() + "*" + Runner.rehberListe.get(i).isStatu();
                bWriter.write(line); // ekleme yapıyorsak bWriter.append(str1)
                bWriter.newLine();
            }
            bWriter.close();
            fWriter.close();
        }catch (Exception e){
            System.out.println(e);
        }
    }

    @Override
    public ArrayList<Adres> dosyadanOku() {
        ArrayList<Adres> rehberListe = new ArrayList<>();
        String filePath = "C:\\Deneme\\erc\\Desktop/RehberListesi.txt";
        File file = new File(filePath);
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
            while ((line = bReader.readLine()) != null) {
                try {
                    String adSoyad="";
                    String adres="";
                    String eMail="";
                    boolean statu=true;
                    int id =0;
                    long tel=0;
                    Adres bilgiler = new Adres(id, adSoyad, tel, adres, eMail, statu);

                    for (int i = 0; i < line.length(); i++) {
                        String parca = line.substring(0,line.indexOf("*"));
                        if (i==0){id = Integer.parseInt(parca);
                        } else if (i==1) {adSoyad =parca;
                        } else if (i==2) {tel = Long.parseLong(parca);
                        } else if (i==3) {adres = parca;
                        } else if (i==4) {eMail = parca;
                        } else if (i==5) {statu = Boolean.parseBoolean(parca);
                        }
                        String kalanLine = line.substring(line.indexOf("*")+1);
                        line =kalanLine;
                        Runner.sonID=id; // listenin son elemanının  ID sini  Runner.adresSonID ye alalım
                        bilgiler = new Adres(id, adSoyad, tel, adres, eMail, statu);

                    }Runner.rehberListe.add(bilgiler);

                } catch (Exception e) {
                    System.out.println("aaaa");
                    throw new RuntimeException(e);
                }
            }
            bReader.close();
            fileReader.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            System.out.println(e.toString());
        }

        return rehberListe;
    }


}
