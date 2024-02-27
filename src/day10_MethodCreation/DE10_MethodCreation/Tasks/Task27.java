package day10_MethodCreation.DE10_MethodCreation.Tasks;

import java.util.Scanner;

public class Task27 {
    /*
   task->
   belirli bir yukseklikten bırakılan top atildigi yuksekligin 3/4 u kadar yerden yukari dogru ziplamaktadir
    Topun ziplama  yuksekligi 1 metrenin altina dşütüğü ana kadar topun aldigi toplam yolu ve
    yere vurma sayisini print eden METHOD  create ediniz.
*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Topun bırakılacağı yükseklik ? : ");
        double yukseklik = scanner.nextDouble();
        int counter=0; // yere çarpma sayısı
        double toplamYol=0;
        while (yukseklik>=1) {
            counter++;
            toplamYol += yukseklik;
            yukseklik = ziplat(yukseklik);
            toplamYol += yukseklik;
        }
        System.out.println("Zıplama Sayısı = " + counter);
        System.out.println("toplamYol = " + toplamYol);
    }

    private static double ziplat(double yukseklik) {
        return yukseklik*3/4;
    }
}
