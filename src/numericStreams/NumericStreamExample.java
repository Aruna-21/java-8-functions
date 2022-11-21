package numericStreams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class NumericStreamExample {

    //using reduce to calculate sum of nums
    public static int sumOfNNumber(List<Integer> integerList) {
        return integerList.stream()
                .reduce(0, (x, y) -> x + y);
    }

    //using sum
    public static int sumOfNNumberIntStream() {
        return IntStream.rangeClosed(1, 6)
                .sum();
    }

    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 5, 6);
        System.out.println("sum of n number:"+sumOfNNumber(integerList));
        System.out.println("sum of n number using intstream:"+sumOfNNumberIntStream());
    }
}
