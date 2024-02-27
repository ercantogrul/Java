package day12_Arrays.DE12_Arrays;

public class C07_Arrays2D {
    public static void main(String[] args) {
        int[][] dizi = new int[10][5];
        int[][] dizi2= {{2,4,6,1},{1,4,2},{11,22,66,55,1},{44,45,11,4,6},{3,13}}; //

        for (int i = 0; i <dizi2.length ; i++) {
            for (int j = 0; j <dizi2[i].length ; j++) {
                System.out.printf("%3d",dizi2[i][j]);
       //         System.out.printf("%2d,%2d = %3d\n",i,j,dizi2[i][j]);
            }
            System.out.println();
        }
//        System.out.println(dizi2.length);
//        System.out.println(dizi2[0].length);
//        System.out.println(dizi2[1].length);
//        System.out.println(dizi2[2].length);
//        System.out.println(dizi2[3].length);
//        System.out.println(dizi2[4].length);

    }
}
