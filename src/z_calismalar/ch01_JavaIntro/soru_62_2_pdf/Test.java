package z_calismalar.ch01_JavaIntro.soru_62_2_pdf;

public class Test {
    public static void main(String[] args) {
        int ans;
        try {
            int num =10;
            int div =0;
            ans = num/div;
        }catch (ArithmeticException ae) {
           ans =0;
        }catch (Exception e) {
            System.out.println("invalid");
        }//System.out.println("Answer" + ans);
    }
}
