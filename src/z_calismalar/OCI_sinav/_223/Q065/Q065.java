package z_calismalar.OCI_sinav._223.Q065;

public class Q065 {
	public static void main(String[] args) {
        float var1 = (12_345.01 <= 123_45.00)? 12_456 : 124_56.02f;
            System.out.println(var1);
        float var2 = var1 + 1024;
        System.out.print(var2);
        System.out.println();

        //ondaliksiz bir sayi ayni zamanda hem fload hemde double sayidir
        float x = 12+45;
        System.out.println(x); //57.0
        // ama ondalikli sayi sadece doubel sayidir float olmasi icin a) float aCAST edilmeli  b)sayinin sonuna f veya F eklenmelidir
        //float a = 22.7;
        float a = 22.7f;
        System.out.println(a); // 22.7
    }

}
//Answer D
/**
 * What is the result?
A. An exception is thrown at runtime.
B. Compilation fails.
C. 13480.0
D. 13480.02
Answer: C
 */
 
