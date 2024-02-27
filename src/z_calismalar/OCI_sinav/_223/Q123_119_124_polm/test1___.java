package z_calismalar.OCI_sinav._223.Q123_119_124_polm;

public class test1___ {
   static String myStr = "9009";
    public void doStuff(String str) {  // method static olsydi String myStr = "9009";i methodda kullanamazdik
        int myNum = 0;
        try {
           //String myStr = str; // 7007  bu String myStr sadece bu scop un icinde gecerli asagida yazdiramayiz
             myStr = str; //böyle olsa dahi asagidaki ciktiyi veriyor
            // str ="12e3" seklinde olsydi NumberFormatException hatasi verirdi önce catch e girip yazdirirdi
            myNum = Integer.parseInt(myStr); // 7007
        } catch (NumberFormatException ne) {
            System.err.println("Error");
        }
        System.out.println("myStr: " + myStr + ", myNum: " + myNum);  // myStr: 9009, myNum: 7007

    }
    public static void main(String[] args) {
        App obj = new App();
        obj.doStuff("7007");

    }

}
