package streams;

import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.stream.Collectors;

public class StreamFilter {
//stream using filter-> filter uses predicate as input
    public static List<Student> filterStudent(){
        return StudentDataBase.getAllStudents().stream()
                .filter(student -> student.getGender().equals("female"))
                .collect(Collectors.toList());
    }
    public static void main(String[] args) {
        System.out.println(filterStudent());
    }
}
