package day36_InterviewQuestions.Day02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class Q003_FibonacciListNumber__ {
    /*
    Kullanıcıdan alınan bir tamsayıya kadar FIBONACCI dizisi oluşturun.
    0-1-1-2-3-5-8-13-21-34....
    */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Bir sayi giriniz : ");
        int sayi = scan.nextInt();

        fibonacci1(sayi);
        fibonacci2(sayi);


        System.out.println("lamda cozumu");
        int [] arr= Stream.iterate(new int[]{0, 1}, p -> p[0] < sayi, fibonacci -> new int[]{fibonacci[1], fibonacci[0] + fibonacci[1]}) // line 1
                // .forEach(p-> System.out.println(Arrays.toString(p)));   // line 2
                .map(fibonacci -> fibonacci[0])                                     // line 3
                .mapToInt(p->p)  // int stream e cevirmek icin bunu yaptik (arraya atmak icin gerekti)
                .toArray();
        System.out.println(Arrays.toString(arr));



    }


    private static void fibonacci1(int sayi) {
        List<Integer> fibonacci = new ArrayList<>();
        fibonacci.add(0);
        fibonacci.add(1);
        while (fibonacci.getLast() < sayi) {
            int eleman = fibonacci.getLast() + fibonacci.get(fibonacci.size() - 2);
            fibonacci.add(eleman);
        }
        fibonacci.removeLast();
        System.out.println(fibonacci);
    }

    private static void fibonacci2(int sayi) {
        List<Integer> fibonacci = new ArrayList<>();
        fibonacci.add(0);
        int eleman = 1;
        while (eleman < sayi) {
            fibonacci.add(eleman);
            eleman = fibonacci.getLast() + fibonacci.get(fibonacci.size() - 2);
        }
        System.out.println(fibonacci);

    }


}

