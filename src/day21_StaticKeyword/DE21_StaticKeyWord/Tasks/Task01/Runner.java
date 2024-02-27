package day21_StaticKeyword.DE21_StaticKeyWord.Tasks.Task01;




public class Runner {
     /*
     Task 01 >
     fields: width, length ve cevre ve alan hesaplayaan methodolan Rectangle isminde Class create ediniz.
     Runeer class'da obj ile cevre ve alan değerelrini print eden code create ediniz.
    */


    public static void main(String[] args) {

        Rectangle obj = new Rectangle(4,5);
        int cevre = obj.cevreHesaplama(); //public int cevreHesaplama() methodun da parametreler yoksa this den alir
        int alan = obj.alanHesaplama(4,5);
        System.out.println("alan = " + alan);
        System.out.println("cevre = " + cevre);

        int cevre2 = obj.cevreHesaplama(7,8);
        System.out.println("cevre2 = " + cevre2);


    }


}
