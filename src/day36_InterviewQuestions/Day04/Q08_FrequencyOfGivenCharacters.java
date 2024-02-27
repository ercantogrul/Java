package day36_InterviewQuestions.Day04;

public class Q08_FrequencyOfGivenCharacters {
	/*
   Interview sorusu...
   Verilen bir metindeki harflerin frekansını(tekrar sayısı) bulup yazdıran bir METHOD yazınız.

   Test data:
   Input = AAABBCDD
   output = A3B2C1D2
           */

    public static void main(String[] args) {
        String str = "aaabbabbbccaccccccaq";
        String str2 = str;

        String harf = "";
        int counter = 0;
        for (int i = 0; i < str2.length(); i++) {
            if (str.length()>0){
                harf = str.substring(0,1);
                counter = 0;
                for (int j = 0; j < str.length(); j++) {
                    if (harf.equals(str.substring(j,j+1))){
                        counter++;
                    }
                }
            }else break;
            System.out.println("Metinde ki "+harf+" harfi "+counter+ " adettir.");
            str= str.replace(harf,"");


        }

    }


}
