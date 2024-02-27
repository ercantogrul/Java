package z_calismalar.OCI_sinav._223.Q207___;

public class test1 {
    public static void main(String[] args) {
        int[][] arr=new int[2][4];

        arr[0]=new int[]{1,3,5,7};
        arr[1]=new int[]{1,3};  // yeni hali

        for (int[] a:arr){  // burasi önce arr[0] sonra arr[1] i alir
            for (int i = 0; i < a.length; i++) {
                System.out.print(a[i]+" ");
            }
            System.out.println();
            /*

            soru böyle olsa cevap A
               1 3 5 7
               1 3
             */
        }
    }
}

