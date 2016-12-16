package versuch_3.praktikum;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ZahlenfolgeZusatz {

    public static void main(String args[]) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int z1 = 0, z2 = 0, t = 0;
        do {
            System.out.println("Geben sie z1 ein: ");
            z1 = Integer.parseInt(in.readLine());
            System.out.println("Geben sie z2 ein: ");
            z2 = Integer.parseInt(in.readLine());
        } while(z1 < 0 || z2 < z1);
        do {
            System.out.println("Geben sie einen Wert fuer t ein: ");
            t = Integer.parseInt(in.readLine());
        } while(t < 2 || t > 9);
        zahlenausgabe(z1, z2, t);
    }

    public static void zahlenausgabe(int z1, int z2, int t) {
        boolean bumm = false;
        for(int i = z1; i <= z2; i++) {
            int cache = i;
            while(!bumm) {
                if(cache%10 == t) {
                    bumm = true;
                } else {
                    if(cache/10 == 0) {
                        break;
                    } else {
                        cache /= 10;
                    }
                }
            }
            if(i != 0 && i%t==0) {
                bumm = true;
            }
            System.out.println(bumm ? "Bumm" : i);
            bumm = false;
        }
    }
}
