package day36_InterviewQuestions.Day05;

public class Q05_WrapperClassTask {

    // create a method that accepts an int
    // and returns twice of that int
    // overload this method with wrapper class: Integer

    // int kabul eden bir metot yarat
    // ve bu int'nin iki katını döndürür
    // bu yöntemi wrapper sınıfıyla overload et : Integer
    public static void main(String[] args) {

        int a= 12;
        int sonuc = method(a);
        System.out.println(sonuc);

        Integer r = method(7);
        System.out.println(r);

    }

    private static int method(int a) {
        return a*2;

    }
    private static Integer method(Integer a) {
        return a*2;

    }


}
