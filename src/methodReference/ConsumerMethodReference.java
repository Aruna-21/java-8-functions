package methodReference;

import data.Student;
import data.StudentDataBase;

import java.util.function.Consumer;

public class ConsumerMethodReference {

    static Consumer<Student> consumer = System.out::println;
    static Consumer<Student> c1 = Student::printAllActivities;

    public static void main(String[] args) {
        StudentDataBase.getAllStudents().forEach(consumer);
        StudentDataBase.getAllStudents().forEach(c1);
    }
}
