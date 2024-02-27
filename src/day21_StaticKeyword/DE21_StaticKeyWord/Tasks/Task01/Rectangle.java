package day21_StaticKeyword.DE21_StaticKeyWord.Tasks.Task01;

public class Rectangle {
    int width;
    int length;
    public Rectangle() {
    }
    public Rectangle(int width, int length) {
        this.width = width;
        this.length = length;
    }
    public int cevreHesaplama() {

        return width*2+length*2;
    }
    public int alanHesaplama(int width, int length) {
        return width*length;
    }
    public int cevreHesaplama(int width, int length) {

        return width*2+length*2;
    }
}
