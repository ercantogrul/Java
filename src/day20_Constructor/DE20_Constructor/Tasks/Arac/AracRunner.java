package day20_Constructor.DE20_Constructor.Tasks.Arac;

import java.util.ArrayList;
import java.util.Scanner;

public class AracRunner {
    /*
    field ları , marka,model,yas,km,fiyatı den olucan bir arac clası olustur
    sonra
    bir array liste bu arac class verilerinden cok sayıda ekleyin(en az 10 veri olsun)
    bu veriler , ikinic el arac satan bir galeriye aittir,
    gelen müşteriye istediği özllikleri sorsun ve bu özelliklere göre eldeki
    araçları listelesin

     */
    public static void main(String[] args) {
        ArrayList<Arac> aracList = new ArrayList<>();
        Arac arac;
        arac = new Arac("Tojota",   "Corolla",2012,72000, 460000 ); aracList.add(arac);
        arac = new Arac("Opel",     "Astra",  2006,170000,6500 );   aracList.add(arac);
        arac = new Arac("Citroen",  "C3",     2015,150000,1350 );   aracList.add(arac);
        arac = new Arac("Tojota",   "Verso",  2006,272000,3500 );   aracList.add(arac);
        arac = new Arac("Honda",    "Civic",  2009,180000,4900 );   aracList.add(arac);
        arac = new Arac("Honda",    "Insight",2009,220000,5600 );   aracList.add(arac);
        arac = new Arac("Mercedes", "B2000",  2008,180000,5200 );   aracList.add(arac);
        arac = new Arac("Volvo",    "S60",    2015,258000,9750 );   aracList.add(arac);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Marka yı giriniz : "); String marka = scanner.next();
        System.out.print("Model i  giriniz : "); String model = scanner.next();
        System.out.print("Min Model yaşı ? : "); int yas      = scanner.nextInt();
        System.out.print("Max araç KM si ? : "); int km       = scanner.nextInt();
        System.out.print("Max fiat       ? : "); int fiat     = scanner.nextInt();
        System.out.println();
        if (model.substring(0,1).equals("*")) model="";
        if (marka.substring(0,1).equals("*")) marka="";

        for (int i = 0; i < aracList.size() ; i++) {
            arac = aracList.get(i);
            if (arac.marka.contains(marka) && arac.model.contains(model) && arac.yas>=yas &&
            arac.km<=km && arac.fiyat<=fiat) {
                System.out.println(arac);
            }
        }

    }
}
