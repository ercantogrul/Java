package day08_Loops.DE08_Loops_ilk.L01_ForLoops.Tasks;

import java.util.Scanner;

public class Task02__polidrom {
    public static void main(String[] args) {
        /* task-> interview question
        girilen ifadenin polindrome olmasını kontrol eden code create ediniz...
        plindrome:her iki yönde okundugunda eşit olan ifadeler :
        örnekler
        "ece"
        "ada"
        "ey edip adanada pide ye"

         */

        Scanner sc = new Scanner(System.in);
        System.out.print("bir metin  giriniz : ");
        String str = sc.nextLine();
        int n = str.length();
        int sI= n-1;
        boolean polidromdur=true;

        for (int i = 0; i <n/2 ; i++) {
           if (str.charAt(i) != str.charAt(sI-i)) {  //adana i=0. indexteki karakter ==a----(si-i (0)) =4. index teki karakter ==a
               polidromdur=false;                    // i=1==d---------(si-i (1)) =3 ==n
               break;
            }
        }
        if (polidromdur) System.out.println("polidromdur");
        else System.out.println("polidrom değildir");

        // 2. yol   adada=================================================
        int sayac=0;
        for (int i = 0; i <n ; i++) {
             if (str.charAt(i) == str.charAt(sI-i)) {
                 sayac++;
             }
        }
        if (sayac==n) System.out.println("polidromdur");
        else System.out.println("polidrom değildir");

        // 3.yol==============================================================
        sayac=0;
        for (int i = 0; i <n ; i++) {
            if (str.charAt(i) != str.charAt(sI-i)) {
                sayac++;
                break;
            }
        }
        if (sayac==0) System.out.println("poidromdur");
        else System.out.println("polidrom değildir");

        //4.yol================================================================
       polidromdur=true;
        for (int i = 0; i <n ; i++) {
            if (str.charAt(i) != str.charAt(sI-i)) {
               polidromdur=false;
               break; // içinde bulunduğu loop dan çıkılmasını sağlar
            }
        }
        if (polidromdur) System.out.println("poidromdur");
        else System.out.println("polidrom değildir");

        //////================farjkli yöntem


        Scanner scan = new Scanner(System.in);
        System.out.print("bir metin  giriniz : ");
        String metin = scan.nextLine();
        String tersStr = "";//bos bir String kutu kulah
        int n1 = metin.length();

        String tMetin = "";

        for (int i = (n1-1); i >=0 ; i--) {
            tMetin = tMetin+metin.charAt(i);
            // System.out.print(metin.charAt(i));   // kisa yoldan ters metin bu sekildede yazdilabilir
        }
        System.out.println(tMetin);

        if (tMetin.equalsIgnoreCase(metin)) {
            System.out.println("palindromdur");
        }else System.out.println("palindrom degildir");





    }


}
