package streamTerminal;

import data.Student;
import data.StudentDataBase;

import java.util.stream.Collectors;

public class StreamJoiningExample {

    //joining is used to perform concatenation of names
    public static String joining1() {
        return StudentDataBase.getAllStudents().stream()
                .map(Student::getName)
                .collect(Collectors.joining());
    }

    //joining is used to perform concatenation of names and separates by "-"
    public static String joining2() {
        return StudentDataBase.getAllStudents().stream()
                .map(Student::getName)
                .collect(Collectors.joining("-"));
    }

    //joining is used to perform concatenation of names,separates by "-" and starts with "{" and ends with "}"
    public static String joining3() {
        return StudentDataBase.getAllStudents().stream()
                .map(Student::getName)
                .collect(Collectors.joining("-","{","}"));
    }

    public static void main(String[] args) {
        System.out.println("joining_1 :" + joining1());
        System.out.println("joining_2 :" + joining2());
        System.out.println("joining_3 :" + joining3());
    }
}
