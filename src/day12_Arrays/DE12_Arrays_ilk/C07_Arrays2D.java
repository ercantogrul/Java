package day12_Arrays.DE12_Arrays_ilk;

public class C07_Arrays2D {
    public static void main(String[] args) {

        int [][] dizi= new int[10][5];
        int [][] dizi2= {{2,4},{1,4},{11,22},{44,45,11,4,6},{3,13}}; //[4][2]

        for (int i = 0; i < dizi2.length; i++) {
            for (int j = 0; j < dizi2[i].length; j++) {
                System.out.print(dizi2[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println(dizi2[2][1]);  // 22 yi direk verir
        System.out.println(dizi2.length);
        System.out.println(dizi2[0].length);
        System.out.println(dizi2[3].length);
    }
}
