package z_calismalar.ch01_JavaIntro.soru_142;

public class Test {
    public static void main(String[] args) {

        int wd =0;
        String [] days = {"sun","mon","wed","sat"};
        for (String s:days) {
            switch (s) {
                case "sat":
                case "sun":
                    wd -= 1;
                    break;
                case "mon":
                    wd++;

                case "wed":
                     wd += 2;
            }
        }
        System.out.println("wd = " + wd);
    }
}
