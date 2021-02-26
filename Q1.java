/*
Q1 Write the following a functional interface and implement it using lambda:
        (1) First number is greater than second number or not          Parameter (int ,int ) Return boolean
        (2) Increment the number by 1 and return incremented value     Parameter (int) Return int
        (3) Concatination of 2 string                                  Parameter (String , String ) Return (String)
        (4) Convert a string to uppercase and return .                 Parameter (String) Return (String)

*/


interface GreaterNumber {
    Boolean returnGreater(int inputInteger1, int inputInteger2);
}

interface Increment {
    int incrementNum(int inputInteger);
}

interface ConcatString {
    String concatString(String firstString, String secondString);
}

interface ToUppercaseString {
    String upperString(String inputString);
}

class Q1{
    public static void main(String[] args) {

        GreaterNumber greaterNumber = (first, second) -> first > second;
        System.out.println("Is Greater number : "+greaterNumber.returnGreater(8, 7));

        Increment increment = (inputNumber) -> ++inputNumber;
        System.out.println("Incremented value : "+increment.incrementNum(9));

        ConcatString concatString = (firstString, secondString) -> firstString + " " + secondString;
        System.out.println("Concatenated String : "+concatString.concatString("Hello", "World"));

        ToUppercaseString toUppercaseString = (inputString) -> inputString.toUpperCase();
        System.out.println("To uppercase : "+toUppercaseString.upperString("Shivam"));

    }
}
/*
Output:

Is Greater number : true
Incremented value : 10
Concatenated String : Hello World
To uppercase : SHIVAM

 */
