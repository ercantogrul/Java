package z_calismalar.OCI_sinav._223.Q015;

public class zeneme {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("Duke");
        StringBuilder sb2 = new StringBuilder("Duke");
        String str1 = sb1.toString();


        System.out.println("sb1 = " + sb1);  // Duke
        System.out.println("str1.equals(sb1) = " + str1.equals(sb1)); //false

        String str2 = str1;
        System.out.println("str2.equals(str1) = " + str2.equals(str1)); //true
        System.out.println(str1==str2); //true

        String str3=sb1.toString();
        System.out.println("str3.equals(str1) = " + str3.equals(str1)); //true
        System.out.println(str3==str1); //false


    }

}
