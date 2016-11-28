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
        System.out.println("Der Wert wurde an der Stelle : " + (sucheWort(feld, suche) < 0 ? "\nDas Wort konnte nicht gefunden werden :(" : sucheWort(feld, suche)));
    }

    private static int sucheWort(String feld[], String suche) {
        int mitte;
        //int pos;
        String newFeldL[];
        String newFeldR[];
        while(true) {
            for (String aFeld : feld) {
                System.out.println(aFeld);
            }
            mitte = (feld.length) / 2;
            if (feld[mitte].equals(suche)) {
                return mitte;
            } else {
                if(feld.length <= 1) return -1;
                for (int x = 0; x < feld[mitte].length(); x++) {
                    System.out.println("hey");
                    if (!(feld[mitte].charAt(x) == suche.charAt(x))) {
                        if (feld[mitte].charAt(x) > suche.charAt(x)) {
                            //left
                            System.out.println("left");
                            newFeldL = new String[mitte];
                            System.arraycopy(feld, 0, newFeldL, 0, mitte);
                            feld = newFeldL;
                            break;
                        } else {
                            //right
                            System.out.println("right");
                            newFeldR = new String[mitte];
                            System.arraycopy(feld, mitte + 1, newFeldR, 0, feld.length - mitte);
                            for (int z = 0; z < mitte; z++) {
                                newFeldR[z] = feld[z + mitte + 1];
                            }
                            feld = newFeldR;
                            break;
                        }
                    }
                }
            }
        }
    }
}
