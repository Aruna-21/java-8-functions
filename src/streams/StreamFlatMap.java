package streams;

import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.stream.Collectors;

public class StreamFlatMap {

    //using flatmap to convert list of string to string
    public static List<String> getActivities() {
        List<String> StudentList = StudentDataBase.getAllStudents().stream()
                .map(Student::getActivities)
                .flatMap(List::stream)
                .distinct()//removes duplicates
                .sorted()//ascending to descending
                .collect(Collectors.toList());
        return StudentList;
    }

    public static long numberofActivities() {
        long noOfActivities = StudentDataBase.getAllStudents().stream()
                .map(Student::getActivities)
                .flatMap(List::stream)
                .distinct() //removes duplicates
                .count(); //total number of activities
        return noOfActivities;
    }

    public static void main(String[] args) {
        System.out.println(getActivities());
        System.out.println(numberofActivities());
    }
}
