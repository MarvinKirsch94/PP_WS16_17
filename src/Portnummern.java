import java.io.*;

/**
 * Created by Marvin Kirsch on 09.11.2016.
 * Matrikelnr.: 11118687
 * Aufgabenblatt 2 - "Kontrollstrukturen und Algorithmen"
 */
public class Portnummern {

    public static void main(String args[]) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int portnummer;
        boolean nochmal = false;
        do {
            do {
                System.out.println("Geben sie eine Portnummer ein: ");
                portnummer = Integer.parseInt(in.readLine());
            } while (portnummer < 0 || portnummer >= 65535);
            //Port Art
            String artDesPorts;
            if (portnummer < 1024) {
                artDesPorts = "well-known ports";
            } else if (portnummer < 49152) {
                artDesPorts = "registered ports";
            } else {
                artDesPorts = "dynamic ports";
            }
            System.out.println("Die Art des Ports: \n" + artDesPorts);
            switch (portnummer) {
                case 21:
                    artDesPorts = "FTP (File Transfer Protocol, Uebertragung von Dateien)";
                    break;
                case 23:
                    artDesPorts = "Telnet (Einloggen in entfernte Rechner)";
                    break;
                case 25:
                    artDesPorts = "SMTP (Simple Mail Transfer Protocol, Mailversand)";
                    break;
                case 80:
                    artDesPorts = "HTTP (HyperText Transfer Protocol, Zugriff auf Web-Server)";
                    break;
                case 143:
                    artDesPorts = "IMAP (Internet Message Access Protocol, Zugriff auf Mail-Server)";
                    break;
                default:
                    artDesPorts = "Sonstiger Dienst";
                    break;
            }
            System.out.println(artDesPorts);
            System.out.println("\nWollen sie das Programm von vorne starten ?(y or n");
            String antwort = "a";
            while(!(antwort.equalsIgnoreCase("y") || antwort.equalsIgnoreCase("n"))) {
                System.out.println("Geben sie y für Ja ein oder n für nein: ");
                antwort = in.readLine();
            }
            if(antwort.equalsIgnoreCase("y")) {
                System.out.println("Wird neu gestarted!");
                nochmal = true;
            } else if(antwort.equalsIgnoreCase("n")) {
                System.out.println("Wuensche einen schoenen Tag :)");
                nochmal = false;
            }
        } while(nochmal);
    }
}
