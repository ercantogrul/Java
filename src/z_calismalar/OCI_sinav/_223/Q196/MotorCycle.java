package z_calismalar.OCI_sinav._223.Q196;

import java.util.ArrayList;

public class MotorCycle implements Cycle{

   int a;

    public static void main(String[] args) {
        ArrayList<Cycle> myList = new ArrayList<>();

        new MotorCycle(); // buradaki constr. --- yani Cyce  parentter. Cycle c=  new MotorCycle(); gibidir
        // buradaki c ile new MotorCycle(); ayni seydir
        new MotorCycle().a=5;
    }


}
/*
196.	Given this segment of code:
        ArrayList<Cycle> myList = new ArrayList<>();
        myList.add(new MotorCycle());
        Which two statements, if either were true, would make the code compile? (Choose two.)

        A.  MotorCycle is an interface that implements the Cycle class.
        B.	Cycle is an interface that is implemented by the MotorCycle class.  //Cycle, MotorCycle sınıfı tarafından uygulanan bir arayüzdür.
        C.	Cycle is an abstract superclass of MotorCycle.  // Cycle, MotorCycle'ın soyut bir üst sınıfıdır.
        D.	Cycle and MotorCycle both extend the Transportation superclass.
        E.	Cycle and MotorCycle both implement the Transportation interface.
        F.	MotorCycle is a superclass of Cycle.
*/