package day12_Arrays.DE12_Arrays_ilk;

public class C01_Arrays {
    public static void main(String[] args) {
        // String str = "h,a,s,a,n";
        int [] aDizisi = {10,20,11,23,12}; // 5 belemanı dizi tanımladık
        int [] bDizisi = new int[10]; // 10 elemanlı dizi tanımladık , tüm elemanlar başlangıcta 0
      //  System.out.println(aDizisi[1]+bDizisi[2]);
        int temp = aDizisi[1]; // temp=20;
                                //  10,20,11,23,12
        aDizisi[1] = aDizisi[2]; // 10,11,11,23,12
        aDizisi[2] = temp;      //  10,11,20,23,12
   //     System.out.print("aDizisi = ");
    /*    for (int i = 0; i <aDizisi.length ; i++) { // aDizsini baştan sona yazdırdık
            System.out.print(aDizisi[i]+",");
        }
        System.out.println();
        System.out.print("bDizisi = ");
        for (int i = 0; i <bDizisi.length ; i++) {
            System.out.print(bDizisi[i]+",");
        }
      */
        // aDizisinin elemanlarının toplamını bulunuz
        int toplam = 0;
        for (int i = 0; i <aDizisi.length ; i++) {
            toplam += aDizisi[i];

        }
//        System.out.println("toplam = " + toplam);
//        String str1 ="mehmet";
//        for (int i = 0; i <str1.length() ; i++) {
//            System.out.println(str1.charAt(i));
//        }
    }
}
