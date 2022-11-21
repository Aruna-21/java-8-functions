package Optional;

import data.Student;
import data.StudentDataBase;

import java.util.Optional;

public class OptionalOrElseExample {

    //returns student name if present or else returns default
    public static String orElse() {
        // Optional<Student> stringOptional=Optional.ofNullable(StudentDataBase.studentSupplier.get());//Adam
        Optional<Student> stringOptional = Optional.ofNullable(null);//default

        String name = stringOptional.map(Student::getName).orElse("default");
        return name;
    }

    //returns student name if present or else returns value of supplier
    public static String orElseGet() {
        Optional<Student> stringOptional = Optional.ofNullable(StudentDataBase.studentSupplier.get());//Adam

        String name = stringOptional.map(Student::getName).orElseGet(()->"default");
        return name;
    }

    //returns student name if present or else throws specified exception
    public static String orElseThrow() {
        Optional<Student> stringOptional = Optional.ofNullable(StudentDataBase.studentSupplier.get());//Adam

        String name = stringOptional.map(Student::getName).orElseThrow(()->new RuntimeException("no data available"));
        return name;
    }

    public static void main(String[] args) {

        System.out.println("Using orElse() :" + orElse());
        System.out.println("Using orElseGet() :" + orElseGet());
        System.out.println("Using orElseThrow() :" + orElseThrow());
    }
}
