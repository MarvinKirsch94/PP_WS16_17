package versuch_2;

import java.io.*;

/**
 * Created by Marvin Kirsch on 09.11.2016.
 * Matrikelnr.: 11118687
 * Aufgabenblatt 2 - "Kontrollstrukturen und Algorithmen"
 */
public class FunktionswertePolynom {

    public static void main(String args[]) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Geben sie den Wert fuer a an: ");
        double a = Double.parseDouble(in.readLine());
        System.out.println("Geben sie den Wert fuer b an: ");
        double b = Double.parseDouble(in.readLine());
        System.out.println("Geben sie den Wert fuer c an: ");
        double c = Double.parseDouble(in.readLine());
        System.out.println("Geben sie eine Intervallgrenze an: ");
        double x_links = Double.parseDouble(in.readLine());
        System.out.println("Geben sie die andere Intervallgrenze an: ");
        double x_rechts = Double.parseDouble(in.readLine());
        if(x_links > x_rechts) {
            x_links += x_rechts;
            x_rechts = x_links-x_rechts;
            x_links -= x_rechts;
        }
        System.out.println("Geben sie die anzahl der Stuetzstellen k an: ");
        int k = Integer.parseInt(in.readLine());
        double container[] = new double[k+2];
        container[0] = x_links;
        container[k+1] = x_rechts;
        if(k != 0) {
            double steps = (x_rechts-x_links)/((double)(k+1));
            for(int i = 1;i<k+1;i++) {
                container[i] = container[i-1] + steps;
            }
        }
        System.out.println("Ausgabe");
        for(int ii = 0;ii<container.length;ii++) {
            System.out.println("f(" + container[ii] + ") = " + (a*Math.pow(container[ii],2)+b*container[ii]+c));
        }
    }
}
