package day08_Loops.DE08_Loops.L01_ForLoops.Tasks02;

public class Task02_10 {
    public static void main(String[] args) {
        // Verilen string içerisinde bazı rakamlar vardır, bu rakamlar için kaç adet 0, kaç adet 1,
        // ... kaç adet 9 vardır her birini ayrı ayrı hesaplayıp yazdırınız
        String str = "db345hfdasf7861249458";
        int birSayisi   = 0;
        int ikiSayisi   = 0;
        int ucSayisi    = 0;
        int dortSayisi  = 0;
        int besSayisi   = 0;
        int altiSayisi  = 0;
        int yediSayisi  = 0;
        int sekizSayisi = 0;
        int dokuzSayisi = 0;
        int sifirSayisi = 0;
        for (int i = 0; i <str.length() ; i++) {
            char ch = str.charAt(i);
            if (Character.isDigit(ch)){
                switch (ch){
                    case '0' -> sifirSayisi++;
                    case '1' -> birSayisi++;
                    case '2' -> ikiSayisi++;
                    case '3' -> ucSayisi++;
                    case '4' -> dortSayisi++;
                    case '5' -> besSayisi++;
                    case '6' -> altiSayisi++;
                    case '7' -> yediSayisi++;
                    case '8' -> sekizSayisi++;
                    case '9' -> dokuzSayisi++;
                }
            }
        }
        System.out.println("sifirSayisi = " + sifirSayisi);
        System.out.println("birSayisi   = " + birSayisi);
        System.out.println("ikiSayisi   = " + ikiSayisi);
        System.out.println("ucSayisi    = " + ucSayisi);
        System.out.println("dortSayisi  = " + dortSayisi);
        System.out.println("besSayisi   = " + besSayisi);
        System.out.println("altiSayisi  = " + altiSayisi);
        System.out.println("yediSayisi  = " + yediSayisi);
        System.out.println("sekizSayisi = " + sekizSayisi);
        System.out.println("dokuzSayisi = " + dokuzSayisi);


    }
}
