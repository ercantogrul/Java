package day30_Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Co1_ArrayList {
    public static void main(String[] args) {

        ArrayList<Integer> arrList = new ArrayList<>(Arrays.asList(2,3,4));
        ArrayList<Integer> arrList2 = new ArrayList<>(Arrays.asList(71,72,73));
        ArrayList<Integer> cloneList = new ArrayList<>();

        //add ()
        arrList.add(12);  // boolean dönderir
        System.out.println("arrList.add(13) = " + arrList.add(13));// boolean dönderir  true
        arrList.add(2,91); System.out.println(arrList); // verilen index e eleman ekleme  [2, 3, 91, 4, 12, 13]
        //addFirst() ve addLast()
        arrList.addFirst(41);System.out.println(arrList); //basa eleman ekleme [41, 2, 3, 91, 4, 12, 13]
        arrList.addLast(1);System.out.println(arrList); //sona eleman ekleme   [41, 2, 3, 91, 4, 12, 13, 1]
        //addAll()
        arrList.addAll(2,arrList2);System.out.println(arrList);  //2. index e arrList2 i ekliyor [41, 2, 71, 72, 73, 3, 91, 4, 12, 13, 1]
        //clear()
        arrList.clear();System.out.println(arrList);  // arrList ici bisaldi  []
        //isEmpty()
        System.out.println("arrList.isEmpty() = " + arrList.isEmpty()); //arrList.isEmpty() = true
        System.out.println(arrList);   //[]
        //arrList=arrList2;
        arrList=arrList2; System.out.println(arrList); // arrList2 yi arrList e atadik esitledik (referans ve deger) [71, 72, 73]
        //clone()
        //cloneList=arrList.clone(); bos bir ArrayList e clone esitlenmez
        System.out.println("arrList.clone() = " + arrList.clone()); //clone yapilan veriyi verir arrList.clone() = [71, 72, 73]

        System.out.println(arrList);//[71, 72, 73]
        System.out.println(arrList2); //[71, 72, 73]
        //set()
        arrList.set(0,22);System.out.println(arrList);  // 0. index teki elemanin üzerine verilen 22 elemani eklendi [22, 72, 73]
        //get(), getFirst(), getLast()
        System.out.println("arrList.get(2) = " + arrList.get(2)); // 2. index deki elemani verir
        System.out.println("arrList.getFirst() = " + arrList.getFirst());
        System.out.println("arrList.getLast() = " + arrList.getLast());
        //remove() index ile
        System.out.println("arrList.remove(2) = " + arrList.remove(2)); //2. index deki elemani siler // arrList.remove(2) = 73
        System.out.println(arrList); //[22, 72]
        //removeFirst(), removeLast(), removeAll()

        //remove() obje ile
        ArrayList<String> list = new ArrayList<>(Arrays.asList("Ali","Mehmet","Dursun"));
        System.out.println("list.remove(\"Ali\") = " + list.remove("Ali")); // list.remove("Ali") = true
        System.out.println(list);  // [Mehmet, Dursun]
        //size()
        System.out.println("list.size() = " + list.size());//list.size() = 2
        //indexOf()  ve lastIndexOf("Mehmet") obje ile
        System.out.println("list.indexOf(\"Dursun\") = " + list.indexOf("Dursun")); //list.indexOf("Dursun") = 1
        System.out.println("list.lastIndexOf(\"Mehmet\") = " + list.lastIndexOf("Mehmet")); //mehmet in bulundugu son indexi verir
        //equals() obje ile
        System.out.println("list.equals(arrList2) = " + list.equals(arrList2));  //list ile arrList2 esit degil //list.equals(arrList2) = false
        //contains("Dursun")  obje ile
        System.out.println("list.contains(\"Dursun\") = " + list.contains("Dursun")); //list.contains("Dursun") = true

        ArrayList<Integer> aList1 = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        ArrayList<Integer> aList2 = new ArrayList<>(Arrays.asList(11,2,33,4,7));
        //sort()
        Collections.sort(aList2); System.out.println(aList2);  //  sort yapilan list kücükten büyüge siralanir [2, 4, 7, 11, 33]
        //subList()
        //aList2.subList(baslangix idx, bitis idx))  baslangic ve bitis indx i verilen parcayi alir ama silmez
        System.out.println("aList2.subList(1,3) = " + aList2.subList(1, 3));  // aList2.subList(1,3) = [4, 7]
        System.out.println(aList2);  //[2, 4, 7, 11, 33]
        //retainAll()
        //aList1.retainAll(aList2) aList1 in aList2 de ortak olan velemanlarini verir digerlerini siler
        System.out.println("aList1.retainAll(aList2) = " + aList1.retainAll(aList2));  // aList1.retainAll(aList2) = true
        System.out.println(aList1);  //[2, 4]

        //Array i Liste cevir
        int [] aDizisi = {10,20,11,23,12};
        int [] bDizisi = new int[10];


    }
}
