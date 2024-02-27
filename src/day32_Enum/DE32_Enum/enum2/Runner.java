package day32_Enum.DE32_Enum.enum2;

import java.awt.*;

public class Runner {
    public static void main(String[] args) {

        User kisi1 = new User("Hasan",Role.ADMIN,Status.ACTIVE);
        User kisi2 = new User("Şeyda",Role.CuSTOMER,Status.INACTIVE);

        kisi2.setDurum(Status.ACTIVE);
        kisi2.setName("Seyma");
        System.out.println(kisi2);
        // enum.toString() , in tersini yaptık
        Status ss = Status.valueOf("INACTIVE");
        System.out.println(ss);

        // dosya ya veriyi yazarken
        ss.ordinal(); // ile int değer elde edip onu yazabiliriz


        System.out.println(ss.ordinal());
        int index = 1; // dosyadan okuduğum değer
        // enum ın index ini kullanarak değeri elde ettik
        // dosyaya ordinal ile yazdığımız veriyi alıp enum a cevirirken kullanabiliriz
        Status[] arrSta = Status.values();
        ss = arrSta[index];
        kisi1.setDurum(ss);



    }
}
