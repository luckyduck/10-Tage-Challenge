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

        String eingabe = Main.getInput();
        System.out.println(eingabe);
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
