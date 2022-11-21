package streamTerminal;

import data.Student;
import data.StudentDataBase;

import static java.util.stream.Collectors.*;

public class StreamSumAvgExample {

    //gives total no of notebooks
    public static int sum() {
        return StudentDataBase.getAllStudents()
                .stream()
                .collect(summingInt(Student::getNotebook));
    }

    //gives average of notebooks
    public static double average() {
        return StudentDataBase.getAllStudents()
                .stream()
                .collect(averagingInt(Student::getNotebook));
    }

    public static void main(String[] args) {
        System.out.println("sum : " + sum());
        System.out.println("average :" + average());
    }
}
