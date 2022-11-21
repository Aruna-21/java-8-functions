package Optional;

import data.Student;
import data.StudentDataBase;

import java.util.Optional;

public class OptionalExample {

    //gives student names without optional
    public static String getstudentName() {
        Student student = StudentDataBase.studentSupplier.get();
        //Student student = null;
        if (student != null) {
            return student.getName();
        }
        return null;
    }

    //gives student names with optional
    public static Optional<String> getNameUsingOptional() {
        Optional<Student> studentOptional = Optional.ofNullable(StudentDataBase.studentSupplier.get());
        if (studentOptional != null) {
            return studentOptional.map(Student::getName);
        }
        return Optional.empty();
    }

    public static void main(String[] args) {
//        String name = getstudentName();
//        if (name != null)
//            System.out.println("length of name :" + getstudentName().length());
//        else
//            System.out.println("name not found");
        Optional<String> stringOptional = getNameUsingOptional();
        if (stringOptional.isPresent()) {
            System.out.println("length of name :" + stringOptional.get().length());
        } else
            System.out.println("name not found");
    }

}
