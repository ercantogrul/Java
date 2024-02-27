package day05_ifStatementTrernaryOperators.DE05_IfStatementTernaryOperators_ilk;

public class C04_TernaryOperator {
    public static void main(String[] args) {
        int s1 = (int) (Math.random()*10);
        int s2 = (int) (Math.random()*10);
        int s3 = (int) (Math.random()*10);
       // en buyuk olanı bulalım
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        // veriTipi  variable =  kosul?   true block : false blok
         String    str        =  s1>s2?   "s1 buyuktur " : "S2 buyuktur" ;
          int       enB       =  s1>s2?   s1             : s2;
        System.out.println(str);
        System.out.println(enB);






    }
}
