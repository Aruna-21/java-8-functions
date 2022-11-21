package streams;

import data.Student;
import data.StudentDataBase;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsComparator {

    //using sorted() and comparator to get student names
    public static List<Student> getByname(){
        return StudentDataBase.getAllStudents().stream()
                .sorted(Comparator.comparing(Student::getName))
                .collect(Collectors.toList());
    }

    //using sorted() and comparator to get student gpa
    public static List<Student> getByGpa(){
        return StudentDataBase.getAllStudents().stream()
                .sorted(Comparator.comparing(Student::getGpa))
                .collect(Collectors.toList());
    }

    //using sorted() and comparator to get student names in descending order
    public static List<Student> getByGpaReverse(){
        return StudentDataBase.getAllStudents().stream()
                .sorted(Comparator.comparing(Student::getGpa).reversed())
                .collect(Collectors.toList());
    }
    public static void main(String[] args) {
        System.out.println(getByname());
        System.out.println(getByGpa());
        System.out.println(getByGpaReverse());
    }
}
