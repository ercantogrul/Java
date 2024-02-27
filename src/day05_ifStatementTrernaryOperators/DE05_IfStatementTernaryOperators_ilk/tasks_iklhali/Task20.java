package day05_ifStatementTrernaryOperators.DE05_IfStatementTernaryOperators_ilk.tasks_iklhali;

import java.util.Scanner;

public class Task20 {
    /*
    etkinlik öneren program
    Koşullar :
    Sıcaklık 5'dan küçük ise "Kayak" yapmayı öner.
    Sıcaklık 5 ve 15 arasında ise "Sinema" etkinliğini öner.
    Sıcaklık 15 ve 25 arasında ise "Piknik" etkinliğini öner.
    Sıcaklık 25'ten büyük ise "Yüzme" etkinliğini öner.
     */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println(" sicakligi giriniz : ");
        int sicaklik = scan.nextInt();
        if (sicaklik<5){
            System.out.println("kayak yap");
        } else if ( sicaklik>=25 ) {
            System.out.println("yüzmeye git");
        } else if ( sicaklik>=15 ) {
            System.out.println("Piknik yap");
        }else if ( sicaklik>=5) {
            System.out.println("sinemaya git");
        }




    }
}
