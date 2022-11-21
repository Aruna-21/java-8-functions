package streams;

import data.Student;
import data.StudentDataBase;

import java.util.Optional;

public class StreamFindAnyFirstExample {

    //finds any ele in list of students based on condition
    public static Optional<Student> findAny() {
        return StudentDataBase.getAllStudents().stream()
                .filter(student -> student.getGpa() >= 3.9)
                .findAny();
    }

    //finds first ele in list of students based on condition
    public static Optional<Student> findFirst() {
        return StudentDataBase.getAllStudents().stream()
                .filter(student -> student.getGpa() >= 3.9)
                .findFirst();
    }

    public static void main(String[] args) {
        Optional<Student> findAnyStudent = findAny();
        if (findAnyStudent.isPresent()) {
            System.out.println("findAnyStudent :" + findAnyStudent.get());
        }
        Optional<Student> findFirstStudent = findFirst();
        if (findFirstStudent.isPresent()) {
            System.out.println("findAnyStudent :" + findFirstStudent.get());
        }
    }
}
