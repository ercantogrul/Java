package day21_StaticKeyword.DE21_StaticKeyWord.Tasks.Task03__;

public class Lesson {
    String lessonName;
    int lessonCredit;

    public Lesson() {
    }

    public Lesson(String lessonName, int lessonCredit) {
        if (lessonCredit<1){
            lessonCredit=1;
            System.out.println("lessonCredit 1 den kücük olamaz, 1 olarak düzeltildi");
        }
        if (lessonCredit>10){
            lessonCredit=10;
            System.out.println("lessonCredit 10 den büyük olamaz, 10 olarak düzeltildi");
        }
        this.lessonName = lessonName;
        this.lessonCredit = lessonCredit;
    }

    @Override
    public String toString() {
        return "Lesson{" +
                "lessonName='" + lessonName + '\'' +
                ", lessonCredit=" + lessonCredit +
                '}';
    }
}
