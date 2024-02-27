package day36_InterviewQuestions.DE40InterviewQuestions.Day04;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Q03_CountFactors {
      /*
        Type java code by using while loop,
       Write a program to count the factors of an integer which is entered by user.
       Factors of 12 = 1, 2, 3, 4, 6, 12 ==> 6
       Factors of 8  = 1, 2, 4, 8 ==> 4
*/
      public static void main(String[] args) {
          Scanner scan = new Scanner(System.in);
          System.out.print("carpanlarini bulmak istediginiz sayiyi giriniz :");
          int sayi = scan.nextInt();
          int counter = 0;
          for (int i = 1; i <=sayi ; i++) {
              if (sayi%i == 0) {
                  counter++;
                  System.out.print(i+" ");
              }
          }
          System.out.println();
          System.out.println(counter+" adet çarpan vardır");
          lamdaCozumu(sayi);
      }
      private static void lamdaCozumu(int sayi){
          /*  Stream.iterate(a, b, c)
          a : başlangıc
          b : kontrol, bu şart sağlandığı sürece üretime devam et
          c : yeni elemanın hesaplanışı
           */
          List<Integer> list =
                  Stream.iterate(1, p->p<=sayi, p->p+1)
                  .filter(p->sayi%p==0)
                  .toList();
          System.out.println(list);
          System.out.println(list.size()+" adet çarpan vardır");
      }
    private static void lamdaCozumu2(int sayi){
        List<Integer> list =
                Stream.iterate(1, p->p+1)
                        .takeWhile(p->p<=sayi)
                        .filter(p->sayi%p==0)
                        .toList();
        System.out.println(list);
        System.out.println(list.size()+" adet çarpan vardır");
    }
}
