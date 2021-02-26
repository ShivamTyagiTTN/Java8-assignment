/*
Q3 Using (instance) Method reference create and apply add and subtract method
 and using (Static) Method reference create and apply multiplication method for the functional interface created.
*/


interface NewInterface
{
    int apply(int one, int two);
}

public class Q3
{
    public int add(int firstNumber, int secondNumber)
    {
        return firstNumber + secondNumber;
    }

    public int subtract(int firstNumber, int secondNumber)
    {
        return firstNumber - secondNumber;
    }

    public static int multiply(int firstNumber, int secondNumber)
    {
        return firstNumber * secondNumber;
    }

    public static void main(String[] args)
    {
        //instance method reference
        NewInterface newInterfaceObj1 = new Q3()::add;
        System.out.println("Addition: "+ newInterfaceObj1.apply(30,20));

        NewInterface newInterfaceObj2 = new Q3()::subtract;
        System.out.println("Subtraction: "+ newInterfaceObj2.apply(30,20));

        //static method reference
        NewInterface newInterfaceObj3 = Q3::multiply;
        System.out.println("Multiplication: "+ newInterfaceObj3.apply(30,20));
    }
}

/*
Output:

Addition: 50
Subtraction: 10
Multiplication: 600

 */
