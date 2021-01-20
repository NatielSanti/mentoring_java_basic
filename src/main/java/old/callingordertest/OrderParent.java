package old.callingordertest;

public class OrderParent {
    static {
        System.out.println("Parent Static Block");
    }

    {
        System.out.println("Parent 1 NonStatic Block");
    }

    public OrderParent(){
        System.out.println("Parent Constructor");
    }

    {
        System.out.println("Parent 2 NonStatic Block");
    }
}
