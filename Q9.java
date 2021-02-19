//Q89 Collect all the even numbers from an integer list.

import java.util.List;
import java.util.stream.Collectors;

public class Q9 {
    public static void main(String[] args) {

        List<Integer> li = (List.of(1, 23, 4, 2, 432, 52));
        System.out.println(collectEvenNumbers(li));
    }

    private static List<Integer> collectEvenNumbers(List<Integer> number){

        return number.stream()
                .filter(n -> n%2==0)
                .collect(Collectors.toList());
    }
}

/* Output:

[4, 2, 432, 52]

 */