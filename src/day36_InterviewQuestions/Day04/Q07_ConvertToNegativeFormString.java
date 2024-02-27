package day36_InterviewQuestions.Day04;

public class Q07_ConvertToNegativeFormString {
    /*
      Convert the given Array to negative form sentence into a String.

      Input:
      String[] arr={"J","a","v","a","I","s","D","i","f","f","i","c","u","l","t"};

      Output:
      String output ="JavaIsNOTDifficult";
       */

    public static void main(String[] args) {
        String[] arr={"J","a","v","a","I","s","D","i","f","f","i","c","u","l","t"};
        String str = "NOT";
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i==5) {
                arr[i]=(str);
                System.out.print(arr[i]);
            }


        }

    }



}
