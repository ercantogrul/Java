package z_calismalar.OCI_sinav._223.Q074_exception;

class Test {
    void readCard(int cardNo) throws Exception {
        System.out.println("Reading Card");
        //*** Throws keywordunu method signuture da kullanmamız durumunda bu methodu çağırdığımız yerdeki signutere de da call(çağırmak zorundayız.)
        // (Şart olarak throws unchecked veya Exception (Parent) class olması durumunda.)

        //-Eğer throws kelimesi Runtime bir hata ile kullanıldıysa hem handle edemez hem de main method da çağırmak zorunda değiliz.
    }

    void checkCard(int cardNo) throws RuntimeException {  // line n1
        System.out.println("Checking Card");
    }

    public static void main(String[] args) {//yukarida yazildigi icin burayada atmak gerek Exception i
        Test ex = new Test();
        int cardNo = 12344;
      //  ex.readCard(cardNo);   // line n2
        ex.checkCard(cardNo);  // line n3
    }
}

/*
Main difference between RuntimeException and checked Exception is that
It is mandatory to provide try-catch or try finally block to handle checked Exception
and failure to do so will result in a compile-time error,
while in the case of RuntimeException this is not mandatory.
A)  Reading Card
    Checking Card
B)  compilation fails only at line n1
C)  compilation fails only at line n2
D)  compilation fails only at line n3
E)  compilation fails only at both line n2 and Line n3








compilation fails at line n2
*/