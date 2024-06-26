package day36_InterviewQuestions.DE40InterviewQuestions.Day05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;

public class Q04_MapTask {
    // PART 1
    // create a map with groupName as key and groupMembers as value
    // "Group1" = ["Member1", "Member2"]
    // "Group2" = ["Member3", "Member4", "Member5"]


    // BÖLÜM 1
    // key olarak groupName ve value olarak groupMembers ile bir map oluşturun
    // "Grup1" = ["Üye1", "Üye2"]
    // "Grup2" = ["Üye3", "Üye4", "Üye5"]

    // PART 2
    // find how many members each group has

    // BÖLÜM 2
    // her grubun kaç üyesi olduğunu bul
    public static void main(String[] args) {
        HashMap<String,ArrayList<String>> grupVeUyeler = new HashMap<>();
        ArrayList<String> team1 = new ArrayList<>(Arrays.asList("Gamze", "Merve Nil", "Sumeyra", "Ramazan"));
        ArrayList<String> team2 = new ArrayList<>(Arrays.asList("Hakan", "Yunus Emre", "Gursoy", "Yakup"));
        grupVeUyeler.put("teamA",team1);
        grupVeUyeler.put("teamB",team2);
        System.out.println("Grup ve Uyeler = "+ grupVeUyeler);
        Collection<ArrayList<String>> values = grupVeUyeler.values();
        for (ArrayList<String> each:values) {
            System.out.println(each.size());
        }

    }



}
