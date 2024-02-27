package day26_Exception.Mentor;

public class MultiTry {

    public static void main(String[] args) {
        String s=null;
        int x=12;
        int y=0;

        try{

            System.out.println("s.length() = " + s.length()); // once bu kod okundugundan NullPointerException hatasindan sonra catch bloguna gidecek
            //dolayisiyla System.out.println("x/y : "+x/y); bunu okumayacak
            System.out.println("x/y : "+x/y);

        }catch (NullPointerException e){
            System.out.println("Null pointer hata yakalandı");
            e.printStackTrace();
            e.getMessage();
        }
        catch (ArithmeticException e){
            System.out.println("Aritmetic hata yakalandı");

          //  System.exit(0);
        }
        finally {
            System.out.println("finally bloğu her zaman çalışır");
        }



    }
}
