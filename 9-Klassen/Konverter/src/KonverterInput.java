import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * (c) codingtutor.de
 * --
 * Jan Brinkmann
 */
public class KonverterInput
{
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
