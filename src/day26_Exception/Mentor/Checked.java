package day26_Exception.Mentor;

public class Checked {
    public static void main(String[] args) {
        System.out.println("Test 1 başlasın");

        for (int i = 0; i < 3; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.print("\rsn: "+i);
        }

        System.out.println("Test tamamlanadı");
    }
}
