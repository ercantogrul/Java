package day24_Encapsulation.DE24_Encapsulation_ilk.Tasks.task05;

public class Main {
    public static void main(String[] args) {
        Book obj =new Book("Karamazov Kardeşler","Dostoyevski ",true);
        System.out.println(obj);
        System.out.println();


        obj.setAuthorName(" Khaled Hosseini");
        obj.setBookName("Bin Muhteşem Güneş");
        obj.setOkunduMu(false);


        System.out.println(obj.getBookName());
        System.out.println(obj.getAuthorName());
        System.out.println(obj.isOkunduMu());
    }
}
