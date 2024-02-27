package day32_Enum.Deneme1;


import java.awt.*;

public class Customer {
    private int id;
    private String name;
    private String city;
    private Color favoriteColor;

    public Customer() {
    }

    public Customer(int id, String name, String city, Color favoriteColor) {
        this.id = id;
        this.name = name;
        this.city = city;
        this.favoriteColor = favoriteColor;
    }

    public Customer(int id, String ali, String ankara, App.Color color) {

    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Color getFavoriteColor() {
        return favoriteColor;
    }

    public void setFavoriteColor(Color favoriteColor) {
        this.favoriteColor = favoriteColor;
    }
}
