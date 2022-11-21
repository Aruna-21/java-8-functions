package streamTerminal;

import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;

import static java.util.stream.Collectors.partitioningBy;

public class streamPartitioningBy {

    //if condition is satisfied, then prints list of students with true key or else false key
    public static void partitionBy() {
        Predicate<Student> predicateGpa = student -> student.getGpa() >= 3.8;
        Map<Boolean, List<Student>> studentList = StudentDataBase.getAllStudents()
                .stream()
                .collect(partitioningBy(predicateGpa));
        System.out.println(studentList);
    }

    public static void main(String[] args) {
        partitionBy();
    }
}
