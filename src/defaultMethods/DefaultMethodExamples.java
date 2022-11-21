package defaultMethods;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class DefaultMethodExamples {
    public static void main(String[] args) {
        List<String> stringList= Arrays.asList("Adam","Jenny","Alex","Dan","Mike","Eric");

        //sorting before java8
        Collections.sort(stringList);
        System.out.println("sorting before java8:"+stringList);

        //using java8
        stringList.sort(Comparator.naturalOrder());
        System.out.println("sorting using java8:"+stringList);
    }
}
