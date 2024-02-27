package z_calismalar.ch01_JavaIntro;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Tests {
    public static void main(String[] args) {
        d(10,20);
        String str = "Sweet Sweet";
        String str2 = str.trim().charAt(6)+ " " + str.indexOf("Sw",1);
        System.out.println("str2 = " + str2);





        String [] arr ={"Hi","How","Are", "You"};
        List<String> arrList = new ArrayList<>(Arrays.asList(arr));
        if (arrList.removeIf(s -> {
            System.out.print(s);
            return s.length() <2;})) {
            System.out.println(" removed");
        }


        int x = 100;
        float f = (float) x;
        Float fit = 100.00f;
        float fit2 = (float) 1_11.00;
        float fit3 = 100.00F;
        double y1 = 203.22; float fit4 = (float)y1;
        double d =0;
        // int g = Integer.parseInt(args[0]);
        int g = 89;
        d = g>=90 ? 0.5 : g>80 ? 0.2:0;
        System.out.println();
        System.out.println("g = " + d);

        if(g>80 && g<90){
            d= 0.2;
            System.out.println("d = " + d);
        }else System.out.println(d=0);

        if(g>=90){
            d= 0.5;
            System.out.println("d = " + d);
        }else System.out.println(d=0);

    }
    public static void d(Integer a,Integer b){
        System.out.println("Integer " + (a+b));
    }

}

