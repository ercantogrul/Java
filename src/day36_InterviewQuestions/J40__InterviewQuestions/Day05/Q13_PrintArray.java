package day36_InterviewQuestions.J40__InterviewQuestions.Day05;

public class Q13_PrintArray {
    // Create a method which takes String array as a parameter
    // and prints all the element
    public static void main(String[] args) {
        String [] arabalar = {"Honda", "Toyota", "Porsche", "Tesla", "BMW"};
        String [] renkler = {"Mavi", "Kirmizi", "Mor", "Kahverengi", "Sari","Turuncu", "Yesil"};
        printElements(arabalar);
        printElements(renkler);

    }
    public static void printElements(String[] arr){

        for (String each:arr) {
            System.out.print(each+" ");
        }
        System.out.println();
    }


}
