package functionalInterface;

import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class PredicateConsumerExample {

    Predicate<Student> p1=(s1)->s1.getGradeLevel()>=3;
    Predicate<Student> p2=(s2)-> s2.getGpa()>=3.9;

    BiConsumer<String, List<String>> biConsumer=(name,activities)-> System.out.println(name +":"+activities);
    Consumer<Student> consumer = (student->{
        if(p1.and(p2).test(student)) {
            biConsumer.accept(student.getName(), student.getActivities());
        }
    });

    public void printDetails(List<Student> studentList){
        studentList.forEach(consumer);
    }

    public static void main(String[] args) {
        List<Student> studentList= StudentDataBase.getAllStudents();
        new PredicateConsumerExample().printDetails(studentList);
    }
}
