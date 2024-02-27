package day26_Exception.Mentor;

import java.util.Scanner;

public class PassWord {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        String pass=scanner.next();

        if (!(pass.charAt(0)>='A' && pass.charAt(0)<='Z')){
            throw new RuntimeException("İlk harf büyük olmadı");
        }
        System.out.println("main bitti");

    }
}
