//Q10 Sum all the numbers greater than 5 in the integer list.

import java.util.List;

public class Q10 {
    public static void main(String[] args) {

        List<Integer> li = (List.of(1, 23, 4, 2, 432, 52));
        System.out.println(sumNumbers(li));
    }

    private static Integer sumNumbers(List<Integer> number){

        return number.stream()
                .filter(x -> x > 5)
                .reduce(0, (x,y) -> x+y);
    }
}


// Output: 507