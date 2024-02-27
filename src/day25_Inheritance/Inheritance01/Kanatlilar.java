package day25_Inheritance.Inheritance01;

public class Kanatlilar extends Animal {
    private String kanatUzunlugu;

    public Kanatlilar(int omur, String cins) {
        super(omur, cins);// super class daki yani parent class
        // yani Animal class daki parametrelerie sahip constructor call edildi
        System.out.println("kanatlilar");
    }

    public Kanatlilar(int omur, String cins, int aSayisi, String cinsiyet, String kanatUzunlugu) {
        super(omur, cins, aSayisi, cinsiyet);
        this.kanatUzunlugu = kanatUzunlugu;
    }

    public String getKanatUzunlugu() {
        return kanatUzunlugu;
    }

    public void setKanatUzunlugu(String kanatUzunlugu) {
        this.kanatUzunlugu = kanatUzunlugu;
    }

    @Override
    public String toString() {
        return "Kanatlilar{" +super.toString()+
                "kanatUzunlugu='" + kanatUzunlugu + '\'' +
                '}';
    }
    @Override
    void ses() {
        super.ses();
        System.out.println("kanatlilar");
    }
    @Override
    void ses(int vv) {
        super.ses(vv);
        System.out.println("kanatlilar vv");
    }
}
