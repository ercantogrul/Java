package day15_Varargs.DE15_Varargs_ilk;

public class C00_Varargs {
    public static void main(String[] args) {
        toplama("Sayılar toplamı : ",4,5,6,18,2,3,4,5,6);
        int[] dizi = {4,6,8,2,5};
        toplama("dizi toplamı : ",dizi);
        toplama();
    }

    private static void toplama(String str,int...sayilar) {
        System.out.println(sayilar.length);
        System.out.print(str);
        for (int sayi : sayilar) {
            System.out.print(sayi+" ");
        }
        System.out.println();
        System.out.println("-----------");
    }
    private  static void toplama() {
        // toplama adında iki metot yazdık, parametreleri farklı(overloading yapmış olduk)
        System.out.println("veri yok ki göstereyim ");
    }

}
