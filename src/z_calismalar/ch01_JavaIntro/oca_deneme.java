package z_calismalar.ch01_JavaIntro;

import z_calismalar.ch01_JavaIntro.HelloWorld;

import java.io.IOException;
import java.util.Arrays;

public class oca_deneme extends HelloWorld {

    public static void main(String[] args) {
        HelloWorld dd = (HelloWorld) new oca_deneme();
      //  oca_deneme tt = (oca_deneme) new Car();
//*************************************************************************************************************************

        // soru 6

//        class X{
//            public void printFileContent() throws IOException {
//                throw new IOException();
//            }
//        }
//
//       X xobj = new X();
//       xobj.printFileContent();

//*************************************************************************************************************************

        // soru 15
        System.out.println(" ******** 15.soru **********");

        StringBuilder sb1 = new StringBuilder("Duke");

        String str1 = sb1.toString();
        String str2 = str1;
        //  String str2 = sb1.toString(); // sonucu false döndürür

        System.out.println(str1 == str2); // true
        System.out.println("str1 = " + str1); // Duke

//*************************************************************************************************************************
//soru 50

        double y1 = 203.22;
        float fit1 = (float) y1;


        float fit2 = (float) 1_11.00;

        Float fit3 = 100.00f;

        int y2 = 100;
        float fit4 = (float) y2;

        float fit5 = 100.00F;





//*************************************************************************************************************************

// soru 53

        int num[][] = new int[1][3];
        System.out.println("Arrays.toString(num) = " + Arrays.deepToString(num));
        System.out.println("num.length = " + num.length);
        System.out.println("num[0].length = " + num[0].length);


//*************************************************************************************************************************

// soru 70
        int x = 10;
        int y = ++x;
        int z = 0;
        if (y >= 10 | y <= ++x) {
            z = x;
        } else {
            z = x++;
        }
        System.out.println("z = " + z);


//*************************************************************************************************************************

        System.out.println(" ******** 16.soru **********");


        float var1 = (12_345.01 <= 123_45.00) ? 12_456 : 124_56.02f;
        float var2 = var1 + 1024;
        System.out.println("var2 = " + var2); // 13480.02


//*************************************************************************************************************************
// soru 78
        String str01 ="Java";
        String [] str02 ={"J","a","v","a"};
        String str03 = "";
        for(String str : str02){
            str03=str03+str;
        }
        System.out.println("str03 = " + str03);
        System.out.println("str01 = " + str01);
        boolean b1 = (str01.equals(str03));
        boolean b2 = (str01==str03);
        System.out.print(b1+", " + b2);




//*************************************************************************************************************************
// soru 81

     float flt1 = 100.00F;
     float flt2 = (float) 1_11.00;
   //  Float flt3 = 100.00;
    // double y11 = 203.22;float flt4 = y11;
     int y22 = 100;float flt5 = (float) y22 ;




//*************************************************************************************************************************
        //soru 84

        int array[] = new int[] {1,2,3};



//*************************************************************************************************************************



//*************************************************************************************************************************





//*************************************************************************************************************************



    }
}
