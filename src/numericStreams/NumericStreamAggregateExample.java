package numericStreams;

import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.OptionalLong;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class NumericStreamAggregateExample {
    public static void main(String[] args) {

        //gives sum of 1 to 50
        int sum = IntStream.rangeClosed(1, 50).sum();
        System.out.println("sum is : " + sum);

        //gives maximum value from 1 to 50
        OptionalInt optionalInt = IntStream.rangeClosed(1, 50).max();
        System.out.println("maxvalue is:" );
        System.out.println(optionalInt.isPresent() ? optionalInt.getAsInt():0);

        //gives minimum value from 1 to 50
        OptionalLong optionalLong =LongStream.rangeClosed(0,50).min();
        System.out.println("minvalue is:" );
        System.out.println(optionalLong.isPresent() ? optionalLong.getAsLong():0);

        //gives average value from 1 to 50
        OptionalDouble optionalDouble=IntStream.rangeClosed(1,50).average();
        System.out.println("average value is:" );
        System.out.println(optionalDouble.isPresent() ? optionalDouble.getAsDouble():0);
    }
}
