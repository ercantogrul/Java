package day06_SwitchCase;

import java.util.Scanner;

public class s1 {
                public static void main(String[] args) {

                    Scanner scan =new Scanner(System.in);
                    System.out.println("bir ay ismi giriniz");
                    String ay = scan.next();

                    switch (ay) {
                    case "ocak" : System.out.println("otuzbir"); break;
                    case "subat" : System.out.println("oyirmi sekiz"); break;
                    case "mart" : System.out.println("otuzbir"); break;
                    case "nisan" : System.out.println("otuz"); break;
                    case "mayis" : System.out.println("otuzbir"); break;
                    case "haziran" : System.out.println("otuz"); break;
                    case "temmuz" : System.out.println("otuzbir"); break;
                    case "agustos" : System.out.println("otuzbir"); break;
                    case "eylül" : System.out.println("otuz"); break;
                    case "ekim" : System.out.println("otuzbir"); break;
                    case "kasim" : System.out.println("otuz"); break;
                    case "aralik" : System.out.println("otuzbir"); break;
                        default:
                            System.out.println("ay ismini yanlis girdiniz");

                    }

                      // int ile cözüm=======================
                    Scanner scanner =new Scanner(System.in);
                    System.out.println("kacinci ay");
                    int sayi = scanner.nextInt();


                    switch (sayi) {
                        case 1 : System.out.println(31); break;
                        case 2 : System.out.println(29); break;
                        case 3 : System.out.println(31); break;
                        case 4 : System.out.println(30); break;
                        case 5 : System.out.println(31); break;
                        case 6 : System.out.println(30); break;
                        case 7 : System.out.println(31); break;
                        case 8 : System.out.println(31); break;
                        case 9 : System.out.println(30); break;
                        case 10 : System.out.println(31); break;
                        case 11 : System.out.println(30); break;
                        case 12 : System.out.println(31); break;
                        default:
                            System.out.println("yanlis girdiniz");

                    }
                    // daha kisa yolu====================
                    switch (sayi) {
                        case 2 : System.out.println(29); break;
                        case 1 : case 3 : case 5 : case 7 :
                        case 8 : case 10 :
                        case 12 : System.out.println(31); break;
                        case 4 : case 6 : case 9 :
                        case 11 : System.out.println(30); break;
                        default:
                            System.out.println("yanlis girdiniz");

                    }



    }
}
