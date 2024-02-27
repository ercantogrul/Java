package z_calismalar.OCI_sinav._223.Q165__;

public class test {
    public static void main(String[] args) {
        String s1 = "Moon";
            boolean b = (s1==("Moon"));
            boolean b2 = (s1.equals("Moon"));
            System.out.println(b+" "+b2); // true true
        System.out.println(s1);  //Moon

        OraString s2 = new OraString("Moon");
            boolean c= (s2.equals(s2)); //false
            boolean c2 = s2.s.equals("Moon");  // s2.s olsaydi Moon atanan obje olurdu. ve true olurdu
            System.out.println(c+" "+c2); // false true

        System.out.println(s2); //z_calismalar.OCI_sinav._223.Q165____.OraString@506e1b77
        //// toString methodu olsa -- OraString{s='Moon'}  // ama buradaki verinin türü String degil OraString dir
        System.out.println(s2.toString());// toString methodu olsa --  OraString{s='Moon'}


        if ((s1==("Moon")) && (s2.equals("Moon"))) {

            System.out.println("A");
        } else {
            System.out.println("B");
        }

        if (s1.equalsIgnoreCase(s2.s)) {
            System.out.println("C");
        } else {
            System.out.println("D");
        }

    }
}
