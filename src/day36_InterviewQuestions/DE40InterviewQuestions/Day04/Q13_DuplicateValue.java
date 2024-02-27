package day36_InterviewQuestions.DE40InterviewQuestions.Day04;


import java.util.ArrayList;

public class Q13_DuplicateValue {
       /*
        Write a code that returns the duplicate chars in a String array.
        (interview Question)
        Input :
        String str=“Javaisalsoeasy”
        Output: [a, s]
         */

    public static void main(String[] args) {
//        String str="Javaisalsoeasy";
//        String str2=str;
//        String output="";

        String str = "JJavaisalsoeasy";
        String str2 = "";
        String output = "";

        for (int i = 0; i < str.length(); i++) {
            String harf=str.substring(i, i + 1);

            if (output.contains(harf)) {
                if (!str2.contains(harf))
                    str2+=harf+", ";

            } else {
                output += harf;
            }
        }
        System.out.println(str2);


    }
    private static void cozum2(){
        String str="Javaisalsoeasy";
        String str2=str;
        String output="";
        while(str2.length()>1) {
            String st=str2.substring(0,1);
            int uzunluk=str2.length();
            str2=str2.replaceAll(st,"");
            if (str2.length()<uzunluk-1) output+=st;
        }
        System.out.println("Result = "+output);
        ArrayList<String> dizi = new ArrayList<>();
        for (int i = 0; i <output.length() ; i++) {
            dizi.add(output.substring(i,i+1));
        }
        System.out.println(dizi);
    }
    

}

