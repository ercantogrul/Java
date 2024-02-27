package z_calismalar.ch01_JavaIntro.soru_8;

public class Test {
    public static void main(String[] args) {
        String[][] arr = {{"A", "B", "C"},{"D", "E"}};
        for (int i =0; i < arr.length; i++){
            for (int j =0; j < arr[i].length; j++){
                System.out.println(arr[i][j] + " ");
                if(arr[i][j].equals("B")){
                    continue;
                }
            }
            continue;
        }
    }
}
