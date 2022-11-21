package streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class StreamMinMaxExample {

    //using reduce and > symbol to find max value
    public static int findMaxValue( List<Integer> integerList){
        return integerList.stream()
                .reduce(0,(x,y)->x>y?x:y);
    }

    //using max() to find maximum value
    public static int findMax( List<Integer> integerList){
        return integerList.stream()
                .max(Integer::compare).get();
    }

    //using reduce and < symbol to find min value
    public static int findMinValue( List<Integer> integerList){
        return integerList.stream()
                .reduce(1,(x,y)->x<y?x:y);
    }

    //using min() to find minimum value
    public static int findMin( List<Integer> integerList){
        return integerList.stream()
                .min(Integer::compare).get();
    }

    public static void main(String[] args) {
        List<Integer> integerList= Arrays.asList(6,7,8,9,10);
        System.out.println("maximum value is:" +findMaxValue(integerList));
        System.out.println("minimum value is:" +findMinValue(integerList));
        System.out.println("maximum value is:" +findMax(integerList));
        System.out.println("maximum value is:" +findMin(integerList));

    }
}

