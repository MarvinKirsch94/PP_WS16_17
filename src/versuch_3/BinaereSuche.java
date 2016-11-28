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
    }

    public static int sucheWort(String feld[], String suche) {
        int mitte = (feld.length - 1) / 2;
        if(feld[mitte].equals(suche)) {
            return mitte;
        } else {
            for(int x = 0; x < feld[mitte].length(); x++) {
                if(feld[mitte].charAt(x) == suche.charAt(x)) {
                    continue;
                } else if(feld[mitte].charAt(x) > suche.charAt(x)) {
                    //left
                    for(int y = 0; y < mitte; y++) {
                        newFeldL[y] = feld[y];
                    }
                } else {
                    //right
                    for(int z = 0; z < mitte; z++) {
                        newFeldR[z] = feld[z];
                    }
                }
            }
        }
    }
}
