package streamsAPI;

import FunctionalInterfaces.model.Student;
import FunctionalInterfaces.model.StudentDataBase;

import java.util.List;

public class FindTerminalOperations {
    public static void main(String[] args) {
        List<Student> studentList = StudentDataBase.getAllStudents();

        //findAny
        System.out.println(studentList.stream()
                .peek(student -> {System.out.println(student);})
                .filter(student -> student.getGpa() > 3.8).findAny());
        //findFirst
        System.out.println(studentList.stream()
                .peek(student -> {System.out.println(student);})
                .filter(student -> student.getGpa() > 3.8).findFirst());

    }
}
