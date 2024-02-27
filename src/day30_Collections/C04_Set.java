package day30_Collections;

import java.util.*;

public class C04_Set {
    public static void main(String[] args) {

        HashSet<String> hs1 = new HashSet<>(Arrays.asList("yavuz","ayse","jhon","michel","Timo","hasa"));
        Set<String> hs2 = new LinkedHashSet<>(Arrays.asList("yavuz","ayse","jhon","michel","Timo","hasa"));
        Set<String> hs3 = new TreeSet<>(Arrays.asList("yavuz","ayse","jhon","michel","Timo","hasa"));

        Iterator<String> itr = hs1.iterator();
        while (itr.hasNext()){  //rast gele siraladi
            System.out.print(itr.next()+" ");
        }
        System.out.println();
        Object obj =hs1.clone();
        System.out.println(obj);  //[Timo, jhon, yavuz, michel, ayse, hasa]

        Iterator<String> itrLhs = hs2.iterator();
        while (itrLhs.hasNext()) { //giris sirasina göre siraladi  //yavuz ayse jhon michel Timo hasa
            System.out.print(itrLhs.next()+" ");
        }
        System.out.println();

        Iterator<String> itrLTs = hs3.iterator();
        while (itrLTs.hasNext()) { // alfabetik olarak siraladi  //Timo ayse hasa jhon michel yavuz
            System.out.print(itrLTs.next()+" ");
        }
        System.out.println();


    }
}
