package day08_Loops.DE08_Loops.L01_ForLoops.Tasks02;

public class Task02_13 {
    public static void main(String[] args) {
        // Verilen string de, harfleri sıra ile
        // bir büyük , bir küçük olarak print ediniz(boşlukları atlayınız
        // Input =  "java can candır"
        // output=  "JaVa CaN cAnDıR
        String str = "java can candır";
        boolean flipFlop=true;
        for (int i = 0; i <str.length() ; i++) {
            if (!str.substring(i,i+1).equals(" ")){
                if (flipFlop) {
                    System.out.print(str.substring(i,i+1).toUpperCase());
                    flipFlop=false;
                } else {
                    System.out.print(str.substring(i,i+1).toLowerCase());
                    flipFlop=true;
                }
            } else System.out.print(" ");


        }
    }
}
