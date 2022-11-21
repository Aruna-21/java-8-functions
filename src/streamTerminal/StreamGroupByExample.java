package streamTerminal;

import data.Student;
import data.StudentDataBase;

import java.util.*;

import static java.util.stream.Collectors.*;

public class StreamGroupByExample {

    //grouping all students by gender
    public static void groupByGender() {
        Map<String, List<Student>> stringListMap = StudentDataBase.getAllStudents()
                .stream()
                .collect(groupingBy(Student::getGender));
        System.out.println(stringListMap);
    }

    //grouping students based on gpa condition
    public static void customisedGrouping() {
        Map<String, List<Student>> stringListMap = StudentDataBase.getAllStudents()
                .stream()
                .collect(groupingBy(student -> student.getGpa() > 3.8 ? "Outstanding" : "average"));
        System.out.println(stringListMap);
    }

    //grouping students based on gpa condition and gives gradelevel as key
    public static void twoLevelGrouping() {
        Map<Integer, Map<String, List<Student>>> stringListMap = StudentDataBase.getAllStudents()
                .stream()
                .collect(groupingBy(Student::getGradeLevel,
                        groupingBy(student -> student.getGpa() > 3.8 ? "Outstanding" : "average")));
        System.out.println(stringListMap);
    }

    //grouping students by names and returning as set of students
    public static void threeLevelGrouping() {
        LinkedHashMap<String, Set<Student>> studentHashMap=StudentDataBase.getAllStudents()
                .stream()
                .collect(groupingBy(Student::getName,LinkedHashMap::new,toSet()));
        System.out.println(studentHashMap);
    }

    //using grouping to find first maximum gpa and gets gradelevel
    public static void calculateMaxGpa(){
        Map<Integer, Optional<Student>> studentOptionalMap=StudentDataBase.getAllStudents()
                .stream()
                .collect(groupingBy(Student::getGradeLevel,
                        maxBy(Comparator.comparing(Student::getGpa))));
        System.out.println(studentOptionalMap);
    }

    //using grouping to find first minimum gpa and gets gradelevel
    public static void calculateMinGpa(){
        Map<Integer, Optional<Student>> studentOptionalMap=StudentDataBase.getAllStudents()
                .stream()
                .collect(groupingBy(Student::getGradeLevel,
                        minBy(Comparator.comparing(Student::getGpa))));
        System.out.println(studentOptionalMap);
    }

    public static void main(String[] args) {
        groupByGender();
        customisedGrouping();
        twoLevelGrouping();
        threeLevelGrouping();
        calculateMaxGpa();
        calculateMinGpa();
    }
}
