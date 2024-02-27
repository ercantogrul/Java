package day23_AccessModifier.DE23_AccessModifier;

public class Example {
    private int sayi_private;
    protected int sayi_protected;
    public int sayi_public;
    int sayi_default; // protected gibidir

    private void mPrivate(){
        System.out.println("private metot");

    }
    protected void mProtected(){
        System.out.println("protected metot");
    }
    public void mPublic(){
        System.out.println("public metot");
        sayi_private=4;
        sayi_protected=5;
        sayi_default=6;
        sayi_public=7;

    }
     void mDefault(){
        System.out.println("default metot");

    }


    @Override
    public String toString() {
        return "Example{" +
                "sayi_private=" + sayi_private +
                ", sayi_protected=" + sayi_protected +
                ", sayi_public=" + sayi_public +
                '}';
    }
}
