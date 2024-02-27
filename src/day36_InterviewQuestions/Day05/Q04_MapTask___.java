package day36_InterviewQuestions.Day05;

import java.util.*;

public class Q04_MapTask___ {
    // PART 1
    // create a map with groupName as key and groupMembers as value
    // "Group1" = ["Member1", "Member2"]
    // "Group2" = ["Member3", "Member4", "Member5"]


    // BÖLÜM 1
    // anahtar olarak groupName ve değer olarak groupMembers ile bir map oluşturun
    // "Grup1" = ["Üye1", "Üye2"]
    // "Grup2" = ["Üye3", "Üye4", "Üye5"]

    // PART 2
    // find how many members each group has

    // BÖLÜM 2
    // her grubun kaç üyesi olduğunu bul
    public static void main(String[] args) {
        HashMap<String,ArrayList<String>> grupveUyeler = new HashMap<>();
        ArrayList<String> team1 = new ArrayList<>(Arrays.asList("Gamze","Merve Nil","Hadise"));
        ArrayList<String> team2 = new ArrayList<>(Arrays.asList("Hakan","Yunus Emre","Bahadir"));
        
        grupveUyeler.put("teamA",team1);
        grupveUyeler.put("teamB",team2);
        System.out.println("Grup ve Üyeler = "+grupveUyeler);
        Collection <ArrayList<String>> values = grupveUyeler.values();
        for (ArrayList<String> each :values){
            System.out.println(each.size());
        }
        


    }



}
