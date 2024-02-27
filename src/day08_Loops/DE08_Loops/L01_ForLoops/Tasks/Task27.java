package day08_Loops.DE08_Loops.L01_ForLoops.Tasks;

public class Task27 {
    public static void main(String[] args) {
            /* Ex-1: Asagidaki ciktiyi verecek kodu yaziniz
            1.
                        IT: 1
                          QA: 1
                          QA: 2
                          QA: 3
                          .....
                        IT: 2
                          QA: 1
                          QA: 2
                          QA: 3
                          ....
                        IT: 3
                          QA: 1
                          QA: 2
                          QA: 3
                          ....
         */
        for (int i = 1; i <=5 ; i++) {
            System.out.println("IT: "+i);
            System.out.println("\tQA: 1");
            System.out.println("\tQA: 2");
            System.out.println("\tQA: 3");
            System.out.println("\t.....");
        }
        // konularda yok, text block
        String str = """
                  QA: 1
                  QA: 2
                  QA: 3
                  .....
                """;
        for (int i = 1; i <=5 ; i++) {
            System.out.println("IT: "+i);
            System.out.println(str);
        }




    }
}
