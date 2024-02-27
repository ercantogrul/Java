package day20_Constructor.DE20_Constructor_ilk.Tasks.Teacher;

public class Teacher {
    /*field ları  id,ad,name,brans, tecrube, maas, emekli
     olan bir Teacher class ı oluşturun
    Constructor ve toString metotları oluşturun
    10 adet ogretmen  verisi oluşturup bunları bir array liste atın
   daha sonra, ekli olmayanları, ad soyad ve maaşlarını liste şeklinde yazdırın

     */

    String ad;
    String soyad;
    String brans;
    int tecrube;
    int maas;
    boolean emekli;

    public Teacher() {
    }

    public Teacher(String ad, String soyad, int maas) {
        this.ad = ad;
        this.soyad = soyad;
        this.maas = maas;
    }

    public Teacher(String ad, String soyad, String brans, int tecrube, int maas, boolean emekli) {
        this.ad = ad;
        this.soyad = soyad;
        this.brans = brans;
        this.tecrube = tecrube;
        this.maas = maas;
        this.emekli = emekli;
    }

    @Override
    public String toString() {
        return "TeacherRunner{" +
                "ad='" + ad + '\'' +
                ", soyad='" + soyad + '\'' +
                ", brans='" + brans + '\'' +
                ", tecrube=" + tecrube +
                ", maas=" + maas +
                ", emekli=" + emekli +
                '}';
    }
}
