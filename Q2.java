//Q2 Create a functional interface whose method takes 2 integers and return one integer.

interface AdditionInterface
{
    int sum(int num1, int num2);
}
public class Q2
{
    int addition(int a, int b) {
        return a + b;
    }
    public static void main(String[] args)
    {
        AdditionInterface res = new Q2()::addition;
        int result = res.sum(20,30);

        System.out.println("Sum: "+result);
    }
}

//Output: Sum: 50
