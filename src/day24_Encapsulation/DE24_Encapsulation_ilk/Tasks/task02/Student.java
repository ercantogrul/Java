package day24_Encapsulation.DE24_Encapsulation_ilk.Tasks.task02;

class Student {
    private String isim;
    private int yas;

    public Student() {
    }

    public Student(String isim, int yas) {
        this.isim = isim;
        this.yas = yas;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }
//    output
//        "Student name is Haluk"
//                "He is 48 years old"
    @Override
    public String toString() {
        return "Student name is " + isim +
                "\nHe/She is " + yas +" years old";
    }
}
