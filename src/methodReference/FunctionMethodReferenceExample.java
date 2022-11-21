package methodReference;

import java.util.function.Function;

public class FunctionMethodReferenceExample {

    //without method reference
    static Function<String,String> function =(s)->s.toUpperCase();

    //with method reference
    static Function<String,String> f1 = String::toUpperCase;
    public static void main(String[] args) {
        System.out.println("o/p using lambda:"+function.apply("Java8"));
        System.out.println("o/p using methodRef:"+f1.apply("java8"));
    }
}
