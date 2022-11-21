package parallelStream;

import java.util.function.Supplier;
import java.util.stream.IntStream;

public class ParallelStreamExample {
    //using sequential stream
    public static int sum_sequential_stream() {
        return IntStream.rangeClosed(1, 1000)
                .sum();
    }

    //using parallel stream
    public static int sum_parallel_stream() {
        return IntStream.rangeClosed(1, 1000)
                .parallel()
                .sum();
    }

    //checking performance of sequential and parallel stream
    public static long checkPerformance(Supplier<Integer> supplier, int noOfTimes) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < noOfTimes; i++) {
            supplier.get();
        }
        long endTime = System.currentTimeMillis();
        return endTime - startTime;
    }

    public static void main(String[] args) {
//        System.out.println(sum_sequential_stream());
//        System.out.println(sum_parallel_stream());
        System.out.println("sequential stream:" + checkPerformance(ParallelStreamExample::sum_sequential_stream,
                20));
        System.out.println("parallel stream:" + checkPerformance(ParallelStreamExample::sum_parallel_stream,
                20));
    }
}
