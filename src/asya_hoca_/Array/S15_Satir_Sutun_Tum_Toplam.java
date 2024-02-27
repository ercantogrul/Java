package asya_hoca_.Array;

public class S15_Satir_Sutun_Tum_Toplam {
    public static void main(String[] args) {
        /*
        int[][] arr={{5,4,9,7},{3,5,7,8},{4,0,8,9}};
       //Dizinin tüm elemanlarının toplamı
       //Her satırın ve sütunun toplamı
         */
        int[][] arr={{5,4,9,7},{3,5,7,8},{4,0,8,9}};
        int sum=0;
        int satır;
        int sutun;

        for (int i = 0; i < arr.length; i++) {//row satır dizinin ilk elemanına ulaşmak için {5,4,7,9}
            satır=0;
            sutun=0;

            for (int j=0; j < arr[i].length; j++) {//column sutun
                sum+=arr[i][j];
                satır+=arr[i][j];
            }

            for (int j = 0; j < arr.length; j++) {// sütunlara ulaşmak için
                sutun+=arr[j][i];
            }

            System.out.println(i+". satırın toplamı: "+satır);
            System.out.println(i+". sutunun toplamı: "+sutun);
        }
        System.out.println("Dizinin tüm elemanlarının toplamı:"+sum);


    }
}
