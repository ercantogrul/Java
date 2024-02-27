package day33_ProjeTanimi.Proje_1;

import java.io.IOException;
import java.util.ArrayList;

public interface Interfile {

    void dosyayaYaz(ArrayList<Adres> liste);
    ArrayList<Adres> dosyadanOku();

}
