package functionalInterface;

import data.Student;
import data.StudentDataBase;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {

    //prints list of students
    public static void printStudents(){
        Consumer<Student> consumer = (student) -> System.out.println(student);
        List<Student> studentList = StudentDataBase.getAllStudents();
        studentList.forEach(consumer);
    }

    //prints name and activities
    public static void printNameAndActivities(){
        Consumer<Student> c1 = (student -> System.out.println(student.getName()));
        Consumer<Student> c2 = (student -> System.out.println(student.getActivities()));
        List<Student> studentList = StudentDataBase.getAllStudents();
        studentList.forEach(c1.andThen(c2));
    }

    //prints name and activities

    public static void printNameAndActivitiesusingcondition() {
        System.out.println("printNameAndActivitiesusingcondition");
        Consumer<Student> c3 = (student -> System.out.println(student.getName()));
        Consumer<Student> c4 = (student -> System.out.println(student.getActivities()));
        List<Student> studentList = StudentDataBase.getAllStudents();
        studentList.forEach((student -> {
            if(student.getGradeLevel()>=3 && student.getGpa()>=3.9) {
                c3.andThen(c4).accept(student);
            }
        }));

    }
        public static void main(String[] args) {

        Consumer<String> c1= (s) -> System.out.println(s.toUpperCase());
        c1.accept("java");
        printStudents();
        printNameAndActivities();
        printNameAndActivitiesusingcondition();
    }
}
