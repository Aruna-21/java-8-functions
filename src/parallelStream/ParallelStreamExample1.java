package parallelStream;

import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.stream.Collectors;

public class ParallelStreamExample1 {

    //calculates total time to process output using sequential stream
    public static List<String> sequentialStream() {
        long startTime = System.currentTimeMillis();
        List<String> StudentList = StudentDataBase.getAllStudents()
                .stream()
                .map(Student::getActivities)
                .flatMap(List::stream)
                .distinct()//removes duplicates
                .sorted()
                .collect(Collectors.toList());
        long endTime = System.currentTimeMillis();
        System.out.println("time for sequentialstream in ms:" + (endTime - startTime));
        return StudentList;
    }

    //calculates total time to process output using parallel stream
    public static List<String> parallelStream() {
        long startTime = System.currentTimeMillis();
        List<String> StudentList = StudentDataBase.getAllStudents()
                .stream()
                .parallel()
                .map(Student::getActivities)
                .flatMap(List::stream)
                .distinct()//removes duplicates
                .sorted()
                .collect(Collectors.toList());
        long endTime = System.currentTimeMillis();
        System.out.println("time for parallelstream in ms:" + (endTime - startTime));
        return StudentList;
    }
    public static void main(String[] args) {
        sequentialStream();
        parallelStream();
    }
}
