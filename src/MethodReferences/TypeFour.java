package MethodReferences;

import FunctionalInterfaces.model.Student;

import java.util.function.Function;
import java.util.function.Supplier;

public class TypeFour {
    public static void main(String[] args) {
        // Empty Constructor method reference
        Supplier<Student> studentSupplier=Student::new;
        System.out.println(studentSupplier.get());

        //Parameterized constructor method reference
        Function<String,Student> studentSupplier1=Student::new;
        System.out.println(studentSupplier1.apply("Raghu"));

    }
}
