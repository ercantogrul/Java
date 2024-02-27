package day07_StringManuplation.C01_StringManipulation;

public class C01_Concatenation {
    public static void main(String[] args) {

        String qa = "Sefvet";
        String lead = "Vedat";

        String birlesikString1 = qa + " "+lead;
       // String birlesikString2 = qa.concat(lead);
        String birlesikString2 = qa.concat(" ").concat(lead).toLowerCase();

        System.out.println(birlesikString1);
        System.out.println(birlesikString2);







    }
}
