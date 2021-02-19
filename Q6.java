//Q6 Create and access default and static method of an interface.


interface Interface6
{

    default void defaultMethod() {
        System.out.println("Default method");
    }

    static void staticMethod() {
        System.out.println("Static method");
    }

}
public class Q6 implements Interface6
{
    public static void main(String[] args) {
        new Q6().defaultMethod();
        Interface6.staticMethod();
    }
}

/*
Output:

Default method
Static method

 */