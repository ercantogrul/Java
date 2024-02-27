package day14_ForEachLoops.DE14_ForEachLoops.Tasks;

public class Task01 {
    // task-> iki string array elemanlarının ortak olmasını kontrol eden code create ediniz..
    // with for-each ortak elemanları yazdırın // contains v.s. kullanmayın


    public static void main(String[] args) {
        String[] arr1 = {"nazım", "gülsüm", "dilek", "erol", "cüneyt", "ciğdem"};
        String[] arr2 = {"gülsüm","musty",  "ayşe", "enise", "ciğdem" ,"cüneyt"};

        for (String ilk:arr1) {
            for (String ikinci:arr2) {
                if (ilk.equals(ikinci)){
                    System.out.println("ortak olanlar : "+ilk);
                }


            }

        }




    }
}
