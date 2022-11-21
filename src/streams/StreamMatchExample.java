package streams;

import data.StudentDataBase;

public class StreamMatchExample {

    //returns true if any 1 ele matches predicate or false
    public static boolean anyMatch() {
        return StudentDataBase.getAllStudents().stream()
                .anyMatch(student -> student.getGradeLevel() >= 3.9);
    }

    //returns true if all ele's matches predicate or false
    public static boolean allMatch() {
        return StudentDataBase.getAllStudents().stream()
                .allMatch(student -> student.getGradeLevel() >= 3.9);
    }

    //returns true if none of ele's matches predicate or false(opp.to allMatch)
    public static boolean noneMatch() {
        return StudentDataBase.getAllStudents().stream()
                .noneMatch(student -> student.getGradeLevel() >= 3.9);
    }

    public static void main(String[] args) {
        System.out.println("anyMatch is: " + anyMatch());
        System.out.println("allMatch is: " + allMatch());
        System.out.println("noneMatch is: " + noneMatch());
    }
}
