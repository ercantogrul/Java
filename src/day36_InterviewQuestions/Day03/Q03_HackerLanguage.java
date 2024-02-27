package day36_InterviewQuestions.Day03;

public class Q03_HackerLanguage {

    // Kullanıcının yazdığı metni, 'hacker'ların konuşma diline çeviren bir method
// (method ismi hackerDili) yazınız. Hackerlar bazı harfleri sayılara çevirerek
// yazışabiliyorlar. Genellikle çevirdikleri harfler şu şekilde:
//    s -> 5
//    a -> 4
//    e -> 3
//    i -> 1
//    o -> 0
//    Test data
//    hackerDili("java ile hersey guzel")
//    j4v4 1l3 h3r53y guz3l
//    İpucu harfleri değiştirin ve ekrana yazdırın.(Array ve String Manipulation)
    public static void main(String[] args) {
        String str = "Java ile hersey güzel";

        birinciYol(str);

        String sonuc =hackerDili(str);
        System.out.println(sonuc);




    }

    private static String hackerDili(String str) {
        str=str.replaceAll("s","5");
        str=str.replaceAll("a","4");
        str=str.replaceAll("e","3");
        str=str.replaceAll("i","1");
        str=str.replaceAll("o","0");
        return str;
    }

    private static void birinciYol(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (str.substring(i,i+1).contains("s")){
                str=str.replace("s","5");
            } else if (str.substring(i,i+1).contains("a")) {
                str=str.replace("a","4");
            } else if (str.substring(i,i+1).contains("e")) {
                str=str.replace("e","3");
            } else if (str.substring(i,i+1).contains("i")) {
                str=str.replace("i","1");
            } else if (str.substring(i,i+1).contains("o")) {
                str=str.replace("o","0");
            }
        }System.out.println(str);

    }


}