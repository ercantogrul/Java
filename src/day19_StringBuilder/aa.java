package day19_StringBuilder;

public class aa {
    public static void main(String[] args) {

        StringBuilder ab = new StringBuilder("kkk");

        ab.append("ali");
        System.out.println(ab ); //kkkali
        ab.delete(1,2);
        System.out.println(ab ); //kkali
        ab.reverse();
        System.out.println(ab); //ilakk

        ab.substring(2,4);
        System.out.println("ab.substring(2,4) = " + ab.substring(2, 4)); //ab.substring(2,4) = ak
        String str = ab.substring(2,4);
        System.out.println(ab); //ilakk NOT: bilgi getiren methodlar ab yi degistirmez
        ab.subSequence(1,3);
        System.out.println("ab.subSequence(1,3) = " + ab.subSequence(1, 3));  //ab.subSequence(1,3) = la
        System.out.println(ab);  //ilakk NOT: bilgi getiren methodlar ab yi degistirmez

        ab.insert(0,"K");
        System.out.println(ab);  //Kilakk
        //belirtilen index eekleme yapar digerlerini ileri iter
        ab.insert(2,"abb");
        System.out.println(ab);  //Kiabblakk

        ab.charAt(2);
        System.out.println("ab.charAt(2) = " + ab.charAt(2));//ab.charAt(2) = a //NOT: bilgi getiren methodlar ab yi degistirmez
        System.out.println(ab); //Kiabblakk

        ab.indexOf("abb");
        System.out.println("ab.indexOf(\"abb\") = " + ab.indexOf("abb")); //ab.indexOf("abb") = 2
        System.out.println(ab); //Kiabblakk
        ab.indexOf("a",2);
        System.out.println("ab.indexOf(\"a\",3) = " + ab.indexOf("a", 3));//ab.indexOf("a",3) = 6
        //istedigimiz indexten sonrasinda arama yapar
        System.out.println(ab);  //Kiabblakk
        ab.lastIndexOf("a");
        System.out.println("ab.lastIndexOf(\"a\") = " + ab.lastIndexOf("a")); //ab.lastIndexOf("a") = 6
        ab.lastIndexOf("a",5);
        System.out.println("ab.lastIndexOf(\"a\",5) = " + ab.lastIndexOf("a", 5)); //ab.lastIndexOf("a",5) = 2
        //istenen indexten oncesine bakar

        ab.replace(2,5,"PPP");
        System.out.println(ab); //KiPPPlakk  //baslangic ve bitis index'leri arasindaki kismi
         // verilen String ile degistirir
    }
}
