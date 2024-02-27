package day36_InterviewQuestions.DE40InterviewQuestions__.Day02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q003_FibonacciListNumber {
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

    }
    private static void fibonacci1(int sayi){
        List<Integer> fibonacci = new ArrayList<>();
        fibonacci.add(0);
        fibonacci.add(1);
        while (fibonacci.getLast()<sayi) {
            int eleman = fibonacci.getLast()+fibonacci.get(fibonacci.size()-2);
            fibonacci.add(eleman);
        }
        fibonacci.removeLast();
        System.out.println(fibonacci);
    }
    private static void fibonacci2(int sayi){
        List<Integer> fibonacci = new ArrayList<>();
        fibonacci.add(0);
        int eleman=1;
        while (eleman<sayi) {
            fibonacci.add(eleman);
            eleman = fibonacci.getLast()+fibonacci.get(fibonacci.size()-2);

        }

        System.out.println(fibonacci);
    }
}
