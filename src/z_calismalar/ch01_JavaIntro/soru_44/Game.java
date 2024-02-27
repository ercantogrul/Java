package z_calismalar.ch01_JavaIntro.soru_44;

public class Game {
    public static void menu(){
        System.out.println("1.Left 2. Right 0. Stop");
    }

    public static void main(String[] args) {
        int option;
        for (option =0; option !=0; option =0){
            System.out.println("ggg");
        }

        while(option !=0){
            menu();
            option =0;
            System.out.println("fff");
        }

        do{
            menu();
            option =0;
            System.out.println("rrrr");

        }while(option !=0);
    }
}
