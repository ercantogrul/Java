package day12_Arrays.DE12_Arrays_ilk.Tasks;

public class Task11_dolar_euro {
    public static void main(String[] args) {
        /*
		 TASK :
		 $ ve  £  isareti olanlarin toplamlarini ayri ayri bulup print eden code create ediniz.
        String str = "$1 $23 $134 $2 $7 $24 £32 £40 £2 £65 £4 ";
        */
        String str = "$1 $23 $134 $2 $7 $24 £32 £40 £2 £65 £4 ";
        String[] array = str.split(" ");

        dolarEurotopla(str); // string

        dolarEuroTopla(array);  //


    }

    private static void dolarEuroTopla(String[] array) {
        int dolar = 0;
        int euro = 0;

        for (int i = 0; i < array.length; i++) {
            String ilkKarakter = array[i].substring(0, 1);
            String sonrasi = array[i].substring(1);
            if (ilkKarakter.equalsIgnoreCase("$")) dolar += Integer.parseInt(sonrasi);
            else euro += Integer.parseInt(sonrasi);
        }
        System.out.println("dolar: " + dolar);
        System.out.println("euro: " + euro);

    }

    private static void dolarEurotopla(String str) {
        str = str.trim();
        str = str + " ";
        int dolar = 0;
        int euro = 0;

        for (int i = 0; i < str.length(); i++) {
            int boslukIdx = str.indexOf(" ");
            if (boslukIdx < 0) break;
            String kelime = str.substring(0, boslukIdx);
            if (kelime.startsWith("$"))
                dolar += Integer.parseInt(kelime.substring(1));
            else euro += Integer.parseInt(kelime.substring(1));
            str = str.substring(boslukIdx + 1);
            i = 0;
        }
        System.out.println("dolar :" + dolar);
        System.out.println("euro :" + euro);

    }
}

