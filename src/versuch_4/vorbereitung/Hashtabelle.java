package versuch_4.vorbereitung;

/**
 * Created by Marvin Kirsch on 21.12.2016.
 * Matrikelnr.: 11118687
 */
public class Hashtabelle {

    private String s[];

    public Hashtabelle(int g) {
        this.s = new String[g];
    }

    public boolean store(String s) {
        int h = 0;
        for (int i = 0; i < s.length(); i++) {
            h += (int) s.charAt(i);
        }

        if(this.s[h % s.length()] == null) {
            this.s[h % s.length()] = s;
            return true;
        } else {
            return false;
        }
    }

    public int search(String s) {
        int li = 0, mi, re = this.s.length -1;
        while(true) {
            mi = (int)Math.ceil((re+li)/2.0);
            if(this.s[mi] == null) return -1;
            if(this.s[mi].equals(s)) return mi;
            if(li == re) return -1;
            for(int x = 0; x < this.s[mi].length(); x++) {
                if(!(this.s[mi].charAt(x) == s.charAt(x))) {
                    if(s.charAt(x) > this.s[mi].charAt(x)) {
                        li = mi + 1;
                        break;
                    } else {
                        re = mi - 1;
                        break;
                    }
                }
            }
        }
    }

    public void delete(String s) {
        if(search(s) != -1) {
            this.s[search(s)] = null;
        }
    }
}
