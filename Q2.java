//Q2 Create a functional interface whose method takes 2 integers and return one integer.

interface AdditionInterface
{
    int sum(int num1, int num2);
}
public class Q2
{
    int addition(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }
    public static void main(String[] args)
    {
        AdditionInterface additionInterface = new Q2()::addition;
        int result = additionInterface.sum(20,30);

        System.out.println("Sum: "+result);
    }
}

//Output: Sum: 50
