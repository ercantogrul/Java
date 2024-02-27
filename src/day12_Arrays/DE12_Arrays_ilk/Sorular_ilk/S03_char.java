package day12_Arrays.DE12_Arrays_ilk.Sorular_ilk;

import java.util.Arrays;

public class S03_char {
    public static void main(String[] args) {
        //Toplamda 26 adet harf karakteri mevcut
        //Dizi içerisinde tersten yazdırın
        //[Z, Y....A]
        char[] a = new char [26];

        for (int i = 0; i <a.length ; i++) {

            a[i]= (char)(i+65);

        }
        System.out.println(Arrays.toString(a));
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));

        //===========================ikinci yöntem=========================
        char [] letter=new char[26];


        for (char i = 'A',j=0; i <= 'Z' && j<=letter.length; i++,j++) {
            letter[j]=i;
        }
        System.out.println(Arrays.toString(letter));//toString converts array to string

        char ch='Z';
        for (int i = 0; i < letter.length; i++,ch--) {
            letter[i]=ch;
        }
        System.out.println("Arrays.toString(letter) = " + Arrays.toString(letter));


    }
}
