package day12_Arrays.DE12_Arrays;

public class C05_Arrays {
    public static void main(String[] args) {
        System.out.println(args.length);
        int aaa = 10;
        yazKare(10);
        yazKup();
        int sonuc = carp(5,aaa);
        carp(10,3);
        System.out.println(carp(10,7));
        
    }
    private static void yazKare(int hasan) {
        System.out.println("kare yaz=" + (hasan*hasan));
    }
    private static void yazKup(){
        int bb=5;
        yazKare(bb);
        yazKare(7);
    }
    private static int carp(int biriciSayi ,int ikinciSayi){
        int result = biriciSayi*ikinciSayi;
        System.out.println(result);
        return result;
    }


}
