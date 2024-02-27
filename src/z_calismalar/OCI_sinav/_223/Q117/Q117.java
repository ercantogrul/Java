package z_calismalar.OCI_sinav._223.Q117;

public class Q117 {
    public static void main(String[] args) {
        String ta="A ";
        ta=ta.concat("B ");//A B
        String tb="C ";
        ta=ta.concat(tb);
        ta.replace('C','D');  // burada C yerine D eklenmis AMA ta variable na eklenmemis.. dolayisiyla bos bir kod dur
       // ta=ta.replace('C','D');  // olsaydi sonuc ABDC olurdu

        ta=ta.concat(tb);
        System.out.println(ta);
    }
}
/*What is the result?
 A. A B C D
 B. A C D
 C. A C D D
 D. A B D
 E. A B D C
 Answer: ABCC

 */