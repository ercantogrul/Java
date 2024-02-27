package z_calismalar.ch01_JavaIntro.soru_97;

public class StrBuilderSttring {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Java");
        System.out.println("sb = " + sb);
        System.out.println("sb.toString() = " + sb.toString());
        String s = "Java";
        System.out.println("s.toString() = " + s.toString());
        System.out.println("sb.toString().equals(s.toString()) = " + sb.toString().equals(s.toString()));
        System.out.println("sb.equals(s) = " + sb.equals(s));
        System.out.println("sb.toString().equals(s) = " + sb.toString().equals(s));


    }
}
