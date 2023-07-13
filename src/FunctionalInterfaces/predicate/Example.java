package FunctionalInterfaces.predicate;

import java.util.function.Predicate;

public class Example {
    public static void main(String[] args) {

        // Define Once - Use it as many times needed
        Predicate<String> predicate=(str)->str.length()==5;
        Predicate<String> predicate1=(str)->str.startsWith("R");
        Predicate<String> predicate2=(str)->str.startsWith("R");

        System.out.println(Predicate.isEqual(predicate1));

        System.out.println(predicate.test("Test "+"Raghu"));

        //And
        System.out.println("And "+predicate.and(predicate1).test("Raghu"));

        //Or
        System.out.println("Or "+predicate.or(predicate1).test("Ragu"));

        //Negate
        System.out.println("Negate "+ predicate.and(predicate1).negate().test("Ragu"));


        //
    }
}
