//Q11 Find average of the number inside integer list after doubling it.


import java.util.List;
import java.util.stream.Collectors;

public class Q11 {
    public static void main(String[] args) {

        List<Integer> integerList = (List.of(2, 23, 4, 2, 43, 52));
        System.out.println(avgNumbers(integerList));
    }

    private static int avgNumbers(List<Integer> number){

        return (int)Math.round(number.stream()
                .map(num -> num + num)
                .collect(Collectors.averagingInt(num -> num)));
    }
}



// Output:  42.0
