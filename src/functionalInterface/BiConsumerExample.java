package functionalInterface;

import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.function.BiConsumer;

public class BiConsumerExample {
    public static void main(String[] args) {

        //get list of all students
        BiConsumer<String, String> b3 = (name, gender) -> {
            System.out.println("name:" + name + " gender:" + gender);
        };
        List<Student> student = StudentDataBase.getAllStudents();
        student.forEach((students) -> b3.accept(students.getName(), students.getGender()));


        //print two strings
        BiConsumer<String, String> biConsumer = (a, b) -> {
            System.out.println("a=" + a + "b=" + b);
        };
        biConsumer.accept("java7", "java8");

        //multiply 2 no's
        BiConsumer<Integer, Integer> b1 = (a, b) -> {
            System.out.println("mulptiplication:" + (a * b));
        };

        //divide 2 no's
        BiConsumer<Integer, Integer> b2 = (a, b) -> {
            System.out.println("division:" + (a / b));
        };
        b1.andThen(b2).accept(10, 2);
    }
}
