package asya_hoca_.Lambda_Challange.Task;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class Task01 {
    // S1:listi aralarinda bosluk birakarak yazdiriniz
// S2: sadece negatif olanlari yazdir
// S3: pozitif olanlardan yeni bir liste olustur
// S4: list in elemanlarin karelerinden yeni bir list olusturalim
// S5 : list in elemanlarin karelerinden tekrarsiz yeni bir list olusturalim
// S6: listin elemanlarini kucukten buyuge siralayalim
// S7: listin elemanlarini buyukten kucuge siralayalim
// S8: list pozitif elemanlari icn kuplerini bulup birler basamagi 5 olanlardan yeni bir list olusturalim
// S9: list pozitif elemanlari icn karelerini bulup birler basamagi 5 olmayanlardan yeni bir list olusturalim
// S10 :list elemanlarini toplamini bulalim
// S11 : peek ornegi cozelim - negatiflerin karelerinden list olusturalim
/*
             peek () 'in Javadoc sayfası şöyle diyor: " Bu yöntem, temelde, öğeleri bir
            ardışık düzen içinde belirli bir noktadan geçerken görmek istediğiniz
            yerde hata ayıklamayı desteklemek için vardır . Ara islemdir.. yapilam islemi gormek icin kullanilir
*/
// S12 : listede 5 den buyuk  sayi var mi?
// S13 : listenin tum elemanlari sifirdan kucuk mu?
// S14: listenin 100 e esit elemani yok mu ?
// S15: listenin sifira esit elemani yok mu?
// S16:  listenin ilk 5 elemanini topla?
// S17: listenin son bes elemaninin  listele
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(-5, -8, -2, -12, 0, 1, 12, 5, 6, 9, 15, 8));
        List<String> list2 = new ArrayList<>(Arrays.asList("Ayse","Ali","Mehmet"));


        printEachList(list);
        printEach.accept(list);
        printEach.accept(list2);
        negativList(list);
        negativList1(list);
        pozitivList(list);
        kareList(list);
        tekrarsizKareList(list);
        kucuktenBuyuge(list);
        buyuktenKucuge(list);
        pozitifKup5(list);
        pozitifKup5olmayan(list);
        toplamList(list);
        karePeek(list);
        bestenBuyukSayiVarmi(list);
        tumElmSifirdanKucukMu(list);
        yuz_eEsitElmYokMu(list);
        sifir_aEsitElmYokMu(list);
        ilk5ElmTopla(list);
        son5ElmListele(list);







    }
    private static void printEachList(List<Integer> list){
        // S1:listi aralarinda bosluk birakarak yazdiriniz
        list.stream().forEach(p-> System.out.print(p+" "));
        System.out.println();
    }
    static Consumer <List> printEach =p-> System.out.println(p+" ");
    private static void negativList(List<Integer> list){
        // S2: sadece negatif olanlari yazdir
        list.stream().filter(p->p<0).forEach(p-> System.out.print(p+" "));
        System.out.println();
    }
    private static void negativList1(List<Integer> list){
        // S2: sadece negatif olanlari listede topla
        List<Integer> negativ = new ArrayList<>();
        //negativ=list.stream().filter(p->p<0).collect(Collectors.toList()); // asagidaki ile ayni
        negativ=list.stream().filter(p->p<0).toList();
        System.out.println(negativ);
    }
    private static void pozitivList(List<Integer> list){
      // S3: pozitif olanlardan yeni bir liste olustur
        List<Integer> pozitiv = new ArrayList<>();
        pozitiv=list.stream().filter(p->p>0).toList();
        System.out.println(pozitiv+"\n");
    }
    private static void kareList(List<Integer> list){
        // S4: list in elemanlarin karelerinden yeni bir list olusturalim
        List<Integer> karelist = new ArrayList<>();
        //karelist= list.stream().map(p-> (int) Math.pow(p,2)).toList(); // asagidaki ile ayni
        karelist= list.stream().map(p-> p*p).toList();
        System.out.println(karelist+"\n");
    }
    private static void tekrarsizKareList(List<Integer> list){
    // S5 : list in elemanlarin karelerinden tekrarsiz yeni bir list olusturalim
        List<Integer> tekrarsizKarelist = new ArrayList<>();
        tekrarsizKarelist=list.stream().map(p->p*p).distinct().toList();
        System.out.println(tekrarsizKarelist);
    }
    private static void kucuktenBuyuge(List<Integer> list){
        // S6: listin elemanlarini kucukten buyuge siralayalim
        list.stream().sorted().forEach(p-> System.out.print(p+" "));
        System.out.println();
    }
    private static void buyuktenKucuge(List<Integer> list){
        // S7: listin elemanlarini buyukten kucuge siralayalim
        list.stream().sorted(Comparator.reverseOrder()).forEach(p-> System.out.print(p+" "));
        System.out.println();
    }


     private static void pozitifKup5(List<Integer> list){
         // S8: list pozitif elemanlari icn kuplerini bulup birler basamagi 5 olanlardan yeni bir list olusturalim
         List<Integer> pozitifkup5 = new ArrayList<>();
         pozitifkup5= list.stream().filter(p->p>0).map(t->(int)Math.pow(t,3)).filter(x->x%5==0).toList();
         System.out.println(pozitifkup5);
     }
    private static void pozitifKup5olmayan(List<Integer> list){
        // S9: list pozitif elemanlari icn karelerini bulup birler basamagi 5 olmayanlardan yeni bir list olusturalim
        List<Integer> pozitifKup5olmayan = new ArrayList<>();
        pozitifKup5olmayan= list.stream().filter(p->p>0).map(t->(int)Math.pow(t,3)).filter(x->x%5!=0).toList();
        System.out.println(pozitifKup5olmayan);
    }
    private static void toplamList(List<Integer> list){
        // S10 :list elemanlarini toplamini bulalim
        List<Integer> pozitifKup5olmayan = new ArrayList<>();
       int sum =list.stream().reduce(0,(top,p)->top+p);
       int sum1 =list.stream().reduce(0, Integer::sum); // aynisi
        System.out.println("sum"+sum);
        System.out.println("======================");


    }

    private static void karePeek(List<Integer> list){
        /*peek () 'in Javadoc sayfası şöyle diyor: " Bu yöntem, temelde, öğeleri bir
            ardışık düzen içinde belirli bir noktadan geçerken görmek istediğiniz
            yerde hata ayıklamayı desteklemek için vardır . Ara islemdir.. yapilam islemi gormek icin kullanilir
    */
        List<Integer> karePeek = new ArrayList<>();
        //karelist= list.stream().map(p-> (int) Math.pow(p,2)).toList(); // asagidaki ile ayni
        karePeek= list.stream().filter(x->x<0).peek(t-> System.out.println("Negatif sayilar :"+t)).map(x->(int)Math.pow(x,2)).peek(x-> System.out.println("Kareleri : "+x)).toList();
        System.out.println(karePeek);
    }

    private static void bestenBuyukSayiVarmi(List<Integer> list){
        // S12 : listede 5 den buyuk  sayi var mi?
        System.out.println(list.stream().anyMatch(p->p>5));
    }
    private static boolean bestenBuyukSayiVarmi1(List<Integer> list){ // yukardaki ile ayni
        // S12 : listede 5 den buyuk  sayi var mi?
        return list.stream().anyMatch(p->p>5);
    }
    private static void tumElmSifirdanKucukMu(List<Integer> list){
        // S13 : listenin tum elemanlari sifirdan kucuk mu?
        System.out.println(list.stream().allMatch(p->p<0));
    }
    private static void yuz_eEsitElmYokMu(List<Integer> list){
        // S14: listenin 100 e esit elemani yok mu ?
        System.out.println(list.stream().noneMatch(p->p==100));
    }
    private static void sifir_aEsitElmYokMu(List<Integer> list){
        // S15: listenin sifira esit elemani yok mu?
        System.out.println(list.stream().noneMatch(p->p==0));
    }
    private static void ilk5ElmTopla(List<Integer> list){
        // S16:  listenin ilk 5 elemanini topla?
        int sum = list.stream().limit(5).reduce(0,(top,p)->top+p);
        int sum1 = list.stream().limit(5).reduce(0, Integer::sum);
        System.out.println(sum);
        System.out.println();
    }
    private static void son5ElmListele(List<Integer> list){
        // S17: listenin son bes elemaninin  listele
        long l =list.size()-5; // kac eleman atlamak gerekir
        // skip girilen sayi kadar eleman atlar
        list.stream().skip(l).forEach(p-> System.out.print(p+" "));
    }





}
