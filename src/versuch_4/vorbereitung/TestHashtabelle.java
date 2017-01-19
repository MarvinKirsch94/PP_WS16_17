package versuch_4.vorbereitung;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Marvin Kirsch on 21.12.2016.
 * Matrikelnr.: 11118687
 */
public class TestHashtabelle {

    public static void main(String args[]) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Geben sie die Groesse der Hashtabelle ein: ");
        int a = Integer.parseInt(in.readLine());
        Hashtabelle h = new Hashtabelle(a);
        for(int i = 0; i < a; i++) {
            System.out.println("Geben sie einen String, den sie in die Hashtabelle speichern wollen ein: ");
            String s = in.readLine();
            System.out.println(h.store(s));
        }
        System.out.println("Geben sie das gesuchte wort ein: ");
        String suche = in.readLine();
        int b = h.search(suche);
        System.out.println(b < 0 ? "Das wort konnte nicht gefunden werden." : "Das wort steht im array auf dem index " + b);
        if(b >= 0) {
            h.delete(suche);
        }
        System.out.println(h.search(suche));
    }
}
