package day27_Polimorfizm.task1;

public class Rapunzel extends Book{

    String yazar="Nuray";
    public void sayfa(){//Override  yapıldı
        System.out.println("Kitap 100 sayfa Rapunzel");
    }
    public void sayfaRapunzel(int sayi){
        System.out.println("Kitap "+sayi+" sayfa");
    }
    public static void yazarMethod(){
        System.out.println("yazar");
    }
    public void Rapunzellll(){
        System.out.println("::::::::::");
    }

    @Override
    public String toString() {
        return "Rapunzel{" +
                "yazar='" + yazar + '\'' +
                '}';
    }
}
