package streamsAPI;

import FunctionalInterfaces.model.Student;
import FunctionalInterfaces.model.StudentDataBase;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class IntermediateOperations {
    public static void main(String[] args) {

//        //distinct
//        List<String> studentActivities =StudentDataBase.getAllStudents(). //List<Student>
//                stream(). // Stream<Student>
//                map(Student::getActivities). // Stream<List<String>>
//                flatMap(List::stream) // Stream<String>
//                .distinct() // Stream<String> removes duplicates
//                .collect(Collectors.toList()); // List<String>
//        System.out.println(studentActivities);
//
//        //count
//        long noStudentActivities =StudentDataBase.getAllStudents(). //List<Student>
//                stream(). // Stream<Student>
//                map(Student::getActivities). // Stream<List<String>>
//                flatMap(List::stream) // Stream<String>
//                .count(); // List<String>
//        System.out.println(noStudentActivities);
//
//        // sorted - default natural sorting order
//        List<String> distinctSortedStudentActivities =StudentDataBase.getAllStudents(). //List<Student>
//                stream(). // Stream<Student>
//                map(Student::getActivities). // Stream<List<String>>
//                flatMap(List::stream) // Stream<String>
//                .distinct() // Stream<String> removes duplicates
//                .sorted()
//                .collect(Collectors.toList()); // List<String>
//        System.out.println(distinctSortedStudentActivities);

//        //sorted - custom sorting by implementing Comparator Interface
//        List<Student> sortByName =StudentDataBase.getAllStudents(). //List<Student>
//                stream(). // Stream<Student>
//                sorted(Comparator.comparing(Student::getName)) // Stream<Student> sorted
//                .collect(Collectors.toList()); // List<Student>
//        sortByName.forEach(System.out::println);

        // sorted - Reversed
        List<Student> sortByNameReverse =StudentDataBase.getAllStudents(). //List<Student>
                stream(). // Stream<Student>
                sorted(Comparator.comparing(Student::getName).reversed()) // Stream<Student> sorted
                .collect(Collectors.toList()); // List<Student>
        sortByNameReverse.forEach(System.out::println);

    }
}
