package day10_MethodCreation.C01_Method;

public class A04_methodOlusturma_Kullanma {
    public static void main(String[] args) {


        A01_Method_void.altString("Method",1,3); // et

        System.out.println(A03_Method_return.isimDuzenle("bugra", "CAN")); // Bugra Can

        String isimDuzenli = A03_Method_return.isimDuzenle("mehmet","kemal");

        // duzenlenis ismin uzunlugunu yazdirin
        System.out.println(isimDuzenli.length());

      /*
        Void olan method'da sonucu KAYDEDEMEYIZ, sadece yazdiririz

        bize deger DÖNDÜREN method'da ise sonucu istersek direk yazdirir, istersek de kaydederiz
       */



    }
}
