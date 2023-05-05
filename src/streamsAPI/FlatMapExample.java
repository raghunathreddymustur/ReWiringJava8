package streamsAPI;

import FunctionalInterfaces.model.Student;
import FunctionalInterfaces.model.StudentDataBase;

import java.util.List;
import java.util.stream.Collectors;

public class FlatMapExample {
    public static void main(String[] args) {
        List<String> studentActivities =StudentDataBase.getAllStudents(). //List<Student>
                stream(). // Stream<Student>
                map(Student::getActivities). // Stream<List<String>>
                flatMap(List::stream) // Stream<String>
                .collect(Collectors.toList()); // List<String>
        System.out.println(studentActivities);
    }
}
