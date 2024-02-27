package z_calismalar.OCI_sinav._223.Q022_129_exception__;

public class test2 {
    public static void main(String[] args) {
        int ans=0; // if it is initialized, for example int ans = 0;  --> Answer 0
        try {
            int num = 10;
            int div = 0;
            ans = num / div;
        } catch (ArithmeticException ae) {
            ans = 0;												// line n1
        }catch (Exception e) {
            System.out.println("Invalid calculation");
            //ans=0;
            //1: Ya catch (Exception e) blogundaki deger belli olmalidir ...yani ans degeri ans=0; olmaliydi
            // ---böyle yazilirsa da hata gider ve sonuc 0 olurdu
            // 2: ya da int ans; degeri olmaliydi....
            // catch (Exception e) blogundaki deger olmadigi icin sout daki ans in initialized degerini yazdirir oda belli olmadigi icin CTE verir

        }
        System.out.println("Answer = " + ans);	// line n2
        // ans is initialized in the try-catch block, can not be seen outside the block
    }

}
