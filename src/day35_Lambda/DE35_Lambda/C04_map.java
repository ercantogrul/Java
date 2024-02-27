package day35_Lambda.DE35_Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C04_map {
    /*
   Map :Stream içerisinde erişilen her bir eleman üzerinde işlem yapmamıza
   ve başka elemanlara dönüştürmemize imkan sağlayan
   findFirst / Last / sum
    */
    // API = Application Programming Interface,
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList
                (11, 12, 7, 32,7 ,32, 41, 41, 32, 68, 41, 12, 7, 41, 43, 24, 32));
  //      System.out.println(list);

        list.stream().map(p->p%2==0? p+" çifttir":p+" tektir").forEach(System.out::print);
        System.out.println();
        list.stream().map(p->ciftTek(p)).forEach(System.out::print);
        System.out.println();
        list.stream().map(C04_map::ciftTek).forEach(System.out::print);
   //     list = list.stream().map(p->p+5).toList();

      //  System.out.println(list);
    }
    public static String ciftTek(int p){
        return p%2==0? p+" çifttir":p+" tektir";
    }
}
