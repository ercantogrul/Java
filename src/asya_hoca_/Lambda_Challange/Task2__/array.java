package asya_hoca_.Lambda_Challange.Task2__;

import java.util.Arrays;
import java.util.List;
import java.util.Collections;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class array {

        // Arraylerde Stream kullanabilmek icin 2 yol vardir
        // 1) Stream <Integer> isim=StreamOf(cevrilecek olan) -> Stream objesi
        // 2) Arrays.stream(arr).  ->  Array sinifindan yararlanarak
        //Array ler collection sinifinda degillerdir..set ve MAp ler gibi degildir..
        // kullanabilmek icin donusum yapilmalidir
        public static void main(String[] args) {
            Integer arr1 [] ={1,5,-5,6,12,-8,9,3,4};
            //List <Integer> list = turnToList(arr1);
            List<Integer>l =turnToList(arr1);

            convertToList(arr1);
            List<Stream> s  =turnToStream(arr1);

            int sum=sumArray(arr1);
            System.out.println(sum);

        }

        private static void convertToList(Integer[] arr1) {
            //Array'i yazdirdik
            Arrays.stream(arr1).forEach(t-> System.out.print(t+" "));
            System.out.println();
        }

        private static  List<Integer> turnToList(Integer[] arr1) {
            //Array'i listeye çeviriniz

            return Arrays.stream(arr1).collect(Collectors.toList());
            //return Arrays.stream(arr1).toList(); // veya bu sekilde
        }

        private static  List<Stream> turnToStream(Integer[] arr1) {
            return Collections.singletonList(Arrays.stream(arr1));
        }
        private static int sumArray(Integer[] arr1) {
            //Array2in elemanlarının toplamını bulunuz.
            System.out.println();
            int sum=Arrays.stream(arr1).reduce(0,(x,y)->(x+y));
            return sum;
        }


    }

