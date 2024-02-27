package day18_ImmutableAndPassBy__.mutable_unmutable;

import java.util.ArrayList;

public class C04_ {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        System.out.println("dizi ref= "+System.identityHashCode(list));
        list.clear(); // Referansı değiştirmez
        System.out.println("dizi ref= "+System.identityHashCode(list));
        list = new ArrayList<>(); // referansı değiştirir
        System.out.println("dizi ref= "+System.identityHashCode(list));

    }
}
