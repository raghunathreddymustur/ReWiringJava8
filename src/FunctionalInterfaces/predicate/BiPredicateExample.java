package FunctionalInterfaces.predicate;

import FunctionalInterfaces.model.Student;
import FunctionalInterfaces.model.StudentDataBase;

import java.util.List;
import java.util.function.BiPredicate;

public class BiPredicateExample {
    public static void main(String[] args) {
        // can pass two arguments for checkin two conditions
        List<Student> studentDataBase=StudentDataBase.getAllStudents();

        BiPredicate<String,Double> stringDoubleBiPredicate=(gender,gpa)->gender.equals("male") && gpa>=3.8;

        studentDataBase.forEach((student -> {
            if(stringDoubleBiPredicate.test(student.getGender(),student.getGpa()))
            {
                System.out.println(student);
            }
        }));
    }
}
