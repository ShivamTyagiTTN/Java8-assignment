//Q12 Find the first even number in the integer list which is greater than 3.


import java.util.List;

public class Q12 {
    public static void main(String[] args) {

        List<Integer> li = (List.of(1, 23, 4, 2, 432, 52));
        System.out.println(sumNumbers(li));
    }

    private static Integer sumNumbers(List<Integer> number){

        return number.stream()
                .filter(x -> x > 3)
                .filter(x -> x%2==0)
                .findFirst()
                .get();
    }
}


// Output: 4