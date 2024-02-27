package asya_hoca_.Array.Array_toplu;

import java.util.Scanner;

public class MethonNumberCheck {
    public static void main(String[] args) {

    /* task->
    Girilen bir tamsayı için
    Bu sayinin negatif veya pozitif oldugunu,
    tek mi cift mi oldugunu ve
    uc basamakli veya daha buyukse birler,onlar ve yuzler basamagindaki rakamlarin toplamini,
    100'den kucukse sadece birler basamagini print eden method'lar create ediniz.
    */

        Scanner scanner=new Scanner(System.in);
        int num=scanner.nextInt();
        pozOrNe(num);
        oddOrEven(num);

        if (oddOrEven(num)){// sayı çift ise tru değilse false
            System.out.println("Çift sayı");
        }

        int sum=checkDigit(num);
        System.out.println(sum);


    }

    private static int checkDigit(int num) {
        int sum=0;

        if(num>99){
            String y= String.valueOf(num);
            int yuz= Integer.parseInt(y.substring(y.length()-3));//son 3 haneyi
            sum=(yuz/100)+(yuz % 10) + (yuz % 100 / 10);//yüzler ,onlar,birler

        }
        else {
            sum=num %10;//sadece birler basamağını
        }
        System.out.println(sum);
        return sum;
    }

    private static boolean oddOrEven(int num) {// return kullanıcaksa mutlaka geri dönüş tipi belirtilmeli
         if (num%2==0){

             return true;
         }
         else {

             return false;
         }
    }

    private static void pozOrNe(int num) {
        //void with parameter
        if (num>0){
            System.out.println("Pozitif");
        }else {
            System.out.println("Negatif");
        }
    }
}
