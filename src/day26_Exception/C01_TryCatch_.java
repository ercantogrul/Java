package day26_Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C01_TryCatch_ {
    public static void main(String[] args) {

        System.out.println("sayiyi giriniz : ");
        int sayi;
        int yeniSayi;
        boolean okumaBasarili;
        do {
            okumaBasarili = true;
            Scanner scanner = new Scanner(System.in);
            try {
                sayi = scanner.nextInt();
                yeniSayi = 10/(5-sayi);

            }catch (ArithmeticException e){ // burada sadece ArithmeticException hata bulursa yakalar
                okumaBasarili=false;
                System.out.println(e);
                System.out.println("sifira bölme hatasi: ");

            }catch (InputMismatchException e){
                okumaBasarili=false;
                System.out.println(e);
                System.out.println("hatali veri gerisi : ");

            } catch (Exception e){ // Exception sinifindan bir nesne olusturduk asagidada yazdik
                System.out.println("baska bir hata yakalandi  : ");

            } finally {
                System.out.println("finaly block calisti");
            }
        }while (!okumaBasarili);





    }
}
