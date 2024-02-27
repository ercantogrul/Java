package day31_Map;

import java.util.HashMap;
import java.util.Map;

public class C03_Get {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        map.put("Germany", "Berlin");
        map.put("Holland", "Amsterdam");
        map.put("Belqium", "Brussels");
        map.put("Ranska", "Pariisi");

        System.out.println(map.get("Holland")); //Amsterdam
    }
}
