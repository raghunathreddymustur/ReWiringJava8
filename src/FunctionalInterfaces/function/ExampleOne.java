package FunctionalInterfaces.function;

import FunctionalInterfaces.model.Student;
import FunctionalInterfaces.model.StudentDataBase;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

public class ExampleOne {
    public static void main(String[] args) {
        List<Student> studentList= StudentDataBase.getAllStudents();

        Function<List<Student>, Map<String,Double>> listMapFunction=(students -> {
           Map<String,Double> stringDoubleMap=new HashMap<>();
           students.forEach(
                   (student)->
                   {
                       stringDoubleMap.put(student.getName(),student.getGpa());
                   }
           );
           return  stringDoubleMap;
        });

        Function<Map<String,Double>,List<String>> mapListFunction =(mapOfStudents->{
            List<String> list=new ArrayList<>();
            mapOfStudents.forEach((name,gpa)->{
                list.add(name+" : "+gpa);
            });
            return list;
        });

        //chaining
        listMapFunction.andThen(mapListFunction).apply(studentList).forEach((student)->{
            System.out.println(student);
        });

        Function<String,String> stringStringFunction=name-> name.toUpperCase();
        Function<String,String> stringStringFunction2=name-> name.toLowerCase();

        System.out.println("Compose "+stringStringFunction.compose(stringStringFunction2).apply("Raghu"));
        System.out.println("addThen "+stringStringFunction.andThen(stringStringFunction2).apply("Raghu"));

    }



}
