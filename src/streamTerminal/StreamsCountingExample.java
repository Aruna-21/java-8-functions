package streamTerminal;

import data.StudentDataBase;
import java.util.stream.Collectors;

public class StreamsCountingExample {

    //count total no of lists based on condition
    public static long count(){
        return StudentDataBase.getAllStudents().stream()
                .filter(student->student.getGpa()>=3.9)
                .collect(Collectors.counting());
    }
    public static void main(String[] args) {
        System.out.println("count :"+count());
    }
}
