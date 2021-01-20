package old.callingordertest;

public class OrderChild extends OrderParent{
    static {
        System.out.println("Child Static Block");
    }

    {
        System.out.println("Child 1 NonStatic Block");
    }

    public OrderChild(){
        System.out.println("Child Constructor");
    }

    {
        System.out.println("Child 2 NonStatic Block");
    }
}
