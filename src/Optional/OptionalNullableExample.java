package Optional;

import java.util.Optional;

public class OptionalNullableExample {

    //returns value for non null, if not return empty optional
    public static Optional<String> nullable() {
        Optional<String> optional = Optional.ofNullable("Hello");
        return optional;
    }

    //returns optional with non value, else throws null pointer exception
    public static Optional<String> of() {
        Optional<String> optional = Optional.of("Hello");
        return optional;
    }

    //returns empty optional
    public static Optional<String> empty() {
        Optional<String> optional = Optional.empty();
        return optional;
    }

    public static void main(String[] args) {
        System.out.println(nullable());
        System.out.println(of());
        System.out.println(empty());

    }
}
