package asya_hoca_.Projects.Kitapci;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Runner {

    static Map<Integer,BilgiPojo> kitapMap =new LinkedHashMap<>();
    static List<BilgiPojo> kitapList = new ArrayList<>();
    static int count =1000;
    public static void main(String[] args) {
        Menuler.menu();
    }
}
