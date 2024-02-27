package z_calismalar.ch01_JavaIntro.soru_92;

public class Test {
    public static void main(String[] args) {
      //  byte x =1; // ok
      //  short x = 1; // ok
        Integer x = new Integer("1");
        switch(x) {
            case 1:
                System.out.println("One");;
                break;
            case 2:
                System.out.println("Two");
                break;


        }
        int numbers[] = new int[3];
        numbers= new int[]{1, 2, 3};
    }
}
