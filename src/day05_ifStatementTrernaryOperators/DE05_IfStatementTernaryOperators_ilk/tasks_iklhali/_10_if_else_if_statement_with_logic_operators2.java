package day05_ifStatementTrernaryOperators.DE05_IfStatementTernaryOperators_ilk.tasks_iklhali;

public class _10_if_else_if_statement_with_logic_operators2 {

    public static void main(String[] args) {

/* 60 değerinde bir int oluşturun.
Eğer int 9'a bölününce kalan 0 ise ve 5'e bölününce kalan 0 ise "Able to divide by 9 and 5" yazdırın.
Eğer int 4'e bölününce kalan 0 ise ve 5'e bölünüce kalan 0 ise "Able to divide by 4 and 15" yazdırın.
*/
        int s1 =60;
        if (s1%9==0 && s1%5==0){
            System.out.println("9 ve 5 e bölünür");
        }
        if (s1%4==0 && s1%5==0){
            System.out.println("sayi 4 ve 5 e bölünebilir");
        }


    }
}
