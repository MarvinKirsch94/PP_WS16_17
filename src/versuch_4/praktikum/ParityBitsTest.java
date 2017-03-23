package versuch_4.praktikum;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Marvin Kirsch on 20.01.2017.
 * Matrikelnr.: 11118687
 */
public class ParityBitsTest {

    public static void main(String args[]) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        boolean erneut = false;
        do {
            System.out.println("Geben sie die bits nach einander durch \"Eingabe\" getrennt ein: ");
            int feld[] = new int[8];
            for (int i = 0; i < feld.length; i++) {
                int eingabe;
                do {
                    eingabe = Integer.parseInt(in.readLine());
                } while (eingabe != 0);
                feld[i] = eingabe;
            }
            ParityBits pb = new ParityBits(feld);
            for (int i : pb.getFeld()) {
                System.out.print(i + "\t");
            }
            System.out.print(pb.getPbit() + "\n");
            System.out.println("Geben sie den Index des bits an den sie \"umkippen\" wollen: ");
            int i = Integer.parseInt(in.readLine());
            pb.turn(i);
            System.out.println("Bits werden auf Fehler getestet: ...");
            System.out.println(pb.testPbit());
            System.out.println("\nWollen sie das Programm von vorne starten ?(y or n");
            String ant = "a";
            while(!(ant.equalsIgnoreCase("y") || ant.equalsIgnoreCase("n"))) {
                System.out.println("Geben sie y für Ja ein oder n für nein: ");
                ant = in.readLine();
            }
            if(ant.equalsIgnoreCase("y")) {
                System.out.println("Wird neu gestarted!");
                erneut = true;
            } else if(ant.equalsIgnoreCase("n")) {
                System.out.println("Wird beendet");
                erneut = false;
            }
        } while(erneut);
    }
}
