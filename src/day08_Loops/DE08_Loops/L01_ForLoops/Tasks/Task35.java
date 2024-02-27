package day08_Loops.DE08_Loops.L01_ForLoops.Tasks;

public class Task35 {
    public static void main(String[] args) {

        // verilen sayi adedince fibonacci serisinden sayilar yazdiran bir method olusturun
        // Fibonacci serisi = 0 1 1 2 3 5 8 13 21 34 .........
        // serinin ilk elemanı 0, sonraki, 1, daha sonrakiler ise kendinden önce gelen 2 elemanın toplamıdır
        int ikiOnceki=0;
        int birOnceki=1;
        System.out.print(ikiOnceki+" "+birOnceki+" ");
        // verine sayı n olsun
        int n=10;
        for (int i = 2; i <n ; i++) {
            int eleman=ikiOnceki+birOnceki;
            System.out.print(eleman+" ");
            // bir sonraki elemanı bulmak için alt 2 satursa hazırlık yapıyoruz
            ikiOnceki = birOnceki;
            birOnceki = eleman;
        }
        // 0 1 1 ?
    }

    public static void fibonaccidenSayiYazdir(int adet) {





    }
}
