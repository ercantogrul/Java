package day10_MethodCreation.C01_Method;

public class C01_Method {
    public static void main(String[] args) {
        // Statik method icinde ancak statik bir method dogrudan cagrilir.
        C01_Method.ilkMethod();
        ilkMethod();  // kendi class in icinde bu sekildede cagrila bilinir

    }public static void ilkMethod(){ // () parantez arasina, bu methoda gönderecegimiz parametreler yazilir
                                    // void:method bize birsey geriye göndermeyecek demektir

        System.out.println("ilk method cagrildi");

    }
}
