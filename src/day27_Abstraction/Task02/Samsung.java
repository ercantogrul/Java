package day27_Abstraction.Task02;

public class Samsung extends Phone{
    @Override
    void options(String str1, String str2) {
        if (str1.equalsIgnoreCase("256 GB")&&str2.equalsIgnoreCase("5.5")){
            cart.add("$1000");
        } else if (str1.equalsIgnoreCase("256 GB")&&str2.equalsIgnoreCase("7.5")) {
            cart.add("$1200");
        } else if (str1.equalsIgnoreCase("512 GB")&&str2.equalsIgnoreCase("5.5")) {
            cart.add("$1300");
        } else if (str1.equalsIgnoreCase("64 GB")&&str2.equalsIgnoreCase("6.5")) {
            cart.add("$1400");
        }
    }


}
