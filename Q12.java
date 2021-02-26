//Q12 Find the first even number in the integer list which is greater than 3.


import java.util.List;

public class Q12 {
    public static void main(String[] args) {

        List<Integer> integerList = (List.of(1, 23, 4, 2, 432, 52));
        System.out.println(findFirstEvenGreaterThanThree(integerList));
    }

    private static Integer findFirstEvenGreaterThanThree(List<Integer> numbers){

        return numbers.stream()
                .filter(num -> num > 3)
                .filter(num -> num % 2 == 0)
                .findFirst()
                .get();
    }
}


// Output: 4
