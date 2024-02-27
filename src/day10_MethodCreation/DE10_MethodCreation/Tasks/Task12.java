package day10_MethodCreation.DE10_MethodCreation.Tasks;

import java.util.Scanner;

public class Task12 {
    static Scanner input = new Scanner(System.in);//gunes eyledim ki herkeşler erişebile

    public static void main(String[] args) {
        /*
        Task-> girilen e-mail ın doğrulugunu aşağıdaki şartlarda  control eden METHOD create ediniz.
        1- @ karakteri olmalı
        2- . (nokta) karakteri olmalı
        3- @ karakterinden önce mutlaka en az bir karakter olmalı.
        Example:
        "@gmail.com"-> false
        "@gmailcom"-> false
        "gmail.com"-> false
        "ebıkGabık@gmail.com"-> true
         */
        String eMail = input.next();
        System.out.println(!eMail.substring(0, eMail.lastIndexOf('@')).isEmpty());
     //   boolean sonuc = controlEt(eMail);
        int x =-1;
        System.out.println((eMail.length()<1 && eMail.substring(0,x).isEmpty()));


    }//main sonu

    private static boolean controlEt(String eMail) {
        boolean result=false;
        if (eMail.contains("@") && eMail.indexOf('@')>0 && eMail.contains(".")) result=true;
        return result;
    }
    private static boolean controlEt2(String eMail) {
        if (eMail.contains("@") && eMail.indexOf('@')>0 && eMail.contains(".")) return true;
        else return false;
    }
    private static boolean controlEt3(String eMail) {
        return eMail.contains("@") && eMail.indexOf('@') > 0 && eMail.contains(".");
    }
    private static boolean controlEt4(String eMail) {
        boolean sonuc = eMail.contains("@") && eMail.indexOf('@') > 0 && eMail.contains(".");
        return sonuc;
    }


}
