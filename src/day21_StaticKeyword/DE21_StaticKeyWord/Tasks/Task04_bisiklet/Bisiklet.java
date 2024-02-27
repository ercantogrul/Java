package day21_StaticKeyword.DE21_StaticKeyWord.Tasks.Task04_bisiklet;

public class Bisiklet {
    int hiz;
    int vites;

    public void hizDegistir(int yeniHiz){
        hiz=yeniHiz;
    }
    public void vitesArttir(){
        vites++;
        if (vites>5){
            System.out.println("vites 5 den büyük olamaz");
            vites=5;
        }
    }
    public void vitesAzalt(){
        vites--;
        if (vites<1){
            System.out.println("vites 1 den kücük olamaz");
            vites=1;
        }
    }
    public void durumGoster(){
        System.out.println("hiz = " + hiz+",   vites = " + vites);

    }




}
