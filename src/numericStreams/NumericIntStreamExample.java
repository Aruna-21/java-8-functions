package numericStreams;

import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class NumericIntStreamExample {
    public static void main(String[] args) {

        //using Intstream
        IntStream intStream=IntStream.range(1,50);
        System.out.println("range count for intstream:"+intStream.count());
        IntStream.range(1,50).forEach(values-> System.out.print(values+","));
        System.out.println();

        System.out.println("range closed count for intstream:"+IntStream.rangeClosed(1,50).count());
        IntStream.rangeClosed(1,50).forEach(values-> System.out.print(values+","));
        System.out.println();

        //using Longstream
        System.out.println("range count for longStream:"+LongStream.range(1,50).count());
        LongStream.range(1,50).forEach(values-> System.out.print(values+","));
        System.out.println();

        System.out.println("range closed count for longStream:"+LongStream.rangeClosed(1,50).count());
        LongStream.rangeClosed(1,50).forEach(values-> System.out.print(values+","));
        System.out.println();

        IntStream.range(1,50).asDoubleStream().forEach(values-> System.out.print(values+","));
    }
}
