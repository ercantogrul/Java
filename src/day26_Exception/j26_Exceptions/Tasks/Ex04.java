package day26_Exception.j26_Exceptions.Tasks;

public class Ex04 {
    public static void main(String[] args) {
        // Aşağıdaki code output ne olur ?

        //Object obj = new Integer(3);
        //String str = (String) obj;
        //System.out.println(str);//ClassCastException

        Object obj = "10";
        int num = Integer.parseInt(obj+""); // veya (obj.to String)
        System.out.println(num);

        
    }
}
