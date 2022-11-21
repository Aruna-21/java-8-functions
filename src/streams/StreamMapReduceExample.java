package streams;

import data.Student;
import data.StudentDataBase;

public class StreamMapReduceExample {

    //using map and reduce to reduce contents of stream to single value
    public static int noofNotebooks() {
        int noOfbooks = StudentDataBase.getAllStudents().stream()
                .filter(student -> student.getGradeLevel()>=3)
                .map(Student::getNotebook)
                .reduce(0, (a, b) -> a + b);
        return noOfbooks;
    }

    public static void main(String[] args) {
        System.out.println("total no of books:"+noofNotebooks());
    }
}
