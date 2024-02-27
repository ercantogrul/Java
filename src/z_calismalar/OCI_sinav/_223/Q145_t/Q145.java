package z_calismalar.OCI_sinav._223.Q145_t;

public class Q145 { //Class name is SumTest
    public static void doSum(Integer x, Integer y) {
        System.out.println("Integer sum is " + (x + y));
    }

    public static void doSum(double x, double y) {
        System.out.println("double sum is " + (x + y));
    }
    public static void doSum(float x, float y) {
       System.out.println("float sum is " + (x + y));
    } //
    public static void doSum(short x, short y) {
        System.out.println("short sum is " + (x + y));
    } //

    public static void main(String[] args) {
        doSum(10, 20);  //once primitive cagrilir int yoksa (kendinden büyük olan) en yakini cagirir (int-long-float-doble) bunlar yoksa nonPrimitiv cagirir.
        // yani short ve byte olmaz
        doSum(10.0, 20.0);

        //not: java ondalikli sayilari double, ondaliksiz sayilari int olarak okur.
        // eger ondaslikli sayi varsa double o yoksa wrapper Double sayiya doner o da yokca CTE verir
        // eger ondaliksiz sayi varsa int veya sirayla yukari dogru: long- float-double sayiya bunlar yoksa wrapper (sadece) Integer sayi olarak okunur diger wrapper sayilara dönmez. bunlar yoksa CTE verir

    }
}
/* What is the result?
A.	double sum is 30.0
	float sum is 30.0

B.	float sum is 30.0
	double sum is 30.0

C.	Integer sum is 30
	double sum is 30.0

D.	Integer sum is 30
	float sum is 30.0






 */
