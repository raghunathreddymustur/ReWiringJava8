package FunctionalInterfaces.unaryOperator;

import java.util.function.UnaryOperator;

public class Example {
    public static void main(String[] args) {
        UnaryOperator<String> stringUnaryOperator=name->name.toUpperCase();
        System.out.println(stringUnaryOperator.apply("Raghu"));

    }
}
