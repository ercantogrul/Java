package day07_StringManuplation.DE07_StringManuplation_ilk.tasks02;

import java.util.Scanner;

public class Task02_01 {
    public static void main(String[] args) {
        // verilen stringin 3. karekteri varsa silin

        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();

        if (str.length()>=4){
            String ilkParca = str.substring(0,3);
            String sonParca = str.substring(4);
            str = ilkParca + sonParca;
            System.out.println("str : "+str);

        }else System.out.println("3. karakter yoktur");
        //
        //str.substring( int beginindeks                String)--- verilen index ten sonuna kadar
        //str.substring( int beginindeks endindeks               String)--- verilen index ten ikinci verilen index e kadar son index dahil degil




    }
}
