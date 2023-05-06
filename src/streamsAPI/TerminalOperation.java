package streamsAPI;

import FunctionalInterfaces.model.Student;
import FunctionalInterfaces.model.StudentDataBase;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class TerminalOperation {
    public static void main(String[] args) {

//        //type1 Identity, Accumulator
//        List<Integer> list= Arrays.asList(1,2,3);
//        int multiVal=list.stream().reduce(1,(op1,op2)->op1*op2);
//        System.out.println(multiVal);
//
        //type 2 Identity, accumulator, combiner
        //when there's a mismatch between the types of the accumulator arguments and the types of the accumulator implementation
        List<Student> studentList= StudentDataBase.getAllStudents();
        Double val=studentList.stream().reduce(0.0,(gpa,grade)->grade.getGradeLevel()+ gpa,Double::sum);
        System.out.println(val);

        ///When a stream executes in parallel, the Java runtime splits the stream into multiple sub-streams.
        //In such cases, we need to use a function to combine the results of the sub-streams into a single one.
        // This is the role of the combiner
        List<Integer> list= Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        int valParallel= list.parallelStream().reduce(0,(op1,op2)->op1+op2,Integer::sum);
        System.out.println(valParallel);

        //  Type 0 - Only accumulator, return Optional<Integer>
        List<Integer> firstTen= Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        List<Integer> empty= new ArrayList<>();
        Optional<Integer> maxVal= empty.parallelStream().reduce((x, y)->x>y?x:y);
        if(maxVal.isPresent())
        {
            System.out.println(maxVal.get());
        }else{
            System.out.println("No Value Found");
        }



    }
}
