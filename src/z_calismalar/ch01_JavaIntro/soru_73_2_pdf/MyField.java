package z_calismalar.ch01_JavaIntro.soru_73_2_pdf;

public class MyField {
    int x;
    int y;
    public void dos(int x, int y){
        x=x;
        y = this.y;
    }
    public void display(){
        System.out.print(x + " " + y + " ");
    }

    public static void main(String[] args) {
        MyField m1 = new MyField();
        m1.x =100;
        m1.y =200;
        MyField m2 = new MyField();
        m2.dos(m1.x,m1.y);
        m1.display();
        m2.display();
    }
}
