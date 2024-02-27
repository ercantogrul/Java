package asya_hoca_.Lambda_Challange;

public class Test1 {
    public static void main(String[] args) {

        F1 printSometing = () ->{ // main methodun disinda yani üzerinde yazabilirdik
            System.out.println("f1 parametresiz");
        };

        F1 printNumber = () ->{ // parametresiz
            System.out.println("1,2,3");
        };
        printSometing.f1();
        printNumber.f1();
//===========================================================
        F2 piMethodu =(n)->{ // parametreli, istedigimiz karakteri verebiliriz
            System.out.println("sayi :"+n);
        };
        piMethodu.f2(12);
        // bunu asagidaki sekilge yazabiliriz
        F2 piLamda = n -> System.out.println("sayi :"+12);
        piLamda.f2(12);

        //==================================================

        F3 <Integer> sayi= (i)-> {return i+i;};  //   F3<T>  Generaic oldugu icin <Integer> yazmak zorundayiz

        F3 <Integer>sayi1 = i->i+i;
        int yeniSayi = sayi.f3(12); // return oldugu icin yeniSayi ya atama yaptik
        System.out.println(yeniSayi);

        F3 <Integer>sayi2kati = (p)->{return (p*2);};
        F3 <Integer>sayi2kati1 = p->(p*2); // parametre tekse () parantezi silebiliriz

        F3 <Integer>sayiKupu = p-> (int) Math.pow(p,3);  // sayinin küpü

        F3 <String>upperCase = p-> p.toUpperCase();
        System.out.println("sayi2kati.f3(12) = " + sayi2kati.f3(12));
        System.out.println("sayiKupu.f3(2) = " + sayiKupu.f3(2));
        System.out.println("upperCase.f3(\"Merhaba\") = " + upperCase.f3("Merhaba"));


    }
}
