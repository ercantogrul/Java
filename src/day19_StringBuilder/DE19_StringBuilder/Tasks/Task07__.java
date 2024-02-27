package day19_StringBuilder.DE19_StringBuilder.Tasks;

public class Task07__ {
    public static void main(String[] args) {
        StringBuilder sb1=new StringBuilder();
        String str = "dfhjklj4678,4,31"; // değişebilir örnektir
        sb1.append(str);
        // sb1 deki tüm rakamları, en az 2 ayrı yöntem ile siliniz

        //===1 yol==============
        System.out.println(sb1.toString().replaceAll("\\d",""));

        //======2.yol=================


    }
}
