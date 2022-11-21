package streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class streamLimitSkipExample {

    //limit takes "n" ele's
    //skip skips "n" ele's
    public static Optional<Integer> limit(List<Integer> integerList){
        return integerList.stream()
                .limit(2)//takes only 6 and 7
                .reduce((x,y)->x+y);
    }
    public static void main(String[] args) {
        List<Integer> integerList= Arrays.asList(6,7,8,9,10);
        Optional<Integer> limitResult= limit(integerList);
        System.out.println("limit result:"+limitResult.get());
    }
}
