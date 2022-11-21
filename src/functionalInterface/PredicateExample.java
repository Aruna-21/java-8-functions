package functionalInterface;

import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.function.Predicate;

public class PredicateExample {
    static Predicate<Student> p1 = (s1) ->
            s1.getGradeLevel() >= 3;
    static Predicate<Student> p2 = (s1) ->
            s1.getGpa() >= 3.9;
    //prints list of students whose gradelevel is greater than 3
    public static void findbyGradeLevel() {
        System.out.println("findbyGradeLevel :");
        List<Student> students = StudentDataBase.getAllStudents();
        students.forEach((student -> {
            if (p1.test(student)) {
                System.out.println(student);
            }
        }));
    }
    //prints list of students whose gpa is greater than 3.9

    public static void findbyGpa() {
        System.out.println("findbyGpa :");
        List<Student> students = StudentDataBase.getAllStudents();
        students.forEach((student -> {
            if (p2.test(student)) {
                System.out.println(student);
            }
        }));
    }
    //prints list of students whose gradelevel is greater than 3 and gpa greater than 3.9

    public static void findbyGradeLevelandGpa() {
        System.out.println("findbyGradeLevelandGpa :");
        List<Student> students = StudentDataBase.getAllStudents();
        students.forEach((student -> {
            if (p1.and(p2).test(student)) {
                System.out.println(student);
            }
        }));
    }
    //prints list of students whose gradelevel is greater than 3 or gpa greater than 3.9

    public static void findbyGradeLevelorGpa() {
        System.out.println("findbyGradeLevelorGpa :");
        List<Student> students = StudentDataBase.getAllStudents();
        students.forEach((student -> {
            if (p1.or(p2).test(student)) {
                System.out.println(student);
            }
        }));
    }

    public static void main(String[] args) {
        findbyGradeLevel();
        findbyGpa();
        findbyGradeLevelandGpa();
        findbyGradeLevelorGpa();
    }
}