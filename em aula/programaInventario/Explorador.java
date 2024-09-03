// component:pirata_funcao.Explorador.java
// /<required interface/>
import java.util.Arrays;

public class Explorador {
    // /<constants/>
    static String[] V0 = {};
    static String[] V1 = {"CHA"};
    static String[] V2 = {"CHA", "BAÚ"};

    // /<function-method/>
    String[] tocar (String t, String[] s) {
        if (t.equals ("CHA") && Arrays.equals (s, V0)) {
            String[] r = new String [1];
            r[0] = "CHA";
            return r;
        }
        if (t.equals ("CHA") && Arrays.equals (s, V1)) {
            return s;
        }
        if (t.equals ("CHA") && Arrays.equals (s, V2)) {
            return s;
        }
        if (t.equals ("BAÚ") && Arrays.equals (s, V0)) {
            return s;
        }
        if (t.equals ("BAÚ") && Arrays.equals (s, V1)) {
            var r = new String [2];
            r[0] = "CHA";
            r[1] = "BAÚ";
            return r;
        }
        if (t.equals ("BAÚ") && Arrays.equals (s, V2)) {
            return s;
        }
        System.out.println (t);
        System.out.println (s);
        throw new RuntimeException ("Argumento fora do domínio");
    }
}
