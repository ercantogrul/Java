package day25_Inheritance.DE25_InHeritance.task02;

public class SubClass extends SuperClass {
    int sayi= 17;
    void ebikGabik(){
        System.out.println("Agam SubClass'dan selam dewamkeee. ");
    }

   public void javaCAN (){
       super.ebikGabik();
        ebikGabik();
   }
    public int getSayi() {
        return sayi;
    }
    public void setSayi(int sayi) {
        this.sayi = sayi;
    }
    @Override
    public String toString() {
        return  "SubClasstaki sayi   :"+super.sayi+
                "\nsüperClasstaki sayi :"+sayi;

    }
}
