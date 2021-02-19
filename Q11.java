//Q11 Find average of the number inside integer list after doubling it.


import java.util.List;
import java.util.stream.Collectors;

public class Q11 {
    public static void main(String[] args) {

        List<Integer> li = (List.of(2, 23, 4, 2, 43, 52));
        System.out.println(avgNumbers(li));
    }

    private static Double avgNumbers(List<Integer> number){

        return number.stream()
                .map(x -> x+x)
                .collect(Collectors.averagingInt(x -> x));
    }
}



// Output:  42.0