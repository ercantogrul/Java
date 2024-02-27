package z_calismalar.OCI_sinav._223.Q162;

public class Test {

    public static void main(String[] args) {
        Student s1 = new Student();  // new ile her bir obje icin memoride yer acildi
        Student s2 = new Student();
        Student s3 = new Student();
        s1 = s3;
        s3 = s2;   // s1 ve s3 ün hala bir degeri var dolayisiyla garbage a gitmez
        s2 = null; // ama s2 nin 11. satirdan itibaren artik degeri olmadigi icin garbage a gider

        System.out.println("s1:"+s1+" "+"s2:"+s2+" "+"s3:"+s3);

        // 11. satirdan sonra sadece bir (yani s2 = null;) eleman cöp toplayiciya gider
    }
}
/*
Which statement is true?
A.	After line 11, three objects are eligible for garbage collection.
B.	After line 11, two objects are eligible for garbage collection.
C.	After line 11, one object is eligible for garbage collection. (11. satırdan sonra bir nesne çöp toplama işlemine uygun hale gelir.)
D.	After line 11, none of the objects are eligible for garbage collection.

Answer: C

 */