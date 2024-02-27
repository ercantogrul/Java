package day32_Enum.DE32_Enum.enum4;

public enum AYLAR {
    OCAK(31),
    SUBAT(28),
    MART(31),
    NISAN(30),
    MAYIS(31),
    HAZIRAN(30),
    TEMMUZ(31),
    AGUSTOS(31),
    EYLUL(30),
    EKIM(31),
    KASIM(30),
    ARALIK(31);


    int gunSayisi;


    AYLAR(int gunSayisi) {
        this.gunSayisi=gunSayisi;
    }
}
