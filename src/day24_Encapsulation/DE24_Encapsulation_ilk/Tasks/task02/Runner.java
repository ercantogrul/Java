package day24_Encapsulation.DE24_Encapsulation_ilk.Tasks.task02;


class Runner {
    public static void main(String[] args) {
        Student ogr = new Student("Haluk",50);
        System.out.println(ogr);
        // veya ( ustteki daha iyi)
        Student ogr2 = new Student();
        ogr2.setIsim("Hasan");
        ogr2.setYas(33);
        System.out.println(ogr2);

    }
}
