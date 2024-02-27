package z_calismalar.OCI_sinav._223.Q207___;

public class Q207 {
    public static void main(String[] args) {
        int[][] arr=new int[2][4];

        arr[0]=new int[]{1,3,5,7};
        arr[1]=new int[]{1,3};

        for (int[] a:arr){  // burasi önce arr[0] sonra arr[1] i alir
            for (int i = 0; i < arr.length; i++) {  // lengt 2 dir yani  2 tur atacak her bir eleman icin
                System.out.print(a[i]+" ");
                // ilk turda birinci elemanin 1 ve 3 olan elemanlarini yazdirir
                // ikinci turda ikinci elemanin 1 ve 3 olan elemanini yazdirir.
            }
            System.out.println();
 	        }
       }}
    /*
    what is the result?
    A.  1 3 5 7
        1 3

    B.  1 3
        1 3

    C.  1 3
        1 3 0 0

    D.  1 3
        followed by an ArrayIndexOutOfBoundsException

    E. Compilation fails
    */
    //Answer B  aciklamsi var v18

