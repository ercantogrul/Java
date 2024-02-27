package day27_Polimorfizm.task1;

public class Book {
    String type="Masal";
    String name;
    public void sayfa(){
        System.out.println("Kitap 50 sayfa");
    }
    public void Bookkkk(){
        System.out.println("???????????");

    }

    @Override
    public String toString() {
        return "Book{" +
                "type='" + type + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
