package asya_hoca_.asya_hoca_25_10;

public class s6______char {
    public static void main(String[] args) {
        //Enter a word
        //Convert "Java" to "J*a*v*a*"

        String str ="java";
        int n =str.length();
        String word="";
        char c=' ';

        for (int i = 0; i < n; i++) {
           c = str.charAt(i);
           //word =str.substring(i,i+1);
           // System.out.print(word+"*");   //iki farkli cözüm

            System.out.print(c+"*");

        }





    }
}
