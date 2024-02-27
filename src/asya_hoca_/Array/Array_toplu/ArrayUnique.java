package asya_hoca_.Array.Array_toplu;

public class ArrayUnique {
    public static void main(String[] args) {
        //String [] names={"ali","ayşe","john","ali","ayşe","john","asya"};
        //Verilen dizide unique karakteri bulun
        String[] names = {"ali", "ayşe", "john", "ali", "ayşe", "john", "asya","yusuf"};
        String uniqe = names[0];//ali
        int count;

        for (int j = 0; j < names.length; j++) {
            uniqe = names[j];           // sitring kelime
            count=0;
            for (int i = 0; i < names.length; i++) {
                if (uniqe.equals(names[i])) {
                    count++;
                }
            }
            if (count==1){
                System.out.println(uniqe+ " is unique");
            }

        }










    }
}
