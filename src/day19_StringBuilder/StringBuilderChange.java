package day19_StringBuilder;

public class StringBuilderChange {
    public static void main(String[] args) {
        String str="MineCraft";
        StringBuilder sb=new StringBuilder(str);


        str=str.substring(0,2);
        
        System.out.println("sb = " + sb);//MineCraft
        System.out.println("str = " + str);//MINECRAFT



    }
}
