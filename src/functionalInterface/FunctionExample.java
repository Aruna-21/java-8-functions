package functionalInterface;

import java.util.function.Function;

public class FunctionExample {

    static Function<String,String> function = (name)-> name.toUpperCase();
    static Function<String,String> f1 = (name)-> name.toUpperCase().concat("default");

    public static void main(String[] args) {
        System.out.println( "output:" + function.apply("java8"));
        System.out.println( "output:" + function.andThen(f1).apply("java8"));
    }
}
