package asya_hoca_.Array;

public class C01_2D_dolar_euro {
    public static void main(String[] args) {
        /*
         *  String 2D array olustur
         *  {{"$12" , "$22" , "0$"},   {"€9" , "€40" , "$1" },  {"€12", "$2","$0"}}
         *  String de $ varsa 3.2 ile carp
         *  String de € varsa 4.2 ile carp
         *  elemanlarin toplamini double olarak yazdir
         */

        String[][] arr = {{"$12", "$22", "0$"}, {"€9", "€40", "$1"}, {"€12", "$2", "$0"}};
        int dolarToplam = 0;
        int euroToplam = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j].contains("$")) {
                    dolarToplam += Integer.parseInt(arr[i][j].replace("$", ""));
                } else {
                    euroToplam += Integer.parseInt(arr[i][j].replace("€", ""));
                }
            }
        }
        System.out.println("dolarToplam = " + dolarToplam * 3.2);
        System.out.println("euroToplam = " + euroToplam * 4.2);


    }
}
