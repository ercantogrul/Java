package z_calismalar.OCI_sinav._223.Q008___Arrays;

public class test {
    public static void main(String[] args) {
        String [] [] arr = {{"A", "B", "C"}, {"D", "E"}};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+ " " );
                if (arr[i][j].equals("B")) {
                    break;
                    // continue; // bir etkisi yok

                }
            }
            continue;
        }

        //A B D E
    }
}
