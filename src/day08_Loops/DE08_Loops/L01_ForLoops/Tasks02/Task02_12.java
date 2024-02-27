package day08_Loops.DE08_Loops.L01_ForLoops.Tasks02;

public class Task02_12 {
    public static void main(String[] args) {
        // Bir text veriliyor, kaç adet kelimenin ilk harfi ile son harfi aynıdır
        // Ör :     input : "Ağa hasan, ece ile ali ye aba hediye etti"
        //          output: 3
        String str ="Ağa nasan, ece ile ali ye aba hediye etti";
        String yStr=str.trim().replace(",","")+" ";
        int counter = 0;
        for (int i = 0; i <yStr.length() ; i++) {
            char ch = yStr.charAt(i);
            if (ch==' ') { // boşluuğu yakaladık
                String kelime = yStr.substring(0,i); // boşluğa kadar olanı kelime aldık
                yStr = yStr.substring(i+1); // boşluk ve önecesi sildik
          //      System.out.println("-" + kelime+"-  "+yStr);
                i=0;// yStr nin ilk kelimesini 2 satır yukarıda sildik, dolayısı ile
                // konrtol etmeye baştan başlamamız lazım, bu nedenle i=0 yaptık.
                if (kelime.substring(0,1).equalsIgnoreCase(kelime.substring(kelime.length()-1)))
                    counter++; // kalimenin başı sonu aynı ise counteri 1 arttırdık
            }
        }
        System.out.println("counter = " + counter);

    }
}
