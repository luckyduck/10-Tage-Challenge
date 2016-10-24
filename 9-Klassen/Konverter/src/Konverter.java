/**
 * (c) codingtutor.de
 * --
 * Jan Brinkmann
 */
public class Konverter
{
    /**
     * Umrechnung von Kilometer zu Meilen
     */
    public void kilometerAction()
    {
        try {
            // Kilometer von User erfragen
            String input = KonverterInput.getInput("Kilometer?");
            double kilometer = Double.parseDouble(input); // 12.23, nein

            // Umrechnung durchführen
            double meilen = kilometer * 1.6;
            System.out.println("Meilen: " + meilen);

        } catch (Exception e) {
            System.out.println("Fehler: falsches Format");
        }
    }

    public void meilenAction()
    {
        try {
            String input = KonverterInput.getInput("Meilen?");
            double meilen = Double.parseDouble(input); // 12.23, nein

            double kilometer = meilen / 1.6;
            System.out.println("Kilometer: " + kilometer);

        } catch (Exception e) {
            System.out.println("Fehler: falsches Format");
        }
    }
}
