package asya_hoca_.asya_hoca_23_11_202;

public class C03_POLINDROME_array_string {
    public static void main(String[] args) {
        //Aşağıdaki listede polindrome olan kelimeri yazdırın.For Each Loop kullanarak
        String[] words = {"asa", "level", "java", "küçük", "kaza", "kazak", "yapay"};

        for (String eleman : words) {
            String[] str = eleman.split("");
            String karsilastirma = "";
            for (int j = str.length - 1; j >= 0; j--) {
                karsilastirma += str[j];
            }
            if (eleman.equals(karsilastirma)) System.out.println("polindrome : "+eleman);

            //===============================================
            String[] wordss = {"asa", "level", "java", "küçük","kaza", "kazak", "yapay"};

            for (String each : wordss) {//asa
                String reverse = "";
                for (int i = each.length() - 1; i >= 0; i--) {
                    reverse = reverse + each.charAt(i);
                }
                if (reverse.equalsIgnoreCase(each)) {
                    System.out.println(each);
                }
            }

        }
    }
}