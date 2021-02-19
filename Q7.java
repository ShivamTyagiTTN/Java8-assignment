//Q7 Override the default method of the interface.

interface Interface7 {

    default void defaultMethod() {
        System.out.println("Interface default method");
    }
}

public class Q7 implements Interface6 {

    @Override
    public void defaultMethod() {
        System.out.println("Default method Overridden");
    }

    public static void main(String[] args) {
        new Q7().defaultMethod();
    }
}

/*
Output:
Default method Overridden

 */