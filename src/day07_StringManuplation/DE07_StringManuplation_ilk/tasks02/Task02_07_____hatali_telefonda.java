package day07_StringManuplation.DE07_StringManuplation_ilk.tasks02;

public class Task02_07_____hatali_telefonda {
    public static void main(String[] args) {
        // iki string veriliyor, birinci stringin 3. karekterini alın
        // bu karekter , ikinci stringde varsa oradan silin
        // input :  str1 = selamlar
        //          str2 = merhabalar
        // output   str2=  merhblr

        String str1 = "selamlar";  // 3. karakteri alin
        String str2 = "merhabalar";  // str4 yeni hali merhblr

        str2.replace(""+str1.charAt(3),"");
        System.out.println(str2);

        //== ikinci yol
        str2.replace(str1.substring(3,4),"");
        System.out.println(str2);



        /*

         */

        //Scanner scan = new Scanner(System.in);
       // System.out.println("bir veri giriniz: ");
       // String str1 = scan.nextLine();
       // System.out.println("bir veri giriniz: ");
       // String str2 = scan.nextLine();

       // if (str2.contains(str1.substring(3,4))) {
        //    str2 =str2.replace(""+str1.charAt(3),"");
       //     System.out.println(str2);
       // }else System.out.println("birinci stringin 3. karekteri,ikinci string'de yok");

      //=========================




        




    }
}
