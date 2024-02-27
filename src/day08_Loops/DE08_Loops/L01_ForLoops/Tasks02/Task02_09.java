package day08_Loops.DE08_Loops.L01_ForLoops.Tasks02;

public class Task02_09 {
    public static void main(String[] args) {
        // Bir string veriliyor, for kullanarak her harf arasına bir boşluk gelecek  şekilde yazdırın
        // ama yazarken ilk harf büyük olsun ve sonrası bir küçük, bir büyük harf olarak devam etsin
        // str de boşluk olması dikkate alınmadı
        String str = "Selamlar";
        for (int i = 0; i <str.length() ; i++) {
            if (i%2==0) System.out.print(str.substring(i,i+1).toUpperCase()+" ");
            else System.out.print(str.substring(i,i+1).toLowerCase()+" ");

        }

    }
}
