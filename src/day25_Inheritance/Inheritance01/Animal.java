package day25_Inheritance.Inheritance01;

public class Animal extends Canli{
    private int aSayisi;
    private String cinsiyet;



    public Animal(int omur, String cins) {
        super(omur, cins); // super class daki yani parent class
        // yani Canli class daki parametrelerie sahip constructor call edildi
        System.out.println("animal constructor cagrildi");
    }
    public Animal(int omur, String cins, int aSayisi, String cinsiyet) {
        super(omur, cins);
        this.aSayisi = aSayisi;
        this.cinsiyet = cinsiyet;
    }

    public Animal() {

    }

    public int getaSayisi() {
        return aSayisi;
    }

    public void setaSayisi(int aSayisi) {
        this.aSayisi = aSayisi;
    }

    public String getCinsiyet() {
        return cinsiyet;
    }

    public void setCinsiyet(String cinsiyet) {
        this.cinsiyet = cinsiyet;
    }

    @Override
    public String toString() {
        return "Animal{" +super.toString()+
                "aSayisi=" + aSayisi +
                ", cinsiyet='" + cinsiyet + '\'' +
                '}';
    }

    @Override
    void ses() {
        super.ses();
        System.out.println("animal ses");
    }
}
