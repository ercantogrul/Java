package day36_InterviewQuestions.Day03;

import java.util.ArrayList;

public class Q04_TestKeyword {
    /*
    ogrencilerin test sonuclarini degerlendiren Java kodunu method kullanarak yaziniz
    //ogrencilerin cevaplari
    char[][] answers = {
    {'A', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
    {'D', 'B', 'A', 'B', 'C', 'A', 'E', 'E', 'A', 'D'},
    {'E', 'D', 'D', 'A', 'C', 'B', 'E', 'E', 'A', 'D'},
    {'C', 'B', 'A', 'E', 'D', 'C', 'E', 'E', 'A', 'D'},
    {'A', 'B', 'D', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
    {'B', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
    {'B', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
    {'E', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'}};
    *
    * // cevap anahtari
    char[] keys = {'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D'};

    output:
    1 nolu ogrencinin 7 dogru cevabi var.
    2 nolu ogrencinin 6 dogru cevabi var.
       "           "
       "           "
       "           "
    8 nolu ogrencinin 7 dogru cevabi var.
*/
    public static void main(String[] args) {
        char[][] answers = {
                      {'A', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                      {'D', 'B', 'A', 'B', 'C', 'A', 'E', 'E', 'A', 'D'},
                      {'E', 'D', 'D', 'A', 'C', 'B', 'E', 'E', 'A', 'D'},
                      {'C', 'B', 'A', 'E', 'D', 'C', 'E', 'E', 'A', 'D'},
                      {'A', 'B', 'D', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                      {'B', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                      {'B', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                      {'E', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'}};
        char[] keys = {'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D'};

        testSonucuDegerlendirme(answers,keys);
        testSonucu(answers,keys);
        System.out.println("doğruları da gösterelim");
        testSonucu2(answers,keys);

    }

    private static void testSonucu2(char[][] answers, char[] keys) {
        for (int i = 0; i <answers.length ; i++) {
            int counter=0;
            System.out.print((i+1)+". öğrenci ");
            for (int j = 0; j <answers[i].length ; j++) {
                if (answers[i][j]== keys[j]){
                    counter++;
                    System.out.print(j+" ");
                }
            }
            System.out.println(" soruları yapmıştır "+ counter+" adettir");
        }
    }

    private static void testSonucu(char[][] answers, char[] keys) {
        for (int i = 0; i <answers.length ; i++) {
            int counter=0;
            for (int j = 0; j <answers[i].length ; j++) {
                if (answers[i][j]== keys[j]){
                    counter++;
                }
            }
            System.out.println((i+1)+". öğrenci "+counter+" doğru cevap yapmıştır");
        }
    }

    private static void testSonucuDegerlendirme(char[][] answers, char[] keys) {
        ArrayList<Character> list = new ArrayList<>(); // bos bir List tanimladik

        int count=0;
        for (int i = 0; i < answers.length; i++) {
            count=0;
            for (int j = 0; j < answers[i].length; j++) {
                list.add(answers[i][j]);  // her bir elemani List e aktardik

                if (list.get(j).equals(keys[j])) { // List deki her bir eleman sirayla..., kendi sirasindaki KEY e esitse count'u bir attirdik
                   count++;
                }
            } System.out.println(i+" nolu ogrencinin "+count+ " dogru cevabi var.");
            list.clear(); // bir sonraki ögrenci icin listi sildik
        }




    }


}
