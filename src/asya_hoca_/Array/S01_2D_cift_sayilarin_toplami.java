package asya_hoca_.Array;

public class S01_2D_cift_sayilarin_toplami {
    public static void main(String[] args) {
        /*
         * Girilen Multidimensional arraydeki cift sayilari toplayan bir METHOD
         * yaziniz(return type int)
         * INPUT : {{1,3,6},{2,8},{5,7,9,14}}
         *
         * OUTPUT : Arraydeki cift sayilarin toplami : 30
         */

        int[][] arr ={{1,3,6},{2,8},{5,7,9,14}};


        int sayilarintoplami = ciftSayilarinToplami(arr);
        System.out.println(sayilarintoplami);



    }

    private static int ciftSayilarinToplami(int[][] arr) {
        int cSayilarintoplam =0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j]%2==0){
                    cSayilarintoplam+=arr[i][j];
                }
            }
        }

      return cSayilarintoplam;
    }
}
