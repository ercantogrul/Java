package day26_Exception.Mentor;



import java.util.Scanner;

public class ThrowKeyWord {


    public static void main(String[] args) {
        //yeni bir hata oluşturmak new kelimesi ile kullanır

        Scanner scanner=new Scanner(System.in);
        System.out.println("Yaşınızı girin:");
        int yas=scanner.nextInt();

        if(yas<18){
            try {
                throw new RuntimeException("Kullanıcı ayşı 18'den küçük olamaz");

            }
            catch(RuntimeException e){
               e.printStackTrace();// bu hatayı en açıklamalı şekilde iletir
                e.getMessage();
            }

        }

        System.out.println("Main bitti");



    }
}
