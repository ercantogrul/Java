package day07_StringManuplation.DE07_StringManuplation_ilk;

public class C18_CompareTo {
    public static void main(String[] args) {

        String s1="elma";
        String s2="elma";
        String s3="mu";
        String s4=new String("elma");
        String s5="ananaslimon";
        System.out.println(s1.compareTo(s2));//0
        System.out.println(s1.compareTo(s3));//negative -8
        System.out.println(s1.compareTo(s4));//0
        System.out.println(s1.compareTo(s5));  //4


    }
}
