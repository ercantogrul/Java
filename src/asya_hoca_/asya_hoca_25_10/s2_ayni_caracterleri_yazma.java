package asya_hoca_.asya_hoca_25_10;

public class s2_ayni_caracterleri_yazma {
    public static void main(String[] args) {

        //Remove duplicate character from String

        String str="Asya Cool School";
        String yeniM ="";

        for (int i = 0; i < str.length(); i++) {
            String harf = str.substring(i,i+1);  // veya  String c =str.charAt(i)+"";

            if (!yeniM.contains(harf)){   //if (!yeniM.toLowerCase().contains(c))
                yeniM=yeniM+harf;
            }
        }
        System.out.println(yeniM);   //Asya ColSch

        //=====================================
        System.out.println("====ikinci yöntem===============");
        str = str+" ";
        int n = str.length();
        String yStr = "";
        for (int i = 0; i < n; i++) {
            if(!yStr.contains(str.substring(i,i+1))){
                yStr=yStr+str.substring(i,i+1);

            }

        }
        System.out.print(yStr);   //Asya ColSch





    }
}
