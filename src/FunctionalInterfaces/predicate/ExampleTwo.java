package FunctionalInterfaces.predicate;

import FunctionalInterfaces.model.Student;
import FunctionalInterfaces.model.StudentDataBase;

import java.util.List;
import java.util.function.Predicate;

public class ExampleTwo {
    public static void main(String[] args) {
        List<Student> studentDataBase=StudentDataBase.getAllStudents();

        Predicate<Student> predicate1=(student)->student.getGpa()>=3.8;
        Predicate<Student> predicate2=(student)->student.getName().startsWith("J");

        ExampleTwo exampleTwo=new ExampleTwo();

        // Code reuse ability
        // Easy to change and maintain

        exampleTwo.filterStudentsWithGpaAndName(predicate1,predicate2,studentDataBase);

        exampleTwo.filterStudentsWithGpaOrName(predicate1,predicate2,studentDataBase);



    }

    void filterStudentsWithGpaAndName(Predicate<Student> p1, Predicate<Student> p2,List<Student> studentDataBase)
    {
        studentDataBase.forEach((student -> {
            if(p1.and(p2).test(student))
            {
                System.out.println("filterStudentsWithGpaAndName "+student);
            }
        }));
    }

    void filterStudentsWithGpaOrName(Predicate<Student> p1, Predicate<Student> p2,List<Student> studentDataBase)
    {
        studentDataBase.forEach((student -> {
            if(p1.or(p2).test(student))
            {
                System.out.println("filterStudentsWithGpaOrName "+student);
            }
        }));
    }
}
