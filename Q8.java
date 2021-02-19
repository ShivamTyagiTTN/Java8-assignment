//Q8 Implement multiple inheritance with default method inside interface.

interface Interface1
{
    public default void defaultMethod()
    {
        System.out.println("Default method of Interface 1");
    }
}

interface Interface2
{
    public default void defaultMethod()
    {
        System.out.println("Default method of Interface 2");
    }
}
public class Q8 implements Interface1, Interface2
{
    @Override
    public void defaultMethod()
    {
        Interface1.super.defaultMethod();

        Interface2.super.defaultMethod();
    }

    public static void main(String args[])
    {
        Q8 obj = new Q8();
        obj.defaultMethod();
    }
}
/*
Output:

Default method of Interface 1
Default method of Interface 2

 */