package z_calismalar.OCI_sinav._223.Q201;

class Student {
    String name;
    public Student(String name){
        this.name=name;
    }

}
class Test{
    public static void main(String[] args){
        Student [] students= new Student[3];  //Student sinifindan 3. elemanli bir array olusturulmus
        // birinci eleman null, 2. eleman Richard 3.eleman ise Donald dir
        // sout icerisinde null.name seklinde yazilmis. bu sekilde kullanilamaz NullPointerException firlatir
        // null ile string bir method cagrilamaz
        // null.name seklinde daha olusmayan bir obje ile name e ulasilamaz

        students[1]=new Student("Richard");//students[0] ve students[2]  verilseydi önce Richard yazdirir sonra A NullPointerException firlatirdi
        students[2]=new Student("Donald");
        for( Student s:students){
            System.out.println(" "+s.name);  // ilk eleman icin null.name __ bu sekilde kullanilamaz NullPointerException firlatir
        }
     }
/*   What is the result?
    A.	nullRichardDonald
    B.	RichardDonald
    C.	Compilation fails.
    D.	An ArrayIndexOutOfBoundsException is thrown at runtime.
    E.	A NullPointerException is thrown at runtime.
*/















//        students[2]=new Student("Donald");
//        for( Student s:students){
//            System.out.println(" "+s.name);
//        }
//    }
}

// What is the result?
/*
*A. nullRichardDonald
B. RichardDonald
C. Compilation fails
D. An ArrayOutOfBoundException is thrown at runtime
E. A NullPointerException is thrown at runtime.
*/


