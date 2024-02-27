package day12_Arrays.DE12_Arrays_ilk;

public class BizimArrays {
    public static void yaz(String[] str){
        System.out.print("[");
        for (int i = 0; i < str.length-1 ; i++) {
            System.out.print(str[i]+", ");
        }
        System.out.println(str[str.length-1]+"]");
    }
    // aynı isimde farklı parametreler ile 3 metot yazdık ( method overloading)
    public static String yazString(String[] str){
        String st="[";
        for (int i = 0; i < str.length-1 ; i++) {
            st = st +str[i]+", ";
        }
        st=st+(str[str.length-1]+"]");
        return st;
    }
    public static String yazString(int[] str){
        String st="[";
        for (int i = 0; i < str.length-1 ; i++) {
            st = st +str[i]+", ";
        }
        st=st+(str[str.length-1]+"]");
        return st;
    }
    public static String yazString(char[] str){
        String st="[";
        for (int i = 0; i < str.length-1 ; i++) {
            st = st +str[i]+", ";
        }
        st=st+(str[str.length-1]+"]");
        return st;
    }
}
