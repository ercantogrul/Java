package TeamWork_Project.Project_01;

import java.util.Scanner;

public class perfectSquare {


    /*
    Given a positive integer num, write a function which returns true if num is a perfect square else false.

        Note: Do not use any built-in library function such as sqrt.

        Example 1:
        Input: 16
        Output: true
        Note: this number is perfect square because 4*4 is 16

        Example 2:
        Input: 25
        Output: true
        Note: this number is perfect square because 5*5 is 25


        Example 3:
        Input: 14
        Output: false

     */

    /*
    girilen pozitif tamsayının tam kare olmasını kontrol eden method create ediniz.

Not: sqrt gibi method   kullanmayınız.

        Example 1:
        Input: 16
        Output: true
        Not: bu sayı tamkare çünkü 4*4 = 16

        Example 2:
        Input: 25
        Output: true
        Note: bu sayı tamkare çünkü 5*5=25


        Example 3:
        Input: 14
        Output: false



     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int input = scanner.nextInt();

        //  code Start here don't change before this line
        // bu satırdan önceki kodları değiştirmeyiniz.




        if(isPerfectSquare(input)){
            System.out.println(true);
        }else {
            System.out.println(false);
        }


    }

    static boolean isPerfectSquare(int n)
    {
//        // sum is sum of all odd numbers. i is
//        // used one by one hold odd numbers
//        for (int sum = 0, i = 1; sum < n; i += 2) {
//
//
//            //1,3  36   511
//            sum += i;
//            if (sum == n)
//                return true;
//        }
     //

        int kok=(int)(Math.sqrt(n));
        if(n==(kok*kok)){
            return true;
        }else{
            return false;
        }

    }

}
