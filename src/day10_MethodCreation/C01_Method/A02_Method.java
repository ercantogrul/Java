package day10_MethodCreation.C01_Method;

public class A02_Method {
    public static void main(String[] args) {
        A01_Method_void.altString("Bu is cok guzel", 3,10); // is cok

        // A01_Method.altString('m',"ali",true);

        /*
            Bir method call sirasinda yazdigimiz degerlere ARGUMENT
            method deklarasyonundaki parantez icindeki variable'lara PARAMETRE denir

            public static void altString(String metin, int basIndex, int bitIndex ) parametre

            C01_MethodOlusturma.altString('m',"ali",true); argument

         //java arka planda asagidaki gibi düsünür
            String metin = 'm';
            int basIndex = "ali";
            int bitIndex = true;

            argument'ler ile parametreler uyumlu olmazsa (ki uyumlu degil) java CTE (altini kirmizi cizer) verir


         */
    }
}
