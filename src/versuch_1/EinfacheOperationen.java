package versuch_1;

/**
 * Created by Marvin Kirsch, Zarko Prastalo on 20.10.2016.
 * C12
 * Aufgabenblatt 1 - "Einfache Operationen in Java"
 */
public class EinfacheOperationen {
    //Aufgabe 1
    public int berechnen_der_naechsten_zahl(int z) {
        int a = 1;
        int b = 1;
        int m = 2;
        return (a * z + b) % m;
    }
    //Aufgabe 2
    public int hashwert(char c1, char c2, char c3, char c4) {
        int m = 5;
        return ((int)c1 + (int)c2 + (int)c3 + (int)c4)%m;
    }
    //Aufgabe 3
    public int wert_eines_flags(short flags, byte k) {
        int b = (flags >> k)&1;
        return b;
    }
    //Aufgabe 4
    public char ascii_zeichen(char c) {
        if((int)c + 2 > 90) {
            c = (char)(64 + (int)c + 2 - 90);
        } else {
            c = (char)((int)c + 2);
        }
        return c;
    }
    //Aufgabe 5
    public String zeichenketten(String s1, String s2) {
        String s3 = s1 + " " + s2;
        return s3;
    }
}
