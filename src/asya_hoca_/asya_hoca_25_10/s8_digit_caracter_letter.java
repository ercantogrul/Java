package asya_hoca_.asya_hoca_25_10;

public class s8_digit_caracter_letter {
    public static void main(String[] args) {
        //Print number ,letter and character
        //String str= "AsyaCool123^+%&"
        //Print number ,letter and character

        //digit:34
        //charater:!'%&/(
        //letter:AsyaCool

        String str= "AsyaCool123^+%&";
        int n = str.length();

        String letter= str.replaceAll("[^a-zA-Z]","");
        String digit =str.replaceAll("[^0-9]","");
        String karakter = str.replaceAll("[0-9]","");
        karakter =karakter.replaceAll("[a-zA-Z]","");
        System.out.println("digit = " + digit);
        System.out.println("karakter = " + karakter);
        System.out.println("letter = " + letter);



        System.out.println("===================");
//==============================ikinci yol daha kolay===========================================

        String digit1 = "";
        String letter1 = "";
        String charater1 = "";
        char c ;

        for (int i = 0; i <n ; i++) {
            c = str.charAt(i);
            if(Character.isDigit(c)){
                digit1 +=c;
            } else if (Character.isLetter(c)) {
                letter1 +=c;
            }else charater1 +=c;

        }
        System.out.println("digit :"+digit1);
        System.out.println("letter: "+letter1);
        System.out.println("caracter: "+charater1);


        //=====================================================




    }
}
