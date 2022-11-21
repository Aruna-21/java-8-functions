package lambdas;

import java.util.Comparator;

public class comparator {
    public static void main(String[] args) {
        //before java 8
        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);//returns 0 if 01=02
                                        //returns 1 if o1>o2
                                        //returns -1 if o1<o2
            }
        };
        System.out.println("Result of comparator is "+ comparator.compare(3,2));

        //using java 8 lambda () -> {}
        Comparator<Integer> comparator1 = (Integer a, Integer b)-> a.compareTo(b);
        System.out.println("Result of comparator1 is "+ comparator1.compare(3,2));

        Comparator<Integer> comparator2 = (a,b)-> a.compareTo(b);
        System.out.println("Result of comparator2 is "+ comparator2.compare(3,2));

    }
}
