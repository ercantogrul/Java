package day08_Loops.DE08_Loops_ilk.L01_ForLoops.Tasks02;

import java.util.Scanner;

public class Task02_09__bir_buyuk_bir_Kucuk_Yazdir {
    public static void main(String[] args) {
        // Bir string veriliyor, for kullanarak her harf arasına bir boşluk gelecek  şekilde yazdırın
        // ama yazarken ilk harf büyük olsun ve sonrası bir küçük, bir büyük harf olarak devam etsin
        // str de boşluk olması dikkate alınmadı


        Scanner scan =new Scanner(System.in);
        System.out.println("bir ifade giriniz");
        String str = scan.nextLine();

        for (int i = 0; i < str.length(); i++) {
            if(i%2==0) {System.out.print(str.substring(i,i+1).toUpperCase()+" ");  // cift indekx deki harfleri büyük yazdir
                                                                                   // i ciftse i,i+1 i al büyüt ve yazdir
            }else System.out.print(str.substring(i,i+1).toLowerCase()+" ");
        }
        //===========================================
        System.out.println("ikinci yöntem=======");
        String ifade="";
        for (int i = 0; i < str.length(); i++) {
            if(i%2==0) {System.out.print(ifade+str.toUpperCase().charAt(i)+" ");
            }else System.out.print(ifade+str.toLowerCase().charAt(i)+" ");
        }
        System.out.println(ifade);



/*


*/



    }
}
