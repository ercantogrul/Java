package day25_Inheritance._21Inheritance.inh04;

public class SubClass extends SuperClass {
	

	    int num = 10;

	    public static void goster() {

	        System.out.println("Bu method Sub classin goruntulenme methodudur.");
	    }


	    public void my_method() {

	    	SubClass sb = new SubClass();

	    	SubClass.goster();

	    	SuperClass.goster();

	        System.out.println("Sub classtaki eleman :  " + sb.num);

	        System.out.println("superClasstaki eleman :   " + super.num);
	    }

	    public static void main(String[] args) {

	    	SubClass sb = new SubClass();//obje olusturulmus..

	        sb.my_method(); //method cagiriyor, o zman


	    }

}
