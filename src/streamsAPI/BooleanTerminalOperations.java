package streamsAPI;

import FunctionalInterfaces.model.Student;
import FunctionalInterfaces.model.StudentDataBase;

import java.util.List;

public class BooleanTerminalOperations {
    public static void main(String[] args) {
        List<Student> studentList = StudentDataBase.getAllStudents();

        //allMatch
        System.out.println(studentList.stream().allMatch(student -> student.getGpa() > 1));

        //anyMatch
        System.out.println(studentList.stream().anyMatch(student -> student.getGpa() == 3.8));

        //noneMatch
        System.out.println(studentList.stream().noneMatch(student -> student.getGpa() == 3.8));
    }
}
