package day20_Constructor;

public class Student {
     /*
Task-> fields: ad, soyad, sınıf, ortalama, okulNo, takdirBelgesi olan 2 farklı obj ile
mezuniyet(ortalama 50 üstü ise mezun oldunuz) sosyalFaaliyet methodlarını  print eden code create ediniz.
 */

    String ad;
    String soyad;
    String sinifi;
    double ortalama;
    int okulNo;
    boolean takdirBelgesi;
    boolean mezuniyet;
    String sosyalFaaliyet;

    public Student() {

    }

    public String kisalt(String str,int uzunluk){  // girilen verilerde cok uzunsa kisaltmalara gidebiliriz bu sekilde
        if (str.length()>uzunluk) str=str.substring(0,uzunluk);
        return str;
    }

    public Student(String ad, String soyad, String sinifi, double ortalama, int okulNo, String sosyalFaaliyet) {
        this.ad = kisalt(ad,5);
        this.soyad = kisalt(soyad,10);
        this.sinifi = kisalt(sinifi,2);
        this.ortalama = ortalama;
        this.sosyalFaaliyet=sosyalFaaliyet;
        this.okulNo = okulNo;
        if (ortalama>=50) this.mezuniyet = true;
        else this.mezuniyet =false;
        if (ortalama > 80) this.takdirBelgesi = true;
        else this.takdirBelgesi = false;


    }

    @Override
    public String toString() {
        return "Student{" +
                "ad='" + ad + '\'' +
                ", soyad='" + soyad + '\'' +
                ", sinifi='" + sinifi + '\'' +
                ", ortalama=" + ortalama +
                ", okulNo=" + okulNo +
                ", takdirBelgesi=" + takdirBelgesi +
                '}';
    }
}
