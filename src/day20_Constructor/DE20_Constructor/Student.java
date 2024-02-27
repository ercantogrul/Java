package day20_Constructor.DE20_Constructor;

public class Student {
    /*
   Task-> fields: ad, soyad, sınıf, ortalama, okulNo, takdirBelgesi olan bir pojo class olusturun
   - constuctor ve toString metotlarını olusturun

   2 farklı obj ile
   mezuniyet(ortalama 50 üstü ise mezun oldunuz) sosyalFaaliyet methodlarını  print eden code create ediniz.
    */
    String ad;
    String soyad;
    String sinif;
    double ortalama;
    int okulNo;
    boolean takdirBelgesi;
    boolean mezuniyet;
    String sosyalFaaliyet;

    public Student() {
    }

    public Student(Student ogr) {
        this.ad = kisalt(ogr.ad,5);
        this.soyad = kisalt(ogr.soyad,10);
        this.sinif = kisalt(ogr.sinif,2);
        this.ortalama = ogr.ortalama;
        this.okulNo = ogr.okulNo;
        if (ortalama>=50)  this.mezuniyet = true;
        else this.mezuniyet=false;
        if (ortalama>=80)  this.takdirBelgesi = true;
        else this.takdirBelgesi=false;
        this.sosyalFaaliyet = ogr.sosyalFaaliyet;
    }

    public String kisalt(String str, int uzunluk){
        if (str.length()>uzunluk) str = str.substring(0,uzunluk);
        return str;
    }

    public Student(double ortalama, int okulNo) {
        this.ortalama = ortalama;
        this.okulNo = okulNo;
        if (ortalama>=50)  this.mezuniyet = true;
        else this.mezuniyet=false;
        if (ortalama>=80)  this.takdirBelgesi = true;
    }

    public Student(String ad, String soyad, String sinif, double ortalama, int okulNo, String sosyalFaaliyet) {
        this.ad = kisalt(ad,5);
        this.soyad = kisalt(soyad,10);
        this.sinif = kisalt(sinif,2);
        this.ortalama = ortalama;
        this.okulNo = okulNo;
        if (ortalama>=50)  this.mezuniyet = true;
        else this.mezuniyet=false;
        if (ortalama>=80)  this.takdirBelgesi = true;
        else this.takdirBelgesi=false;
        this.sosyalFaaliyet = sosyalFaaliyet;
    }

    @Override
    public String toString() {
        return "Student{" +
                "ad='" + ad + '\'' +
                ", soyad='" + soyad + '\'' +
                ", sinif='" + sinif + '\'' +
                ", ortalama=" + ortalama +
                "\n okulNo=" + okulNo +
                ", takdirBelgesi=" + takdirBelgesi +
                ", mezuniyet=" + mezuniyet +
                ", sosyalFaaliyet='" + sosyalFaaliyet + '\'' +
                '}'+"\n";
    }
}
