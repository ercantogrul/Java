package z_calismalar.OCI_sinav._223.Q159___;

//public class q159 {}
class Book {
    int pages;



}
public class App {
    int count;
    public void method(Book x, int k) { // method a Book class indan x objesi --ve int k gönderildi(App k olsaydi bu da bir obje olurdu)
        //x objesi ile pages e ulasildi (x.pages)
        x.pages = 100; // x objesi x.pages denilerek-- objenin pages ne 100 degeri atandi. artik pages=100 oldu
        k= 200;      // burada count a atama yapilmadi. count= 200 denilseydi atama yapilirdi. burada k data türü int olan bir variable dir

        //public void method(Book x, App k) {
        //   x.pages = 100;
        //   k.count = 200;
        // }
        //asagidagi methodun parametreleri de  obj.method(objBook, obj); olsaydi --2 obje gonderilip

        //public void method(Book x, int k) {  // veya bu sekilde
        //   x.pages = 100;
        //   this.count = 200;
        // }


    }
    public static void main(String[] args) {
        App obj = new App();
        Book objBook = new Book();


        System.out.println(objBook.pages + ":" + obj.count);
        obj.method(objBook, obj.count); // method cagrildi ve bir tane obje (objBook) ve bir tane int (bu da "obj.count"  ile sifir degeri) gönderildi
        System.out.println(objBook.pages + ":" + obj.count);


    }
}
//	A. 0:0 100:0
//
//	B. null:0 100:0
//	C. 0:0 100:200
//	D. null:null 100:null


//A
