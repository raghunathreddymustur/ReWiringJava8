package streamsAPI;

import FunctionalInterfaces.model.Student;
import FunctionalInterfaces.model.StudentDataBase;

import java.util.*;
import java.util.stream.Collectors;

public class MoreTerminalOperations {
    public static void main(String[] args) {
        //variation 1
        System.out.println(StudentDataBase.getAllStudents().stream().map(Student::getName)
                .collect(Collectors.joining()));
        //variation 2
        System.out.println(StudentDataBase.getAllStudents().stream().map(Student::getName)
                .collect(Collectors.joining("-")));
        //variation 3
        System.out.println(StudentDataBase.getAllStudents().stream().map(Student::getName)
                .collect(Collectors.joining("-","{","}")));

        System.out.println(StudentDataBase.getAllStudents().stream().
                filter(student -> student.getGpa() > 3.8)
                .collect(Collectors.counting()));

        System.out.println(StudentDataBase.getAllStudents().stream()
                .collect(Collectors.mapping(Student::getName, Collectors.toList())));

        System.out.println(StudentDataBase.getAllStudents()
                .stream()
                .collect(Collectors.minBy(Comparator.comparing(Student::getGpa)))
                .get());
        System.out.println(StudentDataBase.getAllStudents()
                .stream()
                .collect(Collectors.maxBy(Comparator.comparing(Student::getGpa)))
                .get());

        System.out.println(StudentDataBase.getAllStudents().stream()
                .collect(Collectors.summarizingInt(Student::getGradeLevel)));

        System.out.println(StudentDataBase.getAllStudents().stream()
                .collect(Collectors.averagingInt(Student::getGradeLevel)));

        System.out.println(StudentDataBase.getAllStudents().stream()
                .collect(Collectors.groupingBy(student -> student.getGpa()>3.8?"Outstanding":"average")));

        System.out.println(StudentDataBase.getAllStudents().stream()
                .collect(Collectors.
                        groupingBy(student -> student.getGpa()>3.8?"Outstanding":"average",
                                Collectors.groupingBy(Student::getGradeLevel))));

        System.out.println(StudentDataBase.getAllStudents().stream()
                .collect(Collectors.
                        groupingBy(student -> student.getGpa()>3.8?"Outstanding":"average",
                                Collectors.summingInt(Student::getGradeLevel))));

        Map<Integer, List<Student>> res=StudentDataBase.getAllStudents()
            .stream()
            .collect(Collectors.groupingBy(Student::getGradeLevel, LinkedHashMap::new, Collectors.toList()));
        System.out.println(res);

        System.out.println(StudentDataBase.getAllStudents()
                .stream()
                .collect(Collectors.groupingBy(Student::getGradeLevel,
                        Collectors.collectingAndThen(Collectors.minBy(Comparator.comparing(Student::getGpa)),
                                Optional::get))));

        System.out.println(StudentDataBase.getAllStudents().stream()
                .collect(Collectors.partitioningBy(student -> student.getGpa() > 3.8)));

        System.out.println(StudentDataBase.getAllStudents().stream()
                .collect(Collectors.partitioningBy(student -> student.getGpa() > 3.8,Collectors.toSet())));
    }
}
