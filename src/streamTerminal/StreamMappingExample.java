package streamTerminal;

import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.Set;

import static java.util.stream.Collectors.*;

public class StreamMappingExample {
    public static void main(String[] args) {
        //gets names and collects data to a List
        List<String> nameList= StudentDataBase.getAllStudents()
                .stream()
                .collect(mapping(Student::getName,toList()));
        System.out.println("mapping using list:"+nameList);

        //gets names and collects data to a Set
        Set<String> nameSet= StudentDataBase.getAllStudents()
                .stream()
                .collect(mapping(Student::getName,toSet()));
        System.out.println("mapping using set:"+nameSet);
    }
}
