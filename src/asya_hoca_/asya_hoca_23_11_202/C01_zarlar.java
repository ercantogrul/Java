package asya_hoca_.asya_hoca_23_11_202;

public class C01_zarlar {
    public static void main(String[] args) {

        /*
    Iki tane atilan zarin toplamlarinin 9 olmasi durumanda "Kazandiniz"
    yazisini yazdirin,   aksi takdirde "Tekrar deneyiniz" yazisi yazmali

     */

                int toplam=0;
                do{
                    int zar1 = (int) (Math.random()*6+1);
                    int zar2 = (int) (Math.random()*6+1);
                    toplam = zar1+zar2;
                    System.out.println(toplam);
                    if (toplam==9){
                        System.out.println("kazandiniz");break;
                    }else System.out.println("devam edin");

                }while (toplam!=9);



    }
}
