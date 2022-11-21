package numericStreams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class NumericBoxingUnboxingExample {
    //coverts int to integer
    public static List<Integer> boxing(){
        return IntStream.rangeClosed(1,10)
                .boxed()
                .collect(Collectors.toList());
    }

    //converts integer(wrapper) to int(primitive)
    public static int unboxing(List<Integer> integerList){
        return integerList.stream()
                .mapToInt(Integer::intValue)
                .sum();
    }
    public static void main(String[] args) {
        System.out.println("boxing :"+boxing());
        List<Integer> integerList=boxing();
        System.out.println("unboxing :"+unboxing(integerList));
    }
}
