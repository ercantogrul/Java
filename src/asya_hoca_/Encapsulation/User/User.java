package asya_hoca_.Encapsulation.User;

public class User {
    String ad;
    private  int id=001;
    int age;

    public User() {
    }

    public User(String ad, int id, int age) {
        this.ad = ad;
        setId(id);  // bununla constructor ile veri alirken bunu yapmak gerekir
        //User obj2 = new User("ali",234,12);
        //System.out.println(obj2); //ali 10 12
        //this.id=id;

        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "ad='" + ad + '\'' +
                ", id=" + id +
                ", age=" + age +
                '}';
    }
    public  int getir (){
        return id;
    }
    public void setId(int id){
        if (id<0) {
            this.id =0;
        } else if (id>10) {
            this.id=10;
        }else this.id=id;

    }
}
// kisinin yasi 18 den kücük 120 den büyük olamaz
