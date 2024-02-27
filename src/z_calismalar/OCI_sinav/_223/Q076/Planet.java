package z_calismalar.OCI_sinav._223.Q076;
abstract class Planet{
    protected void revolve(){
    }
    abstract void rotate();//final ve private method’lar override edilemeyecekleri icin, abstract method’lar final veya private olarak tanimlanamaz.
}
//class Earth extends Planet{
   // private void revolve(){ //protected tanimlandigi icin protected veya public olabilir
  //  }
  // private void rotate(){ //rotate() methodu-- yukarda default tanimlandigi icin burada da default-protect_public olabilir //make a protected
  //  }
//}
/*
Which two modifications enable the code to compile? or question might be three modifications
A. Make the method at line 8 protected.
B.	Make the method at line 8 public.
C.	Make the method at line 10 protected.
D.	Make the method at line 4 public.
E.	Make the method at line 2 public.




Answer: AC veya BC ikiside calisir
 */
