/*
 * (c) codingtutor.de
 * --
 * Jan Brinkmann
 */

/**
 * Klasse Main: Hauptklasse für den Konverter
 */
public class Main {
    /**
     * Einstiegspunkt für den Konverter
     *
     * @param args Array aus Strings (Parameter auf der Kommandozeile)
     */
    public static void main(String[] args) {

        // while - undefinierte Anzahl Wiederholungen
        boolean ende = false;
        Konverter konverter = new Konverter();

        while (ende != true) {
            String aktion = KonverterInput.getInput("Deine Eingabe");

            if (aktion.equals("beenden")) {
                ende = true;

            } else if (aktion.equals("kilometer")) {
                konverter.kilometerAction();

            } else if (aktion.equals("meilen")) {
                konverter.meilenAction();

            } else {
                System.out.println("Unbekannte Aktion: " + aktion);
            }

            System.out.println();
        }
    }
}
