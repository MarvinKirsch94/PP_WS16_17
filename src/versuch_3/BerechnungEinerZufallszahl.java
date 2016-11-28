package versuch_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Marvin Kirsch on 25.11.2016.
 * Matrikelnr.: 11118687
 */
public class BerechnungEinerZufallszahl {

    public static void main(String args[]) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Geben sie einen Wert ein auf der die naechste Zufallszahl basiert.");
        int z = Integer.parseInt(in.readLine());
        System.out.println("Geben sie einen Wert fuer a ein.");
        int a = Integer.parseInt(in.readLine());
        System.out.println("Geben sie einen Wert fuer b ein.");
        int b = Integer.parseInt(in.readLine());
        System.out.println("Geben sie einen Wert fuer m ein.");
        int m = Integer.parseInt(in.readLine());
        int speicher = 0;
        for(int i = 0; i < 20; i++) {
            System.out.println("Naechste Zufallszahl: " + berechnen_der_naechsten_zahl(speicher, a, b, m));
            speicher = berechnen_der_naechsten_zahl(speicher, a, b, m);
        }
    }

    public static int berechnen_der_naechsten_zahl(int z, int a, int b, int m) {
        return (a * z + b) % m;
    }
}
