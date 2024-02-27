package z_calismalar.OCI_sinav._223.Q034;

public class test {
    static double area;  //area instans veri olarakl degeri 0.0 dir
    int b= 2, h = 3;
    public static void main(String[] args) {
        double p, b, h;				// line n1 -->same variableName can be assigned to different data types √
        if (area == 2) { //area baslangic degeri 0 oldugu icin
            //than blogu degil else blogu calisir ve sonuc 0.0 olur
            b = 3;
            h = 4;
            p = 0.5;
            area = p * b * h;		// line n2
        }
        System.out.println("Area is " + area);
    }
}
