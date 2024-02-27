package z_calismalar.ch01_JavaIntro.soru_65_2_pdff;

public class Test {
    public static String maskCC(String creditCard){
        String x = "XXXX-XXXX-XXXX-";
        StringBuilder sb = new StringBuilder(x);
        sb.append(creditCard,15,19);
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println("maskCC(\"1234-5678-9701-1121\") = " + maskCC("1234-5678-9701-1121"));
    }
}
