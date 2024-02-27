package day07_StringManuplation.DE07_StringManuplation_ilk.tasks02;

import java.util.Scanner;

public class Task02_06_____ {
    public static void main(String[] args) {
        /*
        Task-> Girilen string içindeki istenen index'deki karakterin
         yerine '*' koyup print ediniz
         */


        Scanner sc = new Scanner(System.in);
        System.out.print("bir metin giriniz : ");
        String str = sc.nextLine();

        System.out.println("istenen karakterin index'ini giriniz : ");
        int index=sc.nextInt();

        str = str.substring(0,index)+"*"+str.substring(index+1);
        System.out.println(str);

        //  ========= ikinci yontem






    }
}
