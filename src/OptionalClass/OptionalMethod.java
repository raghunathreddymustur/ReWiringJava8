package OptionalClass;

import FunctionalInterfaces.model.Student;
import FunctionalInterfaces.model.StudentDataBase;

import java.util.Optional;

public class OptionalMethod {
    public static void main(String[] args) {
        //ofNullable
        Optional<String >  ofNullableExample=Optional.ofNullable("Raghu");
        System.out.println(ofNullableExample);

        Optional<String >  ofNullableNullExample=Optional.ofNullable(null);
        System.out.println(ofNullableNullExample.isPresent()?ofNullableNullExample.get():ofNullableNullExample);

        //of
        Optional<String >  ofExample=Optional.of("Raghu");
        System.out.println(ofExample);

//        Optional<String >  ofExampleNull=Optional.of(null);
//        System.out.println(ofExampleNull); // throws null pointer exception

        //empty
        System.out.println(Optional.empty());


        //orElse
        Optional<Student> studentOptional= Optional.ofNullable(StudentDataBase.getAllStudents().get(1));
        System.out.println(studentOptional.map(Student::getName).orElse("Default"));

        Optional<Student> studentOptionalNull= Optional.ofNullable(null);
        System.out.println(studentOptionalNull.map(Student::getName).orElse("Default"));

        //orElseGet
        Optional<Student> studentOptionalGetNull= Optional.ofNullable(null);
        System.out.println(studentOptionalGetNull.map(Student::getGradeLevel).orElseGet(()->1*3));

        //orElseGet
//        Optional<Student> studentOptionalThrowNull= Optional.ofNullable(null);
//        System.out.println(studentOptionalGetNull.map(Student::getGradeLevel).orElseThrow(()->new IllegalArgumentException()));

        //ifPresent
        Optional<Student> studentOptionalFirst= Optional.ofNullable(StudentDataBase.getAllStudents().get(1));
        studentOptionalFirst.map(Student::getName).ifPresent((s)->System.out.println(s));

        //filter & map
        Optional<Student> studentOptionalFilter= Optional.ofNullable(StudentDataBase.getAllStudents().get(1));
        studentOptionalFilter.filter(student -> student.getGpa()>3.0).map(Student::getName).ifPresent((s)->System.out.println(s));

    }
}
