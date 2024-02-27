package day19_StringBuilder;

public class C01_StringBuilder {
    public static void main(String[] args) {

        StringBuilder str = new StringBuilder();  // tanim String str1;
        StringBuilder str1 = new StringBuilder();  // tanim String str1;
        StringBuilder str2 = new StringBuilder("Hasan");   // String str2 ="hasan";

        //ekleme append methodu  ile yapilir
        str2.append(11);
        str2.append("Mehmet"+"Ali ").append(15);
        System.out.println(str2);  //Hasan11MehmetAli 15

        //======!DIKKAT====ÖNEMLI BIR KONU ESITLEME ===============================================================
        str= str2;  // esitleme yapilinca referanslari esitlenmis olur
        // daha sonra str2 de yapilacak tüm degisiklikler str1 de de otomatik olusur
        System.out.println(str); //Hasan11MehmetAli 15
        str2.append("--------");
        System.out.println(str);  //Hasan11MehmetAli 15--------
        System.out.println(str2); //Hasan11MehmetAli 15--------



        //===============BIR STRINGBUILDER E BASKA STRINGBUILDER EKLEME APPEND================================
        str1.append(str2);  // append yapilirsa esitleme yapilmis sayilmaz
        // dolayisiyla daha sonra str2 de yapilacak degisiklikler str1 e ATANMAZ
        System.out.println(str1); //Hasan11MehmetAli 15--------
        str2.append("***");
        System.out.println(str1); //Hasan11MehmetAli 15--------
        System.out.println(str2); //Hasan11MehmetAli 15--------***







    }
}
