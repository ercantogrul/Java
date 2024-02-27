package day08_Loops.DE08_Loops_ilk.L02_WhileLoops.Tasks;

public class Task04 {

	public static void main(String[] args) {
		/*
		task->  3 basamakli 4 ve 6 ya tam bolunebilen tam sayilari buyukten kucuge ve kaç tane oldugunu print eden code create ediniz.
		 */
		int counter =0;
		for (int j = 999; j >100 ; j--) {
			if ((j%4==0 && j%6==0)){
				counter++;
				System.out.print(j+" ");
			}
		}
		System.out.println();
		System.out.println("kac adet sayi : "+counter);



		//===========================
		int j =999;
		int counter1=0;
		while (j>99){
			if (j%4 == 0 && j%6 == 0){
				counter1++;
				System.out.print(j+" ");
			}
			j--;
		}System.out.println();
		System.out.println("kac adet sayi : "+counter1);







	}

}
