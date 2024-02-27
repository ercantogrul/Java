package day25_Inheritance.Inheritance01;

public class Runner {
    public static void main(String[] args) {
        //Animal hayvan = new Animal(30,"hayvan");
        Kanatlilar knt =new Kanatlilar(10,"cins");
        //canli constructor cagrildi
        //animal constructor cagrildi
        //kanatlilar

        Kanatlilar knt1 =new Kanatlilar(10,"cins",4,"disi","40");
        System.out.println("knt1 = " + knt1);
        //knt1 = Kanatlilar{Animal{Canli{omur=10, cins='cins'}aSayisi=4, cinsiyet='disi'}kanatUzunlugu='40'}

        System.out.println("knt1.getKanatUzunlugu() = " + knt1.getKanatUzunlugu());
        //knt1.getKanatUzunlugu() = 40

        knt.ses();  //canli ses//animal ses
        knt.ses(5);//canli ses vv //kanatlilar vv

        Canli cc = new Kanatlilar(20,"cinsdir");
        System.out.println("___________________");
        cc.ses();


    }
}
