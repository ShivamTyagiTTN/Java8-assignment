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

        List<Integer> numli = List.of(2, 4, 45, 21, 4, 2, 3, 1);

        calculate(numli);

    }

    private static void calculate(List<Integer> num) {

        Consumer<Integer> consumer = x -> System.out.println(x);

        Supplier<Integer> supplier = () -> { Random r = new Random(); return r.nextInt(100); };

        Predicate<Integer> isEvenPredicate = x -> x % 2 == 0;

        Function<Integer, Integer> squareFunction = x -> x * x;


        System.out.println("Random number : "+ supplier.get());

        System.out.println("New List: ");
        num.stream().filter(isEvenPredicate).map(squareFunction).forEach(consumer);
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