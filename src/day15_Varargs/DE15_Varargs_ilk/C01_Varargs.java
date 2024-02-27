package day15_Varargs.DE15_Varargs_ilk;

public class C01_Varargs {
    public static void main(String[] args) {
/*
        VARARGS :
        var----variety cesitlilik args---arguments
        SYNTAX ->
        mathodName(parametre1,parametre2, dataType... dataName) {
        method body....

        }

	        1) Method parametre parantezi icinde birden çok parametre varsa, varargs daima en sona tanımlanmalıdır .CISSS -> Diva en son sahne alır
		    2) Method parametre parantezi icinde 1'den fazla varargs ifade TANIM-LA-NA-MAZZZ :CISS -> diva tek olur.iki diva bir ipte yurumez

           Gunun TRICK'i  köşesinde böyün :
           Method'da  argument sayisi sabitse standart normal  method tanımlanmalı..
           ancak argument sayisi belirli değilse  VARARGS ifade tercih edilmeli...

  */

        int sayi1 = 46;
        int sayi2 = 27;
        int sayi3 = 58;
        int sayi4 = 34;

        stringeCevir("H","a","s","a","n");
        /* String varargs paremesi olan bir metot yazın, bu strinlerin uzunları toplamını return edip
        main de yazdırın
        */

        //

    }//main sonu

    private static void stringeCevir(String...harfler) {
        String str="";
        for (String eleman:harfler){
            str = str + eleman;
        }
        System.out.println(str);
    }


}//class sonu
