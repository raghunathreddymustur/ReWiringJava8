package FunctionalInterfaces.consumer.biConsumer;

import FunctionalInterfaces.model.Student;
import FunctionalInterfaces.model.StudentDataBase;

import java.util.List;
import java.util.function.BiConsumer;

public class BiConsumerExample {
    public static void main(String[] args) {
        List<Student> studentList = StudentDataBase.getAllStudents();
        BiConsumer<String,List<String>> biConsumer=(studentName, studentActivities) ->{
            System.out.println(studentName+" "+studentActivities);
        };

        // Instead of writing two consumer and using chaining we use BiConsumer to achieve that
        studentList.forEach((student -> biConsumer.accept(student.getName(),student.getActivities())));

    }
}
