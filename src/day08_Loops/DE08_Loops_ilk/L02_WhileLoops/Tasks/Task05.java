package day08_Loops.DE08_Loops_ilk.L02_WhileLoops.Tasks;

import java.util.Scanner;

public class Task05 {

	public static void main(String[] args) {
/*
		task-> girilen  isim ve soyismi için ilk isminin ilk harfinden
		soy isminin son harfine kadar olan butun harfleri
		ayni satirda aralarina bosluk birakarak print rden code create ediniz
		Örnek : isim = ali kale
		cıktı : A B C D E
		 */
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter your name:");
		String name=scanner.nextLine().toUpperCase();//ASYA COOL

		char first=name.charAt(0);//A
		char last=name.charAt(name.length()-1);//L

		while (first<=last){//A<L
			System.out.print(first+",");//A ,B ,C....L
			first++;

		}

		if (first>last){ //Yasin Ala  //Y X T o...A

			while (first>=last){
				System.out.print(first+",");
				first--;// Y V...
			}

		}
	}
































}

