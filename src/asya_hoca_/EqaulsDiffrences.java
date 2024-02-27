package asya_hoca_;

import java.util.Arrays;

public class EqaulsDiffrences {
    public static void main(String[] args) {

        //equal ve == farkı nedir?
        /*
        1- "==" bir operatörken equals() bir metottur.
        2-  == operatörü iki nesnenin referansı ya da heap’teki konumunu karşılaştırır.
        Bu karşılaştırma iki referansın aynı yeri işaret edip etmeme durumudur.

        3- equals() metodu ise nesnelerin içeriklerini karşılaştırır.
        Bu karşılaştırma da nesnelerin içeriklerine göre eşitliklerini belirler.

         */

        int a=10;
        int b=10;
        char c='a';
        char d='a';
        String x="a";
        String y="a";
        String[] z={"a","b"};
        String t=new String("a");
        String q=new String("a");
        int[] arr1={1,2,3};
        int[] arr2={1,2,3};
        System.out.println(a==b); //true
        System.out.println(c==d); //true
        System.out.println(x==y); //true
        System.out.println(x==z[0]);//true
        System.out.println(x==t);//false
        System.out.println(t==q);//false
        System.out.println(x.equals(y));//true
        System.out.println(x.equals(t));//true
        System.out.println(t.equals(q));//true
        System.out.println(arr1==arr1);//true
        System.out.println(arr1==arr2);//false
        System.out.println(arr1[0]==arr2[0]);//true
        System.out.println(arr1.equals(arr2));//false
        System.out.println(Arrays.equals(arr1,arr2));//true

        //=======================================

        String s1="Ali";
        System.out.println(System.identityHashCode(s1));
        String s2="Al";
        s2=s2+"i";
        System.out.println(System.identityHashCode(s2));
        String s3=new String("Ali");
        System.out.println(System.identityHashCode(s3));
        System.out.println(s1==s2);//true aynı referansı gösterdiği için
        System.out.println(s1==s3);//false
        System.out.println(s1.equals(s3));//true

    }
}
