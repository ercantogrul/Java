package asya_hoca_.Lambda_Challange;

import java.lang.constant.Constable;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Test2 {
    public static void main(String[] args) {
        // Predicate Functionel interface bir tane parametre alir ve boolean deger dönderir
        // consumer Functionel interface bir tane parametre alir ve geri dönüs tipi void

        Predicate<String> kelimeUzunluk3 =p->p.length()>3;
        Predicate<String> kelimeLileBaslama=p->p.startsWith("J");
        String str ="Java";
        if (kelimeUzunluk3.test(str)){
            System.out.println("kelime uzun");
        }else {
            System.out.println("Kelime 3 den kisa");
        }

     // consumer Functionel interface bir tane parametre alir ve geri dönüs tipi void  hazir methodu accept ()
        Consumer <String> yaz =(p)-> {
            System.out.println("*"+p);
        };
        yaz.accept("Kapali");

        Consumer <StringBuilder> ters =(p)-> {
            System.out.println("p.reverse() = " + p.reverse());
        };

        ters.accept(new StringBuilder("kalem"));



    }
}
