package statictest;

public class StaticMain {
    public static void main(String[] args) {
        int a = 10;
//        System.out.println(a + HWStaticTestFirst.b); //Debug this. Answer should be == 15
//        System.out.println(a + HWStaticTestTwo.b); //Debug this. Answer should be == 15

        StaticMethod t = new StaticMethod();
        t.c = 10;
        StaticMethod qwe = new StaticMethod();
        qwe.c = 20;
        StaticMethod.method();
        t.method2();
        System.out.println(t.c + StaticMethod.b);
        System.out.println(qwe.c + StaticMethod.b);
        StaticMethod.b = 200;
        System.out.println(t.c + StaticMethod.b);
        System.out.println(qwe.c + StaticMethod.b);

    }
}
