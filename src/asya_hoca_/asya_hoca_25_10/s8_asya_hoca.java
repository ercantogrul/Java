package asya_hoca_.asya_hoca_25_10;

public class s8_asya_hoca {
    //Print number ,letter and character
    //String str= "AsyaCool123^+%&"
    //Print number ,letter and character

    //digit:34
    //charater:!'%&/(
    //letter:AsyaCool

    public static void main(String[] args) {

        String str = "AsyaCool!'34%&/(";
        String digit = "";
        String letter = "";
        String charater = "";
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            if (c >= '0' && c <= '9') {
                digit = digit + c;
            } else if (c >= 'a' && c <= 'z') {
                letter += c;
            } else if (c >= 'A' && c <= 'Z') {
                letter += c;
            } else {
                charater += c;
            }


        }
        System.out.println("digit:"+digit);
        System.out.println("charater:"+charater);
        System.out.println("letter:"+letter);















    }


}
