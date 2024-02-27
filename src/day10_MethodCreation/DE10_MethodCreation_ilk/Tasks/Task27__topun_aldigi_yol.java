package day10_MethodCreation.DE10_MethodCreation_ilk.Tasks;

import java.util.Scanner;

public class Task27__topun_aldigi_yol {
    /*
   task->
   belirli bir yukseklikten bırakılan top atildigi yuksekligin 3/4 u kadar yerden yukari dogru ziplamaktadir
    Topun ziplama  yuksekligi 1 metrenin altina dşütüğü ana kadar topun aldigi toplam yolu ve yere vurma sayisini print eden METHOD  create ediniz.
*/
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("topu biraktiginiz yüksekligi giriniz: ");
        double yukseklik = scan.nextDouble();

     topunAldigiYol(yukseklik);

    }

    private static void topunAldigiYol(double yukseklik) {
        double toplamYol =0;
        int counter =0;

        do{
            if(yukseklik<1) break;
            double indYuk =yukseklik;
            counter++;
            double cikYukseklik = (yukseklik*3)/4;
            toplamYol += indYuk+cikYukseklik;
            yukseklik=cikYukseklik;

        }while (yukseklik>=1);
        System.out.println("topun aldigi toplam yol:"+toplamYol);
        System.out.println("ziplama sayisi;"+counter);

    }
}
