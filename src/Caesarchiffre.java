import java.io.*;

/**
 * Created by Marvin Kirsch on 09.11.2016.
 * Matrikelnr.: 11118687
 * Aufgabenblatt 2 - "Kontrollstrukturen und Algorithmen"
 */
public class Caesarchiffre {

    public static void main(String args[]) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int key;
        do {
            System.out.println("Geben sie den Schluessel ein: ");
            key = Integer.parseInt(in.readLine());
        } while(key < 1 || key > 25);
        System.out.println("Geben sie eine Zeichenkette ein: ");
        StringBuffer chiffre = new StringBuffer(in.readLine());
        System.out.println("\nWollen sie die Zeichenkette entschluesseln oder verschluesseln ?(e or v");
        String antwort = "a";
        while(!(antwort.equalsIgnoreCase("entschluesseln") || antwort.equalsIgnoreCase("verschluesseln") || antwort.equalsIgnoreCase("e") || antwort.equalsIgnoreCase("v"))) {
            antwort = in.readLine();
        }
        if(antwort.equalsIgnoreCase("e") || antwort.equalsIgnoreCase("entschluesseln")) {
            chiffre = entschluesseln(chiffre, key);
        } else if(antwort.equalsIgnoreCase("v") || antwort.equalsIgnoreCase("verschluesseln")) {
            chiffre = verschluesseln(chiffre, key);
        }
        StringBuffer newChiffre = new StringBuffer(chiffre);
        System.out.println("Hier die ver - bzw. entschluesselte Zeichenkette: " + newChiffre);

    }

    public static StringBuffer verschluesseln(StringBuffer buffer, int key) {
        for(int i = 0;i < buffer.length();i++) {
            if(buffer.charAt(i)>=97 && buffer.charAt(i)<=122) {
                if(buffer.charAt(i)+key>122) {
                    buffer.setCharAt(i, ((char)(buffer.charAt(i)-26+key)));
                } else {
                    buffer.setCharAt(i,((char)(buffer.charAt(i)+key)));
                }
            } else if(buffer.charAt(i)>=65 && buffer.charAt(i)<=90) {
                if(buffer.charAt(i)+key>90) {
                    buffer.setCharAt(i, ((char)(buffer.charAt(i)-26+key)));
                } else {
                    buffer.setCharAt(i,((char)(buffer.charAt(i)+key)));
                }
            }
        }
        return buffer;
    }

    public static StringBuffer entschluesseln(StringBuffer buffer, int key) {
        for(int i = 0;i < buffer.length();i++) {
            if(buffer.charAt(i)>=97 && buffer.charAt(i)<=122) {
                if(buffer.charAt(i)-key<97) {
                    buffer.setCharAt(i, ((char)(buffer.charAt(i)+26-key)));
                } else {
                    buffer.setCharAt(i,((char)(buffer.charAt(i)-key)));
                }
            } else if(buffer.charAt(i)>=65 && buffer.charAt(i)<=90) {
                if(buffer.charAt(i)-key<65) {
                    buffer.setCharAt(i, ((char)(buffer.charAt(i)+26-key)));
                } else {
                    buffer.setCharAt(i,((char)(buffer.charAt(i)-key)));
                }
            }
        }
        return buffer;
    }
}
