package asya_hoca_.B01_Methodlar;

import java.util.Scanner;

public class B04_ {
    public static void main(String[] args) {
        /*
        
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("mail adresinizi giriniz");
        String email = scanner.nextLine();
        
        domainTespit(email);   // domain i bu method ile yazdiririz

        email = email.replace(domainTespit(email),"yahoo");  // verilen domain yerine yahoo yazdirmak
        System.out.println("mail:"+email);

    }

    private static String domainTespit(String mail) {
        String domain =mail.substring(mail.indexOf("@")+1, mail.indexOf("."));
        System.out.println(domain);
        return domain;
    }
}
