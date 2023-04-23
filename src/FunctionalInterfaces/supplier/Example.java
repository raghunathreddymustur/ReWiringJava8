package FunctionalInterfaces.supplier;

import FunctionalInterfaces.model.Student;
import FunctionalInterfaces.model.StudentDataBase;

import java.util.List;
import java.util.function.Supplier;

public class Example {
    public static void main(String[] args) {
        Supplier<List<Student>> supplier=()-> StudentDataBase.getAllStudents();

        System.out.println(supplier.get());
    }
}
