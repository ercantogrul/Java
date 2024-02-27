package z_calismalar.OCI_sinav._223.Q021_constr___;

class Vehicle {
	Vehicle(){
		System.out.println("Vehicle");
	}
}
class Bus extends Vehicle{
	//burada extends Vehicle oldugu icin; olmasada gizli bir super() vardir. dolayisiyla extends edilen class daki constructor a gider orayi yazar sonra asagiyi yazar
	//**** super() extends edilen classin parametresiz constructoru cagirir. *** super() en üstte olmak zorunda
	//**** this() kendi class inda parametresiz constructoru cagirir. *** this() en üstte olmak zorunda.
	// yani super() varsa sonra this() gelemez veya this() varsa sonra super() gelemez
	// Ayrica;
	//Bus classin da String bus= "Bus"; String vehicle = "vehicle bus"; instance variableleri olsaydi;
	//ve Vehicle class da da String vehicle = "vehicle"; instance variableleri olsaydi;
	//**** bir variable icin; _this.bus_ veya _this.vehicle_ veya _super.vehicle_ sira farki olmaksizin cagrilabilinir yazdirilabilinir.
	Bus(){
		System.out.println("Bus");
	}
}
public class Transport {
	public static void main(String[] args) {

		Vehicle v = new Bus();
	  //Bus v = new Bus(); //yukarda ile aynidir //yani Bus dan olusturdugumuz obj ye referans olarak da Bus alsaydik sonuc degismez extends oldugu
		                            // icin iki class daki methodlarada ulasabilirdik

		//ama Vehicle v = new Vehicle(); //olsaydi sadece Vehicle daki methoda ulasirdi

		//AMA METHOD VEYA INSTANCE VARIABLE CAGRILIRKEN ÖNCE REFERANS VERILEN CLASS A GIDILIR  (yani Vehicle v = new Bus();burada önce __Vehicle__ a gidilir)
		// 1. orada yoksa parent varsa oraya bakilir orada da yoksa CTE verir
		//2. a)Variable: eger class veya parent da varsa ilik görüldügü yerdeki deger alinir
		//2. a)method: eger class veya parent da varsa sonra constructor a kadar child classlar control edilerek inilir en son görüldügü yerdeki deger alinir.



	}
}
//What is the result?
//A.	Vehicle 
//		Bus
//B.	Bus
//		Vehicle
//C.	Bus
//D.	The program doesn’t print anything
