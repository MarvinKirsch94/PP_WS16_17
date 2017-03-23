package versuch_4.praktikum;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Marvin Kirsch on 20.01.2017.
 * Matrikelnr.: 11118687
 */
public class SelectionSort {
    public static void main(String args[]) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int g;
        do {
            System.out.println("Geben sie die groesse des Feldes ein");
            g = Integer.parseInt(in.readLine());
        } while(g <= 1);
        int feld[] = new int[g];
        for(int i = 0; i < feld.length; i++) {
            System.out.println("Geben sie die naechste zahl ein: ");
            feld[i] = Integer.parseInt(in.readLine());
        }
        int zaehler = 0;
        while(true) {
            if(zaehler == feld.length) break;
            int c = feld[zaehler];
            int zeiger = zaehler;
            for(int i = (zaehler + 1); i < feld.length; i++) {
                if(c > feld[i]) {
                    c = feld[i];
                    zeiger = i;
                }
            }
            if(c != feld[zaehler]) {
                feld[zeiger] = feld[zaehler];
                feld[zaehler] = c;
            }
            zaehler++;
        }
        System.out.println("Das Feld ist sortiert!");
        for(int i = 0; i < feld.length; i++) {
            System.out.println(feld[i] + "\t");
        }
    }
}
