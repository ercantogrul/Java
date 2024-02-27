package z_calismalar.OCI_sinav._223.Q141;

public class Q141 {

    public static void main(String[] args) {
        String names[] = {"Thomas", "Peter", "Joseph"};
        String pwd[] = new String[3];
        int idx = 0;
        try {
            for (String n : names) {
                pwd[idx] = n.substring(2, 6);  //ilkinde omas yazar ikinci elemanda RTE verir. catch de yaklar ve Invalid Name yazar
                System.out.println(pwd[idx]);
                idx++;
            }
        } catch (Exception e) {
            System.out.println("Invalid Name");

        }

    }
}
    /* What is result?

A) omas
   Invalid Name
   null

B) omas
   ter
   seph

C) Invalid Name

D) omas
   Invalid Name

A.	Option A
B.	Option B
C.	Option C
D.	Option D


//Answer: D

*/








	


