package day12_Arrays;

public class C01_Arrays {
    public static void main(String[] args) {
        // String str = "h,a,s,a,n";
        int [] aDizisi = {10,20,11,23,12}; // 5 elemanli dizi tanimladik
        int [] bDizisi = new int [10]; // 10 elemanli dizi tanimladik,tüm elemanlar baslangicta 0 
        int [] cDizisi = new int [] {11,23,12}; // diziler bu 3 sekilde tanimlanabilirler

        System.out.println(aDizisi[1]+bDizisi[2]);
        int temp = aDizisi[1]; //temp =20;
        //10,20,11,23,12,
        aDizisi[1] = aDizisi[2];    //10,11,11,23,12,
        aDizisi[2] = temp;         //10,11,20,23,12,
        for (int i = 0; i < aDizisi.length; i++) {
            System.out.println(aDizisi[i]+", "); //10,20,11,23,12
        }
        System.out.println();
        //====================================================================
        for (int i = 0; i < bDizisi.length; i++) {
            System.out.print(bDizisi[i]+ ","); // 00000000000ß 10 tane
        }

        //aDizisinin elemanlarinin toplami======================================
        System.out.println();
        int toplam =0;
        for (int i = 0; i < aDizisi.length; i++) {
            toplam=toplam+aDizisi[i];
        }
        System.out.println(toplam); //76
        
        
    }
}
