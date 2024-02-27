package asya_hoca_.Array;

import java.util.ArrayList;
import java.util.Arrays;

public class S16 {
    public static void main(String[] args) {
        /*
        /İki array'i birleştirme
        //{{Ebru AL},{
        String[] name={"Ebru","Nuray","Beyza","Asya"};
        String[]lastName={"al","gala","kal"};
output:
[Ebru AL, Nuray GALA, Beyza KAL, Asya NULL]
         */
        String[] name = {"Ebru", "Nuray", "Beyza", "Asya"};
        String[] lastName = {"al", "gala", "kal"};


        cozum1(name,lastName);
        cozum2(name,lastName);
        cozum3(name,lastName);



    }

    private static void cozum3(String[] name, String[] lastName) {

        int boyut = Math.max(name.length, lastName.length);
        lastName=Arrays.copyOf(lastName,boyut);

        String[] adSoyad = new String[boyut]; // yeni sitring dizisi tanimladik boyut büyüklügünde
        for (int i = 0; i < adSoyad.length; i++) {
            if (lastName[i] == null) {
                lastName[i] = "NULL";
            }
            adSoyad[i] = name[i] + " " + lastName[i].toUpperCase();
            System.out.println(Arrays.toString(adSoyad));
        }
    }

    private static void cozum2(String[] name, String[] lastName) {
        System.out.println(Arrays.toString(lastName));

        for (int i = 0; i < name.length; i++) {//satır
            if(name.length>lastName.length){
                lastName=Arrays.copyOf(lastName,name.length);
            }
            if(lastName[i]==null){
                lastName[i]="NULL";
            }

            name[i]=name[i]+" "+lastName[i].toUpperCase();
        }
        System.out.println(Arrays.deepToString(name));
    }

    private static void cozum1(String[] name, String[] lastName) {

        lastName = Arrays.copyOf(lastName, 4); // lastname eleman sayisi 4 e cikarildi

        String[] newArr = new String[4];

        for (int i = 0; i < name.length; i++) {
            if (lastName[i] == null) {
                lastName[i] = "Null";
            }
            newArr[i] = name[i] + " " + lastName[i].toUpperCase() + " ";
        }
        System.out.println(Arrays.toString(newArr));
    }


}
