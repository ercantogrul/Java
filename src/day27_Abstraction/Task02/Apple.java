package day27_Abstraction.Task02;

public class Apple extends Phone {
    @Override
    void options(String str1, String str2) {
        if (str1.equalsIgnoreCase("64 GB") && str2.equalsIgnoreCase("5.5")) {
            cart.add("$750");
        } else if (str1.equalsIgnoreCase("64 GB") && str2.equalsIgnoreCase("6.5")) {
            cart.add("$850");
        } else if (str1.equalsIgnoreCase("128 GB") && str2.equalsIgnoreCase("5.5")) {
            cart.add("$950");
        } else if (str1.equalsIgnoreCase("128 GB") && str2.equalsIgnoreCase("6.5")) {
            cart.add("$1200");
        }

    }


}
