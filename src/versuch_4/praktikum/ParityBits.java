package versuch_4.praktikum;

/**
 * Created by Marvin Kirsch on 20.01.2017.
 * Matrikelnr.: 11118687
 */
public class ParityBits {

    private int feld[];
    private int pbit;

    public ParityBits(int feld[]) {
        this.feld = feld;
        for(int i : this.feld) {
            this.pbit += i;
        }
        this.pbit %= 2;
    }

    public int getPbit() {
        return this.pbit;
    }

    public int[] getFeld() {
        return this.feld;
    }

    public void turn(int i) {
        if(i >= 0) {
            feld[i] = (feld[i] + 1) % 2;
        }
    }

    public String testPbit() {
        int test = 0;
        for(int i : this.feld) {
            test += i;
        }
        test += this.pbit;
        return ((test%2) == 0 ? "Kein Error" : "Error");
    }
}
