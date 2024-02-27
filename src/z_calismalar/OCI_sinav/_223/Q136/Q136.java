package z_calismalar.OCI_sinav._223.Q136;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Q136 {
    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>();
        arrayList.add("Tech");
        arrayList.add("Expert");
        arrayList.set(0, "Java");
        arrayList.forEach(a -> a.concat("Forum"));  // forEach ile a.concat diyerek Forum u birlestirmis ama bunu bir yere aktarmamis... BOS KOD
        arrayList.replaceAll(s -> s.concat("Group"));  //ama replaceAll methodu degistirir... atamaya gerek yok
        System.out.println(arrayList);


    }
}
/*
What is the result?
A. [JavaForum, ExpertForum]
B. [JavaGroup, ExpertGroup]
C. [JavaForumGroup, ExpertForumGroup]
D. [JavaGroup, TechGroup ExpertGroup]
Answer: B
*/