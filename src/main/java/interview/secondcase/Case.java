package interview.secondcase;

import java.util.ArrayList;
import java.util.List;

public class Case {
    static int i;
    public static void main(String[] args) {
        // Case 1
        System.out.println("Case 1 " + i);
        // Case 2
        int a = 1;
        System.out.println("Case 2 " + (++a == a++));

        // Case 3
        Integer b = 128;
        Integer c = 128;
        Integer d = -128;
        Integer e = -128;
        System.out.println( "Case 3 " + (b == c) + " " + (d == e));

        // Case 4
        int f = 0_10;
        System.out.println("Case 4 " + f);

        // Case 5
        int h = 10;
        doMagic(h);
        System.out.println("Case 5 " + h);

        // Case 6
        ArrayList<Integer> list = new ArrayList<Integer>(){{ add(10); add(20); }};
        doMagic(list);
        System.out.println("Case 6 " + list.size());
    }

    private static int doMagic(int h) {
        return h++;
    }

    private static ArrayList<Integer> doMagic(ArrayList<Integer> list) {
        list.clear();
        return list;
    }
}
