package versuch_3.vorbereitung;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Marvin Kirsch on 25.11.2016.
 * Matrikelnr.: 11118687
 */
public class Hashwert {

    public void main(String args[]) throws IOException {
        while(true) {
            BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Geben sie eine Zeichenkette ein: ");
            String s = in.readLine();
            System.out.println("Geben sie einen Wert fuer die Konstante m ein: ");
            int m = Integer.parseInt(in.readLine());
            System.out.println("Der Hashwert betraegt: " + hashwert(m, s));
            String antwort;
            do {
                System.out.println("Moechten sie das Programm erneut starten ? y/n");
                antwort = in.readLine();
            } while(!(antwort.equals("y") || antwort.equals("n")));
            if(antwort.equals("n")) {
                return;
            }
        }
    }

    public int hashwert(int m, String s) {
        int h = 0;
        for (int i = 0; i < s.length(); i++) {
            h += (int) s.charAt(i);
        }
        return h % m;
    }
}
