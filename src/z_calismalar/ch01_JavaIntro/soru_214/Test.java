package z_calismalar.ch01_JavaIntro.soru_214;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static final int MIN=1;

    public static void main(String[] args) {
        int x=1;
        if(check(x)){
            System.out.println("SE");

        }else{
            System.out.println("EE");
        }

        List colors = new ArrayList();
        colors.add("a");
        System.out.println(colors);
    }
    public static boolean check(int x){
        return (x>=MIN) ? true:false;
    }
}
