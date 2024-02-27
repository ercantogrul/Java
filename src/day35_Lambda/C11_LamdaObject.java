package day35_Lambda;

import java.util.ArrayList;
import java.util.List;

public class C11_LamdaObject {
    public static void main(String[] args) {
        List<Kisi> list = new ArrayList<>();
        Kisi kisi;
        kisi = new Kisi("Ahmet" ,27,Cins.ERKEK); list.add(kisi);
        kisi = new Kisi("Ayse"  ,21,Cins.KADIN); list.add(kisi);
        kisi = new Kisi("Saliha",25,Cins.KADIN); list.add(kisi);
        kisi = new Kisi("Hasan" ,24,Cins.ERKEK); list.add(kisi);
        list.stream().filter(p->p.getYas()>24).forEach(System.out::println);

    }
}








