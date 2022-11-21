package functionalInterface;

import java.util.Comparator;
import java.util.function.BinaryOperator;

public class BinaryOperatorExample {

    public static void main(String[] args) {
        BinaryOperator<Integer> binaryOperator=(a,b)->a+b;
        System.out.println(binaryOperator.apply(5,4));

        Comparator<Integer> comparator=(a,b)->a.compareTo(b);
        //maximum value
        BinaryOperator<Integer> b1=BinaryOperator.maxBy(comparator);
        System.out.println(b1.apply(4,6));
        //minimum value
        BinaryOperator<Integer> b2=BinaryOperator.minBy(comparator);
        System.out.println(b2.apply(4,6));
    }
}
