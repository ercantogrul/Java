package day32_Enum.DE32_Enum.enum2;

public class User {
    private String name;
    private Role yetki;
    private Status durum;

    public User(String name, Role yetki, Status durum) {
        this.name = name;
        this.yetki = yetki;
        this.durum = durum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Role getYetki() {
        return yetki;
    }

    public void setYetki(Role yetki) {
        this.yetki = yetki;
    }

    public Status getDurum() {
        return durum;
    }

    public void setDurum(Status durum) {
        this.durum = durum;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", yetki=" + yetki +
                ", durum=" + durum +
                '}';
    }
}
