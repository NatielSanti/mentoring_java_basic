package statictest;

public class HWStaticTestTwo {
    public static int b = 5;

    { //deleted "static" keyword
        b = 10;
    }
}
