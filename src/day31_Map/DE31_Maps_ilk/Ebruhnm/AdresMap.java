package day31_Map.DE31_Maps_ilk.Ebruhnm;

public class AdresMap {
    private String mahalle;
    private String cadde;
    private  int id;

    public AdresMap(String mahalle, String cadde, int id) {
        this.mahalle = mahalle;
        this.cadde = cadde;
        this.id = id;
    }

    public AdresMap() {
    }

    @Override
    public String toString() {
        return "AdresMap{" +
                "mahalle='" + mahalle + '\'' +
                ", cadde='" + cadde + '\'' +
                ", id=" + id +
                '}';
    }

    public String getMahalle() {
        return mahalle;
    }

    public void setMahalle(String mahalle) {
        this.mahalle = mahalle;
    }

    public String getCadde() {
        return cadde;
    }

    public void setCadde(String cadde) {
        this.cadde = cadde;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
