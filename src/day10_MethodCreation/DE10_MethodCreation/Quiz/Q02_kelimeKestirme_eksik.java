package day10_MethodCreation.DE10_MethodCreation.Quiz;

public class Q02_kelimeKestirme_eksik {
    public static void main(String[] args) {

        /*
         yukarıdaki strinden her defasında bir kelime eksilterek yazdırın,
         (ilk harf hep büyük olacak)
         eksiltme ve ilk harfi büyük yapma işi metot ta olsun,gerisi main de
         output
          Merhaba dünya nasıl gidiyor hayat
          Dünya nasıl gidiyor hayat
          Nasıl gidiyor hayat
          Gidiyor hayat
          Hayat
         */
        String str = "Merhaba dünya nasıl gidiyor hayat";

        eksiltmeVeBüyütme(str);




    }

    private static String eksiltmeVeBüyütme(String str) {
        while (str.contains(" ")) {
            str = str.replace(str.substring(0,str.indexOf(" ")),"").trim();
            str= str.substring(0,1).toUpperCase()+str.substring(1).toLowerCase();
            System.out.println(str);
        }
        return str;
    }
}


