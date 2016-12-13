package versuch_3.vorbereitung;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Marvin Kirsch on 25.11.2016.
 * Matrikelnr.: 11118687
 */
public class BerechnungEinerZufallszahl {

    public static void main(String args[]) throws IOException {
        int z = (int)(Math.random()*10);

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Geben sie einen Wert fuer a ein.");
        int a = Integer.parseInt(in.readLine());
        System.out.println("Geben sie einen Wert fuer b ein.");
        int b = Integer.parseInt(in.readLine());
        System.out.println("Geben sie einen Wert fuer m ein.");
        int m = Integer.parseInt(in.readLine());

        for(int i = 0; i < 20; i++) {
            System.out.println("Naechste Zufallszahl: " + berechnen_der_naechsten_zahl(z, a, b, m));
            z = berechnen_der_naechsten_zahl(z, a, b, m);
        }
    }

    public static int berechnen_der_naechsten_zahl(int z, int a, int b, int m) {

        return (a * z + b) % m;
    }
}
