import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * (c) codingtutor.de
 * --
 * Jan Brinkmann
 */

public class Main {
    public static void main(String[] args) {

        // while - undefinierte Anzahl Wiederholungen
        boolean ende = false;

        while (ende != true) {
            String aktion = Main.getInput("Deine Eingabe");

            if (aktion.equals("beenden")) {
                ende = true;

            } else if (aktion.equals("kilometer")) {
                Main.kilometerAction();

            } else if (aktion.equals("meilen")) {
                Main.meilenAction();

            } else {
                System.out.println("Unbekannte Aktion: " + aktion);
            }

            System.out.println();
        }
    }

    public static void kilometerAction()
    {
        try {
            String input = Main.getInput("Kilometer?");
            double kilometer = Double.parseDouble(input); // 12.23, nein

            // division: /
            // multiplikation: *
            // addieren / subtrahieren: + / -
            double meilen = kilometer * 1.6;
            System.out.println("Meilen: " + meilen);

        } catch (Exception e) {
            System.out.println("Fehler: falsches Format");
        }
    }

    public static void meilenAction()
    {
        try {
            String input = Main.getInput("Meilen?");
            double meilen = Double.parseDouble(input); // 12.23, nein

            double kilometer = meilen / 1.6;
            System.out.println("Kilometer: " + kilometer);

        } catch (Exception e) {
            System.out.println("Fehler: falsches Format");
        }
    }

    public static String getInput(String question) {
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        System.out.print(question + ": ");

        try {
            String input = bufferedReader.readLine();
            return input;

        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }
}
