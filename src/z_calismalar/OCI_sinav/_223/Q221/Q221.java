package z_calismalar.OCI_sinav._223.Q221;

import java.util.ArrayList;
import java.util.List;

public class Q221 {
    public static void main(String[] args) {
        List colors=new ArrayList();
        colors.add("green");
        colors.add("blue");
        colors.add("red");
        colors.add("yellow");
        colors.remove(2);
        System.out.println(colors);
        colors.add(3,"cyan"); //3 eleman yani 2. index dolu iken 3. index e eleman ekleyebiliriz
        //ama 2. index dolu iken 4. index e eleman ekleyemeyiz "IndexOutOfBoundsException" hatasi verir
        System.out.println(colors);
    }
}
//    What is the result?
//        A. [green, red, yellow, cyan]
//        B. [green, blue, yellow, cyan]
//        C. [green, red, cyan, yellow]
//        D. An IndexOutOfBoundsException is thrown at runtime.
//        Answer: B
