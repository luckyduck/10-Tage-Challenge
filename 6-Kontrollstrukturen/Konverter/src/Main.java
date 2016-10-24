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

        // for - definierte Anzahl Wiederholungen
        //for (int i = 0; i < 5; i++) {
        //    System.out.println("i: " + i);
        //}

        // while - undefinierte Anzahl Wiederholungen
        boolean ende = false;

        while (ende != true) {
            String eingabe = Main.getInput();
            System.out.println(eingabe);

            // 5 < 5  => false
            // 5 <= 5 => true
            // 4 > 5
            // 5 >= 5

            // ungleich - !
            // 5 != 4
            // true != false

            if (eingabe.equals("beenden")) {
                ende = true;
            }

            System.out.println();
        }

        // ...
    }

    public static String getInput() {
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        System.out.print("Deine Eingabe? ");

        try {
            String input = bufferedReader.readLine();
            return input;

        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }
}
