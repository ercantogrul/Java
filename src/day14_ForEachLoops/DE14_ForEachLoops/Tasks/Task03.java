package day14_ForEachLoops.DE14_ForEachLoops.Tasks;

public class Task03 {
    public static void main(String[] args) {
        double[] arr = {23, 55, 66.5, 35, 55.7, 90,};
        // yukarıdaki şekilde bir array içerisinde öğrencilerin notları verilmiştir
        //  49.5 ve üstü alan öğrenciler sınıfı geçmiştir,
        //  ayrıca ortalamadan daha yukarı not alanlar da sınıfı geçmiştir
        // sınıfı geçemeyenlerin notlarını yazdırın , for-each ile yapın

        double toplam =0;
        double ortalama =0;

        for (double sayi:arr) {
            toplam+=sayi;
            ortalama =toplam/arr.length;
            if (sayi>=49.5 ||sayi>ortalama ){
                System.out.println("Sinifi gectiniz ");

            }else System.out.println("Sinifi Gecemediniz    Notunuz : "+sayi);

        }




    }

}
