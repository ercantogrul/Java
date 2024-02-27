package asya_hoca_.Encapsulation.User;

public class Twitter {
    public static void main(String[] args) {
        User obj = new User();
        obj.age=12;
        obj.ad ="Hasan";
        System.out.println(obj);
        obj.ad="Ebru";
        System.out.println(obj);

        obj.setId(7);
        System.out.println(obj);
        obj.setId(2);
        User obj2 = new User("ali",234,12);
        System.out.println(obj2); //ali 10 12
    }


}
