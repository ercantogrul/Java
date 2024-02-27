package asya_hoca_.asya_hoca_25_10;

public class s3_uniq {
    public static void main(String[] args) {
        //Find unique char
        // String str = "aaabbbcccZd";

        String str="aaabbbcccZd";
        String uniq ="";

        for (int i = 0; i < str.length(); i++) {

            char c =str.charAt(i);
            if(str.indexOf(c)==str.lastIndexOf(c)) {
                uniq=uniq+c;
            }
        }
        System.out.println(uniq);

//============================================================================================

        System.out.println("ikinci yöntem===============");
        for (int i = 0; i < str.length(); i++) {
            String c =str.charAt(i)+"";
            int u = str.replace("i","").length();
            if ((u-str.length())==1){
                uniq=uniq+i;
            }
        }
        System.out.println(uniq);











    }
}
