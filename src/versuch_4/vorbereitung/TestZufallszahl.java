package versuch_4.vorbereitung;

/**
 * Created by Marvin Kirsch on 21.12.2016.
 * Matrikelnr.: 11118687
 */
public class TestZufallszahl {

    public static void main(String args[]) {

        Zufallszahl z = new Zufallszahl(33, 23,7);
        for(int i = 0; i < 10; i++) {
            System.out.println(z.nextRand());
            if(i == 5) {
                z.setSeed(15);
                z.reset();
            }
        }
    }
}
