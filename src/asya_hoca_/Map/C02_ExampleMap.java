package asya_hoca_.Map;

import java.util.*;

public class C02_ExampleMap {
    public static void main(String[] args) {
        Map<String, Integer> students = new HashMap<>();
        students.put("Aygun", 95);
        students.put("Maria", 90);
        students.put("Ali",25);
        students.put("Alex",40);
        students.put("Ozan",99);
        students.put("Serkan",30);
        students.put("Andriy",98);

        Map<String, Integer>  pass = new HashMap<>(); // score >= 50
        Map<String, Integer> fail = new HashMap<>(); // score < 50


        List<Integer>values=new ArrayList<>(students.values());
        Collections.sort(values);
        System.out.println("Values:"+values);
        Integer min=students.get("Aygun");
        Integer max=students.get("Aygun");
        int countPass=0,countFail=0;


        for (String key : students.keySet()) {
            Integer value=students.get(key);
            if(min>value){
                min=value;

            }
            if(max<value){
                max=value;
            }
            if(value>=50){
                pass.put(key,value);
                countPass++;
            }else {
                fail.put(key,value);
                countFail++;
            }
        }
        System.out.println("Pass: "+pass);
        System.out.println("fail = " + fail);
        System.out.println("Min:"+min);
        System.out.println("max = " + max);
        System.out.println("countPass = " + countPass);
        System.out.println("countFail = " + countFail);


        for (Map.Entry<String, Integer> entry : students.entrySet()) {
//            System.out.println(entry);
//
//            System.out.println(entry.getKey()+": "+entry.getValue());
            if (entry.getValue()>70){
                System.out.println(entry.getKey()+": "+entry.getValue()+"  star of the schoool");
            }
        }



    }


}








