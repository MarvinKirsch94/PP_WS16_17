package versuch_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Marvin Kirsch on 25.11.2016.
 * Matrikelnr.: 11118687
 */
public class BinaereSuche {

    public static void main(String args[]) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int g;
        do {
            System.out.println("Geben sie die Anzahl der Woerter ein: ");
            g = Integer.parseInt(in.readLine());
        } while(g < 6);
        String feld[] = new String[g];
        for(int i = 0; i < feld.length; i++) {
            System.out.println("Geben sie das naechste Wort ein: ");
            feld[i] = in.readLine();
        }
        System.out.println("Eingabe abgeschlossen.\n" +
                "Geben sie das Wort nach dem gesucht werden soll ein: ");
        String suche = in.readLine();
        int re = sucheWort(feld, suche);
        System.out.println("Der Wert wurde " + (re < 0 ? "nicht gefunden :(" : ("an der Stelle: " + re + " gefunden.")));
    }

    private static int sucheWort(String feld[], String suche) {
        int li = 0, mi, re = feld.length -1;
        while(true) {
            mi = (int)Math.ceil((re+li)/2.0);
            if(feld[mi].equals(suche)) return mi;
            if(li == re) return -1;
            for(int x = 0; x < feld[mi].length(); x++) {
                if(!(feld[mi].charAt(x) == suche.charAt(x))) {
                    if(suche.charAt(x) > feld[mi].charAt(x)) {
                        li = mi + 1;
                        break;
                    } else {
                        re = mi - 1;
                        break;
                    }
                }
            }
        }
    }
}
