package versuch_3.praktikum;

/**
 * Created by Marvin Kirsch on 09.12.2016.
 * Matrikelnr.: 11118687
 */
public class Zahlenfolge {

    public static void main(String args[]) {

        for(int i = 0; i < 100; i++) {
            System.out.println(i/10==7 || i%7==0 || i%10==7 ? "Bumm" : i );
        }
    }
}
