package Optional;

import java.util.Optional;

public class OptionalIsPresentExample {
    public static void main(String[] args) {
        //isPresent
        Optional<String> optional=Optional.ofNullable("hello optional");
        System.out.println(optional.isPresent());
        if(optional.isPresent())
            System.out.println(optional.get());

       //ifPresent
        optional.ifPresent(s-> System.out.println(s));
    }
}
