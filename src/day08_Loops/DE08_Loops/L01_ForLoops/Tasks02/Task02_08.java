package day08_Loops.DE08_Loops.L01_ForLoops.Tasks02;

public class Task02_08 {
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


    }
}
