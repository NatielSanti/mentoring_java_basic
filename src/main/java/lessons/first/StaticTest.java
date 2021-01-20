package lessons.first;

public class StaticTest {
    static{
        System.out.println("Static Block");
    }

    {
        System.out.println("Non-Static Block");
    }

    public StaticTest(){
        System.out.println("Constructor");
    }

    public void method(){
        System.out.println("Method");
    }
}
