package day36_InterviewQuestions.Day04;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class Q03_CountFactors__stream_iterater {
      /*
        Type java code by using while loop,
       Write a program to count the factors of an integer which is entered by user.
       Factors of 12 = 1, 2, 3, 4, 6, 12 ==> 6
       Factors of 8  = 1, 2, 4, 8 ==> 4
*/
      public static void main(String[] args) {
          Scanner scan = new Scanner(System.in);
          System.out.print("carpanlarini bulmak istediginiz sayiyi giriniz :");
          int sayi =scan.nextInt();

          int i =1;
          int count =0;
          while (i<=sayi){
              if (sayi%i==0){
                  System.out.print(i+" ");
                  count++;
              }
              i++;
          }
          System.out.println("\n"+sayi+" sayisinin carpanlari ===> "+count +" tanedir");

          //ikinci yol Lamda ile=============================================================

          /*Stream.iterate(1, p->p<=sayi, p->p+1)==Stream.iterate(a,b,c)
          a:baslangic
          b:kontrol, bu sart saglandigi sürece üretime devam et
          c:yeni elemanin hesaplanisi

           */
          List<Integer> list= Stream.iterate(1, p->p<=sayi, p->p+1) // ortadaki (bu sart saglandigi sürece) p sayidan kücük oldugu sürece üret  //p->p+1 bir bir arttir
                                 .filter(p->sayi%p==0) //filtre sayi her bir elemana tam bölünüyorsa al
                                 .toList();
          System.out.println(list);
          System.out.println(list.size()+" adet carpan vardir");

      }

}
