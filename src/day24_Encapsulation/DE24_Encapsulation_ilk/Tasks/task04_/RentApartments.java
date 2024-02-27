package day24_Encapsulation.DE24_Encapsulation_ilk.Tasks.task04_;

public class RentApartments {
    private String name;
    private int roomCount;
    private boolean balconyOrNo;
    public RentApartments() {
    }
    public RentApartments(String name, int roomCount, boolean balconyOrNo) {
        this.name = name;
        this.roomCount = roomCount;
        this.balconyOrNo = balconyOrNo;
    }
    @Override
    public String toString() {
        String balkon ="yok";
        return "Isim        =" +name+
                "\nOda sayisi  =" + roomCount +
                "\nbalkon      =" + balkon +
                "\nkira tutari =" +kiraHesapla();
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getRoomCount() {
        return roomCount;
    }
    public void setRoomCount(int roomCount) {
        this.roomCount = roomCount;
    }
    public boolean isBalconyOrNo() {
        return balconyOrNo;
    }
    public void setBalconyOrNo(boolean balconyOrNo) {
        this.balconyOrNo = balconyOrNo;
    }

    public int kiraHesapla(){
        int rent;
        switch (roomCount) {
            case 0: rent = 1400;break;
            case 1: rent = 1700;break;
            case 2: rent = 2200;break;
            case 3: rent = 2700;break;
            default:rent=2700;


        }
        if (balconyOrNo) rent+=200;

        return rent;

    }
}
