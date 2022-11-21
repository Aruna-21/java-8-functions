package functionalInterface;

import java.util.function.UnaryOperator;

public class UnaryOperatoeExample {

    static UnaryOperator<String> unaryOperator = (a)->a.concat("default");
    public static void main(String[] args) {
        System.out.println(unaryOperator.apply("java8"));
    }
}
