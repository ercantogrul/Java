package day12_Arrays.DE12_Arrays;

public class C03_Arrays {
    public static void main(String[] args) {
        String[] sDizi = {"Ali","Güllü","Asu","Mehmet","Hasan"};
        int[] uzunluklar=new int [sDizi.length];
        uzunluklar = uzunluklariYerlestir(sDizi);
    }

    private static int[] uzunluklariYerlestir(String[] sDizi) {
        int [] dizi = new int[sDizi.length];
        for (int i = 0; i < dizi.length ; i++) {
            dizi[i] = sDizi[i].length();
        }
        return dizi;
    }


}
