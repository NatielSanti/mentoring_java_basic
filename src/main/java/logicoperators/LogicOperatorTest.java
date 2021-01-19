package logicoperators;

public class LogicOperatorTest {
    boolean da;
    boolean db;
    boolean dc;
    boolean dd;
    boolean de;
    boolean df;
    boolean dg;

    int ra;
    int rb;
    int rc;
    int rd;
    int re;
    int rf;
    int rg;
    int rh;
    int ri;

    public LogicOperatorTest(){
        boolean a = true;
        boolean b = true;
        boolean c = false;

        da = a && b;
        db = a && c;
        dc = a || b;
        dd = a || c;
        de = a ^ b;
        df = a ^ c;
        dg = !a;

        int q = 4;
        int w = 5;
        int e = -8;
        int t = 1_000_000;

        ra = ~q;
        rb = q & w;
        rc = q | w;
        rd = q>>1;
        re = q>>>1;
        rf = e >> 1;
        rg = e >>> 1;
        rh = q << 1;
        ri = e << 1;
    }

}
