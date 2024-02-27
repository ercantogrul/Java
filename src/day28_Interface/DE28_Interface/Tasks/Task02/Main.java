package day28_Interface.DE28_Interface.Tasks.Task02;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        TeslaCar_electric tesla = new TeslaCar_electric();
        tesla.changeBattery();
        ToyotaPrlus_hybrid toyota = new ToyotaPrlus_hybrid();
        toyota.changeOil();
        Bus_deisel bus = new Bus_deisel();
        bus.changeDeisel();

        ArrayList<String> list = new ArrayList<>();
        list.add(bus.changeDeisel());


        System.out.println(list);
    }
}
