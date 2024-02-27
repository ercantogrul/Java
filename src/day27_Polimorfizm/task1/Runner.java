package day27_Polimorfizm.task1;

public class Runner {

    public static void main(String[] args) {
        Book book1=new Book();//book sınıfından
        book1.sayfa();//Kitap 50 sayfa Book class
        book1.name="Seyir";
        System.out.println(book1.name); //Seyir
        System.out.println(book1);   //Book{type='Masal', name='Seyir'}

        Rapunzel rapunzel=new Rapunzel();
        rapunzel.name="rapunzel";
        rapunzel.yazar="Nuray";
        rapunzel.sayfa();//Override Kitap 100 sayfa Rapunzel
        rapunzel.sayfaRapunzel(12);//Kitap 12 sayfa
        System.out.println(rapunzel);  //Rapunzel{yazar='Nuray'}

        Book pinokyo=new Rapunzel();//polimorfizm
        pinokyo.sayfa();//Rapunzelden getiriyor //Kitap 100 sayfa Rapunzel
        //pinokyo.sayfaRapunzel(12);
        pinokyo.name="Pinokyo";//book class
        pinokyo.type="dddddd";
        System.out.println(pinokyo.name+" "+pinokyo.type);  //Pinokyo dddddd
          //class Rapunzel extends Book  yani Rapunzel Book clasini extends etmis
         // normal methodlarda :: obje den Book clasindaki normal methodlara ulasilabilir. Rapunzel deki methodlara ulasilamaz bunun icin casting yapmak gerekir
         // Override edilen methodlar da:: obje den Rapunzel deki override edilen methoda ulasilir. Book klasindaki metdhoda ulasamaz
        pinokyo.Bookkkk();















    }
}
