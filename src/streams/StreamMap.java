package streams;

import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamMap {
    //using map() in List
    public static List<String> nameList() {
        List<String> studentList = StudentDataBase.getAllStudents().stream()
                .map(Student::getName)
                .collect(Collectors.toList());
        return studentList;
    }
    //using map() in Set
    public static Set<String> nameSet() {
        Set<String> studentList = StudentDataBase.getAllStudents().stream()
                .map(Student::getName)
                .collect(Collectors.toSet());
        return studentList;
    }

    public static void main(String[] args) {
        System.out.println(nameList());
        System.out.println(nameSet());
    }
}
