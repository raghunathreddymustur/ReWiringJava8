package FunctionalInterfaces.function;

import FunctionalInterfaces.model.Student;
import FunctionalInterfaces.model.StudentDataBase;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;

public class BiFunctionExample {
    public static void main(String[] args) {
        List<Student> studentList=StudentDataBase.getAllStudents();

        BiFunction<List<String>,String,String> biFunction=(names, section)->{
            StringBuilder stringBuilder=new StringBuilder();
            names.forEach((name)->{
                stringBuilder.append(name+": "+section);
            });
            return stringBuilder.toString();
        };

        Function<List<Student>,List<String>> listOfNames=(students)->{
            List<String> names=new ArrayList<>();
            students.forEach(student -> {
                names.add(student.getName());
            });
            return names;
        };

        System.out.println(biFunction.apply(listOfNames.apply(studentList), "Sec-12"));
    }

}
