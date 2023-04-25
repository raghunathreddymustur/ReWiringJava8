package MethodReferences;

import FunctionalInterfaces.model.Student;
import FunctionalInterfaces.model.StudentDataBase;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;


public class TypeThree {
    public static void main(String[] args) {
        List<Student> studentDataBase=StudentDataBase.getAllStudents();
        List<String> listOfNames=getStudentNames(studentDataBase,Student::getName);
        listOfNames.forEach((name)->{
            System.out.println(name);
        });
    }

    private static List<String> getStudentNames(List<Student> studentDataBase, Function<Student,String> fun) {
        List<String> stringList=new ArrayList<>();
        studentDataBase.forEach((student -> {
            stringList.add(fun.apply(student));
        }));
        return stringList;
    }



}
