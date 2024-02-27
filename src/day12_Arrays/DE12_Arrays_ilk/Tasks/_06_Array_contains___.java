package day12_Arrays.DE12_Arrays_ilk.Tasks;

public class _06_Array_contains___ {

    public static void main(String[] args) {

        /*
        String array oluşturun ve elemanları : Apple , Orange , Banana , Pineapple
        Apple elemanının bu Array'a ait olup olmadığını kontrol edin.
        Eğer aitse "true" çevirin.
        Loops (döngüler) kullanın.
         */

        //Kodu aşağıya yazınız..

        String [] array ={"Apple", "Orange", "Banana", "Pineapple"};

        boolean sonuc = appleVarmi(array);
        System.out.println("Apple vermi; "+sonuc);

    }

    private static boolean appleVarmi(String[] array) {
        boolean flag = true;
        for (int i = 0; i < array.length; i++) {
            if (array[i].contains("Apple")) {
                flag = true;
                break;
            }else flag=false;
        }
        return flag;
    }
}
