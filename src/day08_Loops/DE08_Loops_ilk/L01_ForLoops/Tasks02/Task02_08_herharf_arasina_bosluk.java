package day08_Loops.DE08_Loops_ilk.L01_ForLoops.Tasks02;

import java.util.Scanner;

public class Task02_08_herharf_arasina_bosluk {
    public static void main(String[] args) {
        // Bir string veriliyor, for kullanarak her harf arasına bir boşluk gelecek  şekilde yazdırın


        String str = "Selamlar";
        for (int i = 0; i <str.length() ; i++) {
            System.out.print(str.charAt(i)+" ");
        }
        System.out.println();
        // 2.yol
        for (int i = 0; i <str.length() ; i++) {
            System.out.printf("%-2s",str.charAt(i));
        }

//==================================================
        Scanner scan =new Scanner(System.in);
        System.out.println("bir ifade giriniz");
        String str1 = scan.nextLine();
        int n = str1.length();
        String ifade ="";

        for (int i = 0; i < n; i++) {
            ifade =ifade+str1.charAt(i)+" ";
        }
        System.out.println(ifade);


    }
}
