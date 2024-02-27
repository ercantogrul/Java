package day07_StringManuplation.DE07_StringManuplation;

public class C11_trim {
    public static void main(String[] args) {
     /*
  trim()-> İstediğimiz String’in başında veya sonunda varolan boşluk (space)’leri temizler.

         */
        String str = " merhaba dunya. dsa      ";
        System.out.println(str+";");
        System.out.println(str.trim()+";");
    }
}
