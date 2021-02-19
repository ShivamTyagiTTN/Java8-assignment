//Q3 Using (instance) Method reference create and apply add and subtract method and using (Static) Method reference create and apply multiplication method for the functional interface created.



interface NewInterface
{
    int apply(int a, int b);
}
public class Q3
{
    public int add(int x, int y)
    {
        return x + y;
    }

    public int sub(int x, int y)
    {
        return x - y;
    }

    public static int mul(int x, int y)
    {
        return x * y;
    }

    public static void main(String[] args)
    {
        //instance method reference
        NewInterface o1 = new Q3()::add;
        System.out.println("Addition: "+ o1.apply(30,20));

        NewInterface o2 = new Q3()::sub;
        System.out.println("Subtraction: "+ o2.apply(30,20));

        //static method reference
        NewInterface o3 = Q3::mul;
        System.out.println("Multiplication: "+ o3.apply(30,20));
    }
}

/*
Output:

Addition: 50
Subtraction: 10
Multiplication: 600

 */