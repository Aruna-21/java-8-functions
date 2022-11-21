package streams;

import java.util.Arrays;
import java.util.List;

public class StreamReduce {

    //using reduce to reduce contents of stream to single value
    public static int performMultiplication(List<Integer> integerList) {
        return integerList.stream()
                .reduce(1, (a, b) -> a * b);
    }

    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 5);
        System.out.println(performMultiplication(integerList));
    }
}
