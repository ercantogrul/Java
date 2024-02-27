package day36_InterviewQuestions.Day04;


import java.util.Arrays;

public class Q13_DuplicateValue___ {
       /*
        Write a code that returns the duplicate chars in a String array.
        (interview Question)
        Input :
        String str=“Javaisalsoeasy”
        Output: [a, s]
         */

    public static void main(String[] args) {
        String str = "Javaisalsoeasy";
        String str2 = "";
        String output = "";

        String[] arr = str.split("");
        System.out.println(Arrays.toString(arr));
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            count=0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i].contains(arr[j])) {
                    count++;
                }
                if (count>=2 && (!output.contains(arr[i]))){
                    output+=arr[i];
                }
            }
        }
        String [] out = output.split("");
        System.out.println(Arrays.toString(out));

        // ikinci yol
        ikinciYol(str);

    }

    private static void ikinciYol(String str) {

        String str2 ="";
        String output = "";
        for (int i = 0; i < str.length(); i++) {
            String harf = str.substring(i,i+1);
            if (output.contains(harf)){
                if (!str2.contains(harf))
                    str2+=harf;
            }else {
                output+=harf;
            }
        }
        System.out.println(str2);

    }


}

