package day12_Arrays.DE12_Arrays_ilk.Tasks;

public class Task14_Stringdeki_rakkamlar_toplami {
    public static void main(String[] args) {
        /*  TASK :
        Write a method which accepts  string as parameter and prints the sum of digits
        present in thr given string
         verilen Stringde bulunan rakamların toplamını print eden parametreli METHOD create ediniz.
        input :"ade1r4d3"
        output : 8
        trick : Use --> Character.isDigit()
                    --> Integer.valueOf()
         */
        String str = "ade1r4d3";
        int n = str.length();

        rakamlarToplami(str, n);
        rakamlarToplami2(str, n);
        rakamlarToplami3(str, n);


    }

    private static void rakamlarToplami3(String str, int n) {
        char [] dizi = str.toCharArray();
        int toplam =0;

    }

    private static void rakamlarToplami2(String str, int n) {
        int sum = 0;
        String yeni = str.replaceAll("[^0-9]", "");
        for (int i = 0; i < yeni.length(); i++) {
            sum += Integer.parseInt(yeni.substring(i,i+1));

        } System.out.println("toplam = " + sum);

    }

    private static void rakamlarToplami(String str, int n) {
        int sum = 0;

        for (int i = 0; i < n; i++) {
            if (Character.isDigit(str.charAt(i))) {
                int ch = Integer.parseInt("" + str.charAt(i));/*once stringe "" ile toplayarak stringe cevirdik
                                                                 sonra Integer ile int yaptik*/
                sum += ch;
            }
        }
        System.out.println("sum = " + sum);
    }


}

