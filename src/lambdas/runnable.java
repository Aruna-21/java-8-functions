package lambdas;

public class runnable {
    public static void main(String[] args) {
// before java8
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Inside runnable 1");
            }
        };
        new Thread(runnable).start();

        //using java 8 with curly braces{}
        Runnable runnable1 = () -> {
            System.out.println("Inside runnable 2");
        };
        new Thread(runnable1).start();

        //without braces
        Runnable runnable2 = () ->
            System.out.println("Inside runnable 3");

        new Thread(runnable2).start();

        //simpler way
        new Thread(() -> System.out.println("Inside runnable 4")).start();
    }
}
