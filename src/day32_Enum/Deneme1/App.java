package day32_Enum.Deneme1;

import java.util.ArrayList;

public class App {

    enum Color{
        RED, GREEN, BLUE, LIGHT_BLUE;  // enum lar bu sekilde tanimlanir
    }

    public static void main(String[] args) {
        ArrayList<Customer> customers = new ArrayList<>();
        customers.add(new Customer(1,"Ali","Ankara",Color.GREEN));
        customers.add(new Customer(2,"Irmak","Istanbul",Color.RED));
        customers.add(new Customer(3,"Ayse","Izmir",Color.BLUE));
        customers.add(new Customer(4,"Mert","Istanbul",Color.BLUE));
        customers.add(new Customer(5,"Damla","Ankara",Color.GREEN));
        // parametredehi bilgileri tek tek girerken hata yapma ihtimalimiz yüksektir. örnegin Ankara yerine Ankar yazilabilir
        //veya Yesil yerine Yebil yazilabilir. yani bir harf fazla veya eksik veya farkli yazabiliriz
        // iste bu tür hatalara engel olmak icin Enum olusturabiliriz
        // Enum lari yeni bir Class tanimlayarakta olusturabiliriz veya var olan bir Clasin icinde de tanimlayabiliriz
        // Renkleri bu sinifin icinde tanimlayalim

        Color color = Color.BLUE;  // yikarda tanimlanan renkler disinda renk üretemeyiz buda yapilabilecek hatalari önler
        // Color color! = Color.YELLOW; // bu sekilde YELLOW olmadigi icin olusturamayiz


    }
}
