package day08_Loops.DE08_Loops_ilk.L01_ForLoops;

public class s3_rakkami_char_karaktere_cevirmek {
    public static void main(String[] args) {
       /* int bosluk = str.indexOf(" ");

        for (int i = 0; i < uzunluk; i++) {
            bosluk=bosluk+str.charAt(i);

        }
          */
        char c =65;

        for (int i = 0; i < 250; i++) {
            c= (char) i;   //   c=i; böyle iken casting yapiliyor
            System.out.print(c+"  ");

        }
        System.out.println();
        for (int i = 0; i < 250; i++) {

            System.out.printf("%-5d",i);

        }


    }
}