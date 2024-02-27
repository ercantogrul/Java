package TeamWork_Project.Project_01;

import java.util.Scanner;

public class RandomNum {


    /*
    Given a positive integer num name is max ,

    create a random number between 0 to max

    output should be int

     */



 /*

  Girilen sayı ile 0 arasında random bir sayi elde eden code create ediniz.

  */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int max = Integer.parseInt(scanner.nextLine());

        //  code Start here don't change before this line
        // bu satırdan önceki kodları değiştirmeyiniz
        double random=Math.random();
        int max1= max;
        double r1=random*max1;
        int i1=(int)r1;
        System.out.println(i1);
    }
}