/*
Q5 Implement following functional interfaces from java.util.function using lambdas:

    1.Consumer
    2.Supplier
    3.Predicate
    4.Function

 */


import java.util.List;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

class Q5 {
    public static void main(String[] args) {

        List<Integer> integerList = List.of(2, 4, 45, 21, 4, 2, 3, 1);

        printEvenSquare(integerList);

    }

    private static void printEvenSquare(List<Integer> numbers) {

        Consumer<Integer> printConsumer = num -> System.out.println(num);

        Supplier<Integer> randomSupplier = () -> { Random random = new Random(); return random.nextInt(100); };

        Predicate<Integer> isEvenPredicate = num -> num % 2 == 0;

        Function<Integer, Integer> squareFunction = num -> num * num;


        System.out.println("Random number : "+ randomSupplier.get());

        System.out.println("New List: ");
        numbers.stream().filter(isEvenPredicate).map(squareFunction).forEach(printConsumer);
    }
}

/*
Output:

Random number : 18
New List:
4
16
16
4

 */
