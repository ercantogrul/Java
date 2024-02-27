package z_calismalar.ch01_JavaIntro;

import java.util.ArrayList;
import java.util.List;

class normalClass_1  {

    private normalClass_1() {
    }

    protected static  int y;
    void readCard(int cardNo) throws Exception{
        System.out.println("Reading");
    }

    void checkCard(int cardNo) throws RuntimeException{
        System.out.println("Checking");
    }


    public static void main(String[] args) throws Exception { // soruda bu kisimda exception yoktu
        normalClass_1 nc = new normalClass_1();
        int cardNo = 1212;
        nc.readCard(cardNo);
        nc.checkCard(cardNo);

//        String name[] ={"Thoma"};
//        for (String n : name) {
//            System.out.println("n.substring(2,6) = " + n.substring(2, 6));
//        }
//
//        int[] array = new int[2];




    }
}
