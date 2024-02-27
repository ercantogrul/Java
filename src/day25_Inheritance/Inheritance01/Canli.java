package day25_Inheritance.Inheritance01;

public class Canli {
    private int omur;
    private String cins;
    public Canli() {
    }
    public Canli(int omur, String cins) {
        this.omur = omur;
        this.cins = cins;
        System.out.println("canli constructor cagrildi");
    }
    public int getOmur() {
        return omur;
    }
    public void setOmur(int omur) {
        this.omur = omur;
    }
    public String getCins() {
        return cins;
    }
    public void setCins(String cins) {
        this.cins = cins;
    }
    @Override
    public String toString() {
        return "Canli{" +
                "omur=" + omur +
                ", cins='" + cins + '\'' +
                '}';
    }
    void  ses(){
        System.out.println("canli ses");
    }
    void  ses(int vv){
        System.out.println("canli ses");
        System.out.println("canli ses vv");
    }
}
