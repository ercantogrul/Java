package day33_FileReaderWriter;

import java.io.*;
import java.util.Scanner;

public class C02_FileReaderWriter {
    public static void main(String[] args) throws IOException {

        veriyaz();
        verioku();


    }

    public static void verioku() throws IOException {
        String filePath = "C:\\Deneme\\erc\\Desktop/dosya.txt";
        File file = new File(filePath); // dosya objesini path+isim ile oluşturuyoruz
        if (!file.exists()) { // file yoksa oluşturalım
            file.createNewFile();
        }

        FileReader fileReader = new FileReader(filePath);
        BufferedReader bReader = new BufferedReader(fileReader);
        String line;
        while ((line = bReader.readLine()) != null) {
            System.out.println(line);
        }
        bReader.close();
        fileReader.close();

    }

    public static void veriyaz() throws IOException {

        String filePath = "C:\\Deneme\\erc\\Desktop/dosya.txt";
        File file = new File(filePath); // dosya objesini path+isim ile oluşturuyoruz
        if (!file.exists()) { // file yoksa oluşturalım
                file.createNewFile();
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("No yu giriniz");int no = scanner.nextInt();
        System.out.println("Notu  giriniz");String not = scanner.next();
        String line = no+"*"+not;

        FileWriter fWriter = new FileWriter(file, false);
        BufferedWriter bWriter = new BufferedWriter(fWriter);
        bWriter.write(line);  // ekleme yapıyorsak bWriter.append(str1)
        bWriter.newLine(); // alt satıra geçsin diye
        bWriter.close();
        fWriter.close();




    }
}
