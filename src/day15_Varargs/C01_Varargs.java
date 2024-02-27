package day15_Varargs;

public class C01_Varargs {
    public static void main(String[] args) {

        toplama ("Sayilar toplami :",4,5,6,8,2,3,4,5,6);
        int [] dizi ={4,6,8,2,5};
        toplama("dizi toplami :", dizi);

        toplama ();
    }

    private static void toplama(String str,int...sayilar) {
        System.out.println(sayilar.length);
        System.out.println(str);

        for (int sayi : sayilar) {
            System.out.print(sayi+" ");
        }

        System.out.println();

        System.out.println("---------");
    }

    private static void toplama (){ // toplama adinda iki method yazdik, parametreleri farkli (overloading )
        System.out.println("veri yokki toplayayim ");

    }
}
