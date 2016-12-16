package versuch_3.praktikum;

public class Zahlenfolge {

    public static void main(String args[]) {
        einfacheSchleife();
        doppelteSchleife();
    }

    public static void einfacheSchleife() {
        for(int i = 0; i < 100; i++) {
            System.out.println(i!=0 && (i/10==7 || i%7==0 || i%10==7) ? "Bumm" : i);
        }
    }

    public static void doppelteSchleife() {
        for(int i = 0; i < 10; i++) {
            for(int j = 0; j < 10; j++) {
                System.out.println(!(i==0 && j==0) && (i==7 || j==7 || (i*10+j)%7==0) ? "Bumm" : (i*10+j));
            }
        }
    }
}
