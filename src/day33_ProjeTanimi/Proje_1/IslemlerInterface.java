package day33_ProjeTanimi.Proje_1;

import java.io.IOException;

public interface IslemlerInterface {
    Adres veriEkle() throws IOException;
    void veriSil() throws IOException;
    void veriDegistir() throws IOException;
    void veriListele()throws IOException;;
}
