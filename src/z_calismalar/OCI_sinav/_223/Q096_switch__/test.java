package z_calismalar.OCI_sinav._223.Q096_switch__;

public class test {
    public static void main(String[] args) {
        int price = 1000;
        int qty = 2;
        String grade = "2";
        double discount = 0.0;
        switch (grade) {
            case "1" :
                discount = price * 0.1;
                break;
            case "2" :
                discount = price * 0.5;
                break;  // swich de break olur ama continue olmaz
            //	continue;  // continue loop da kullanilir ve continue dan sonra cikti gelmez
            default:
                System.out.println("Thank you!");

        }
        System.out.println(discount);

    }
}
