package day15_Varargs.DE15_Varargs_ilk;

public class Task01 {
    public static void main(String[] args) {
        /*
        Task -> verilen Stringleri birlestiren concat isimli METHOD create ediniz.

        input : "h", "a", "l", "u", "k";
        output : haluk

        input : "a", "l", "i";
        output : ali

         */

        String[] strArr1 = {"h", "a", "l", "u", "k"};
        String[] strArr2 = {"a", "l", "i"};

        concat(strArr1,strArr2);




    }//main sonu

    private static void concat(String[]...arr) {

        for (String[] icArr : arr) {
            for (String eleman : icArr) {

                System.out.print(eleman);
            }
            System.out.println();
        }




    }





}
