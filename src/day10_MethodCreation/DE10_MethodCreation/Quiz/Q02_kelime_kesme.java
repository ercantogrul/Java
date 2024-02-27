package day10_MethodCreation.DE10_MethodCreation.Quiz;

public class Q02_kelime_kesme {
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

        while (str.length()>0){
            if(!str.substring(0,1).equals(" ")) System.out.println("str = " + str);
            str = kisalt(str);
        }


    }


    private static String kisalt(String str) {
        if (str.contains(" ")) {
            str = str.substring(str.indexOf(' ') + 1);
            str = str.substring(0, 1).toUpperCase() + str.substring(1).toLowerCase();
        }else str ="";
        return str;
    }







}
