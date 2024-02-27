package day36_InterviewQuestions.Day01;

public class Q06_FrequencyWithStringVaalueOf_ {
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

      //ikinci yol================================
          int counter1=0;
          String harf1="";
          str=str.trim().replace(" ","");
          String str2= str;

          for (int i = 0; i < str2.length(); i++) {
              if (str.length() > 0) {
                  counter1 = 0;
                  harf1 = str.substring(0, 1);
                  for (int j = 0; j < str.length(); j++) {
                      if (harf1.equals(str.substring(j, j + 1))) {
                          counter1++;
                      }
                  }
              }else break;
              System.out.print(harf1+counter1 +" ");
              str = str.replace(harf1, "");

          }





      }


}
