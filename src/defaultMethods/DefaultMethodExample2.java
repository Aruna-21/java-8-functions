package defaultMethods;

import data.Student;
import data.StudentDataBase;

import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class DefaultMethodExample2 {
    static Consumer<Student> studentConsumer = (student -> System.out.println(student));
    static Comparator<Student> nameComparator=Comparator.comparing(Student::getName);
    static Comparator<Student> gradeComparator=Comparator.comparing(Student::getGradeLevel);


    public static void sortByName(List<Student> studentList){
        System.out.println("after sortByName");
        Comparator<Student> comparator=Comparator.comparing(Student::getName);
        studentList.sort(comparator);
        studentList.forEach(studentConsumer);
    }

    public static void sortByGpa(List<Student> studentList){
        System.out.println("after sortByGPA");
        Comparator<Student> comparator=Comparator.comparingDouble(Student::getGpa);
        studentList.sort(comparator);
        studentList.forEach(studentConsumer);
    }

    public static void comparatorChaining(List<Student> studentList){
        System.out.println("after comparatorChaining");
        studentList.sort(gradeComparator.thenComparing(nameComparator));
        studentList.forEach(studentConsumer);

    }

    public static void sortWithNullValues(List<Student> studentList){
        System.out.println("after sortWithNullValues");
        Comparator<Student> studentComparator=Comparator.nullsFirst(nameComparator);
        studentList.sort(studentComparator);
        studentList.forEach(studentConsumer);

    }
    public static void main(String[] args) {
        List<Student> studentList = StudentDataBase.getAllStudents();
        System.out.println("before sort");
        studentList.forEach(studentConsumer);
        sortByName(studentList);
        sortByGpa(studentList);
        comparatorChaining(studentList);
        sortWithNullValues(studentList);
    }
}
