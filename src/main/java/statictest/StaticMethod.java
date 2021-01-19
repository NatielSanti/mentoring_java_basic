package statictest;

public class StaticMethod {
    public int a = 10;
    public static int b = 100;
    public int c;

    public static void method(){
        System.out.println("Parent static method");
    }

    public void method2(){
        System.out.println("Non static method");
    }
}
