package day05_ifStatementTrernaryOperators.DE05_IfStatementTernaryOperators_ilk;

public class C05_Terneray__objectClass {
    public static void main(String[] args) {
        int yas1=11;
        int yas2=11;
        Integer s3=24;

        // Object class dan oluşturulan varaiable lar,
        // tüm primitive varaiablelerin aldığı değerleri alabilir

        // ıkız ıse "ıkızdır" yazdırın , değilse yaşlarının toplamını yazdırın
        Object obj= yas1==yas2 ? "İkizdir" : yas1+yas2;
        System.out.println(obj);
        // üstteki 2 satırın tam karşılığını if ile yazalım
        Object obj2;
        if (yas1==yas2) {
            obj2 = "ikizdir";
        }else {
            obj2 = yas1+yas2;
        }
        System.out.println(obj);


        // 2.yol
        System.out.println( yas1==yas2 ? "İkizdir" : yas1+yas2);
    }
}
