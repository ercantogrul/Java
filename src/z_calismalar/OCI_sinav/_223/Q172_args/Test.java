package z_calismalar.OCI_sinav._223.Q172_args;

class Test{
    public static final int MIN=1;

    public static void main(String[] args) { // eger args dizisine hic bir eleman vermemis isek eleman sayisi 0 dir
        int x=args.length;  // dolayisiyla int x = 0 olur
        System.out.println(x);
        if (checkLimit(x)){//line n1
            System.out.println("Java SE");

        }else {
            System.out.println("Java EE");
        }
    }
    public static boolean checkLimit(int x){
        return (x>=MIN)?true :false;
    }
}
  //answer
// 0
// Java EE
