package streamsAPI;

import FunctionalInterfaces.model.Student;
import FunctionalInterfaces.model.StudentDataBase;

import java.util.List;
import java.util.stream.Collectors;

public class MapExample {
    public static void main(String[] args) {
        List<String> listofStudentNamesUppercase=StudentDataBase.getAllStudents().stream().
                map(Student::getName).
                map(String::toUpperCase).
                filter((name)->name.length()>4).
                collect(Collectors.toList());

        listofStudentNamesUppercase.forEach(System.out::println);
    }
}
