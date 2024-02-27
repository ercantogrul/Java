package day05_ifStatementTrernaryOperators.C01_IfStatement.C02_TerneryOperator;

public class s1 {
    public static void main(String[] args) {

        int s1 = (int) (Math.random()*10);
        int s2 = (int) (Math.random()*10);
        int s3 = (int) (Math.random()*10);
        // en büyük olani bulun

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        // veriTipi        variable  =   kusul        true block      :   false blok
        String             str       =   s1>s2?        "s1 buyuktur"  :   "s2 buyuktur";  // örnek
        int                enB       =   s1>s2?         s1            :    s2;



        System.out.println(str);
        System.out.println(enB);











    }

}
