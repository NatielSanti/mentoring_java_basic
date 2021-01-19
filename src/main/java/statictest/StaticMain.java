package statictest;

public class StaticMain {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(a + HWStaticTestFirst.b); //Debug this. Answer should be == 15
        System.out.println(a + HWStaticTestTwo.b); //Debug this. Answer should be == 15

    }
}
