import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Marvin Kirsch on 18.11.2016.
 * Matrikelnr.: 11118687
 */
public class InternetAdressen {

    public static void main(String args[]) throws IOException {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Geben sie die erste Ganzzahl ein: ");
        int g1 = Integer.parseInt(in.readLine());
        System.out.println("Geben sie die zweite Ganzzahl ein: ");
        int g2 = Integer.parseInt(in.readLine());
        System.out.println("Geben sie die dritte Ganzzahl ein: ");
        int g3 = Integer.parseInt(in.readLine());
        System.out.println("Geben sie die vierte Ganzzahl ein: ");
        int g4 = Integer.parseInt(in.readLine());
        System.out.println("Geben sie den Port ein: ");
        int p = Integer.parseInt(in.readLine());
        System.out.println("Geben sie die symbolische Adresse ein: ");
        String sa = in.readLine();
        System.out.println("kontrollausgabe\n" + g1 + "." + g2 + "." + g3 + "." + g4 + ":" + p + "," + sa);
        System.out.println("Laenge der Symbolischen Adresse: " + sa.length());
        System.out.println("Beginnt die Adresse mit (www.): " + sa.startsWith("www."));
        StringBuffer newSA = new StringBuffer(sa);
        newSA = newSA.delete(0,4);
        System.out.println(newSA);
    }
}
