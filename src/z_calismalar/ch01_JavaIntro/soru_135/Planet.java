package z_calismalar.ch01_JavaIntro.soru_135;

import java.util.Arrays;

public class Planet {
    public String name;
    public int moons;
    public Planet(String name, int moons) {
        this.name = name;
        this.moons = moons;


    }

    public static void main(String[] args) {
        Planet [] planets ={new Planet("Mercury",0),
        new Planet("Venus",0),
        new Planet("Earth",1),
        new Planet("Mars",2)};

        System.out.println("planets = " + planets);
        System.out.println("Arrays.toString(planets) = " + Arrays.toString(planets));
        System.out.println("planets[2].name = " + planets[2].name);
        System.out.println("planets[2].moons = " + planets[2].moons);
    }
}
