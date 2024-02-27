package projects.Obeb_okek;

public class Hesap {


    public static void obeb(ObebOkek obj1) {

        int min=Math.min(obj1.getA(), obj1.getB());
        int ortakBolen =1;
        for (int i = 1; i <=min ; i++) {
            if (obj1.getA()%i==0&&obj1.getB()%i==0 ){
                ortakBolen=i;
            }
        }
        System.out.println(ortakBolen);

    }


    public static void okek(ObebOkek obj1) {
        int max=Math.max(obj1.getA(), obj1.getB());
        int ortakKat =max;
        for (int i = 1; i <=max ; i++) {
            ortakKat=ortakKat*i;
            if (ortakKat%obj1.getA()==0 && ortakKat % obj1.getB()==0 ){
                System.out.println(ortakKat);break;
            }
        }

       // int okek = obj1.getA()*obj1.getB() /

    }
}
