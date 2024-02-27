package day35_Lambda.DE35_Lambda;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class C12_textRead {
    public static void main(String[] args) {
        String filePath = System.getProperty("user.dir") + "/dosya.txt";
        Path path = Path.of(filePath);
        Stream<String> dosyaAkisi;

        try {
            dosyaAkisi = Files.lines(path);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
     //  dosyaAkisi.forEach(System.out::println);
        List<String> list  =dosyaAkisi.toList();
        for (String s:list) System.out.println(s);



    }
}
