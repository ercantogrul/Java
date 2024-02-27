package day08_Loops.DE08_Loops_ilk.L01_ForLoops.Tasks;

public class Task14 {

    public static void main(String[] args) {

        //  Task->  0 ile 100 arasındaki bütün çift sayıları print eden code create ediniz.
        //Not: 0 ve 100 dahildir.

        for (int i = 0; i < 100; i+=2) {
            System.out.print(i+", ");

        }

        //=====ikinci yontem==================
        for (int i = 0; i < 100; i++) {
            System.out.print(i+", ");
            i++;
        }

        //=====ucuncu  yontem==================
        for (int i = 0; i < 100; i++) {
           if (i%2==0){
               System.out.print(i);
           }
        }



    }
}
