package versuch_3.praktikum;

import java.math.BigDecimal;

/**
 * Created by Marvin Kirsch on 09.12.2016.
 * Matrikelnr.: 11118687
 */
public class Funktion {
    public static void main(String args[]) {
        auqvf();
    }

    public static void auqvf() {
        for(double x = 2; x <= 4; x += 0.1) {
            x = ((int)(x*10))/10.0;
            double function = 20*x*x-100*x+129.5;
            int quantisiert = (int)(20*x*x-100*x+129.5);
            System.out.println("Der x wert ist: " + x + "\nDer Funtionswert ist: " + ((int)(function*100))/100.0 + "\nDer quantisierte Wert ist: "
                    + quantisiert + (x==2.5 ? "\nAn der Stelle " + x + " befindet sich ein Minimum!" : "") + "\n");
        }
    }
}
