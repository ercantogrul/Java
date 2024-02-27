package z_calismalar.OCI_sinav._223.Q207___;

public class test2 {
    public static void main(String[] args) {
        int[][] arr=new int[2][4];

        arr[0]=new int[]{1,3,5,7};
        arr[1]=new int[]{1,3};

        for (int[] a:arr){  // burasi önce arr[0] sonra arr[1] i alir
            for (int i = 0; i < arr[i].length; i++) {  // arr[i].length ile arr nin önce 0. elemaninin lenght i = 4 dür // ikinci turda arr[1].length=2 oldu   // ücüncü turda arr[2].length=ArrayIndexOutOfBoundsException firlatir cünkü 2. index de eleman yok
                System.out.print(a[i]+" "); // a[i] = 1 i yazdirir *** sonra i= 1 oldu                                  // a[i] = 3 i yazdirir *** sonra i= 2 oldu
            }
            System.out.println();
        }
        /*
         soru böyle olsa cevap D

         D.  1 3
        followed by an ArrayIndexOutOfBoundsException
         */
    }

}
