/**
 * (c) codingtutor.de
 * --
 * Jan Brinkmann
 */

public class Main {
    public static void main(String[] args) {

        Main.sagHallo("Jan", "?");

        String meineBegruessung = Main.getGreeting("Peter");
        System.out.println(meineBegruessung);
    }

    public static void sagHallo(String name, String zeichen) {
        System.out.println("Hallo " + name + zeichen);
    }

    public static String getGreeting(String name) {
        String greeting = "Hallo " + name;

        return greeting;
    }

}
