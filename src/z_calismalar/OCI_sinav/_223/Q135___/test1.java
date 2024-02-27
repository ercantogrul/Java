package z_calismalar.OCI_sinav._223.Q135___;

import java.util.Arrays;

public class test1 {
    public String name;
    public int moons;
    public test1(String name, int moons) {
        this.name = name;
        this.moons = moons;
    }

    @Override
    public String toString() {
        return "test1{" +
                "name='" + name + '\'' +
                ", moons=" + moons +
                '}';
    }

    public static void main(String[] args) {
        test1[] test1 = {
                new test1("Mercury", 0),
                new test1("Venus", 0),
                new test1("Earth", 1),
                new test1("Mars", 2),

        };

        System.out.println(Arrays.toString(test1));
        // toString methodunu olustururp System.out.println(Arrays.toString(planets)); yaparsak yazdirir
       //  [test1{name='Mercury', moons=0}, test1{name='Venus', moons=0}, test1{name='Earth', moons=1}, test1{name='Mars', moons=2}]

        System.out.println(test1[2].name);
        System.out.println(test1[2].moons);

    }
}
