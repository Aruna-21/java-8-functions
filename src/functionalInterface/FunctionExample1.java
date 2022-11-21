package functionalInterface;

import data.Student;
import data.StudentDataBase;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

public class FunctionExample1 {

    static Function<List<Student>, Map<String,Double>> f1=(students)->{
        Map<String,Double> studentGrade=new HashMap<>();
        students.forEach((student ->{
            studentGrade.put(student.getName(), student.getGpa());
        }));
        return studentGrade;
    };

    public static void main(String[] args) {
        System.out.println(f1.apply(StudentDataBase.getAllStudents()));
    }
}
