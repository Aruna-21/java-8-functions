package streamTerminal;

import data.Student;
import data.StudentDataBase;

import java.util.Comparator;
import java.util.Optional;

import static java.util.stream.Collectors.maxBy;
import static java.util.stream.Collectors.minBy;

public class StreamMinByMaxByExample {

    //usind minBy to find minimum gpa in student list
    public static Optional<Student> minimum() {
        return StudentDataBase.getAllStudents()
                .stream()
                .collect(minBy(Comparator.comparing(Student::getGpa)));
    }

    //usind maxBy to find maximum gpa in student list
    public static Optional<Student> maximum() {
        return StudentDataBase.getAllStudents()
                .stream()
                .collect(maxBy(Comparator.comparing(Student::getGpa)));
    }

    public static void main(String[] args) {
        System.out.println("min value:"+minimum());
        System.out.println("max value:"+maximum());
    }
}
