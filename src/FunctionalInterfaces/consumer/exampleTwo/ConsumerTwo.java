package FunctionalInterfaces.consumer.exampleTwo;

import FunctionalInterfaces.model.Student;
import FunctionalInterfaces.model.StudentDataBase;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerTwo {
    public static void main(String[] args) {
        List<Student> studentList= StudentDataBase.getAllStudents();

        // ForEach method with Functional interface from java 8
        //forEach will call apply method on every element of list
        System.out.println("Enchanced forEach loop");
        studentList.forEach((student -> System.out.println(student)));

        //Chaining of Consumers
        System.out.println("Chaining of Consumers");
        Consumer<Student> studentListNames=(student)->System.out.print(student.getName());
        Consumer<Student> studentListActivities=(student)->System.out.println(student.getActivities());

        studentList.forEach(studentListNames.andThen(studentListActivities));

        //Reusing Consumer for different use
        System.out.println("Reusing the consumers");
        studentList.forEach((student)->{
            if(student.getGpa()>=3.8)
            {
                studentListNames.andThen(studentListActivities).accept(student);
            }
        });
    }
}
