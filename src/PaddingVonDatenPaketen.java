import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Marvin Kirsch on 18.11.2016.
 * Matrikelnr.: 11118687
 */
public class PaddingVonDatenPaketen {
    public static void main(String args[]) throws IOException {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Geben sie l ein: ");
        double l = Double.parseDouble(in.readLine());
        System.out.println("Geben sie n ein: ");
        double n = Double.parseDouble(in.readLine());
        int k = (int)Math.ceil(l/(Math.pow(2,n)));
        System.out.println("k entspricht: " + k);
        int gl = k*(int)Math.pow(2,n);
        System.out.println("gl entspricht: " + gl);
        int p = gl - (int)l;
        System.out.println("p entspricht: " + p);
    }
}
