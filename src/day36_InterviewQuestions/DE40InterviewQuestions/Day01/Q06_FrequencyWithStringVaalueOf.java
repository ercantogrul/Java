package day36_InterviewQuestions.DE40InterviewQuestions.Day01;

public class Q06_FrequencyWithStringVaalueOf {
      /*
    Count the frequency of the letters in a given String as the format below:
    Input: String str = "Java is so Good";
    Output: String strOutput = "J1 a2 v1 i1 s2 o3 G1 d1";
     */
      public static void main(String[] args) {
          String str = "Java is so Good";
          String outPut="";

          for (int i = 0; i <str.length() ; i++) {
              int counter=0;
              String ilk=str.substring(i,i+1);
              for (int j = 0; j <str.length() ; j++) {
                  if (ilk.equals(str.substring(j,j+1))) counter++;
              }
              if (!outPut.contains(ilk))   outPut=outPut+ilk+counter+" ";

          }
          System.out.println(outPut);



      }


}
