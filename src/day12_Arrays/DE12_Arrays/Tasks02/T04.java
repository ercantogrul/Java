package day12_Arrays.DE12_Arrays.Tasks02;

public class T04 {
    // Dizi için contains metodu yazınız, geri dönüş tipi boolean olsun
    public static void main(String[] args) {
        int[] dizi ={4,6,11,22,55,77};
        int aranan = 22;

        if (contains(dizi,aranan)) System.out.println(aranan+" dizde vardır");
        else System.out.println(aranan+ " dizide yoktur");
    }

    private static boolean contains(int[] dizi,int aranan) {
        boolean sonuc = false;
        for (int i = 0; i < dizi.length ; i++) {
            if (dizi[i] == aranan) sonuc=true;
        }
        return sonuc;
    }


}
