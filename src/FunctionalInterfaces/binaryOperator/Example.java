package FunctionalInterfaces.binaryOperator;

import java.util.Comparator;
import java.util.function.BinaryOperator;

public class Example {
    public static void main(String[] args) {
        BinaryOperator<Integer> binaryOperator=(num,num2)->{
            return num+num2;
        };
        System.out.println(binaryOperator.apply(2, 3));
        Comparator<Integer> comparator=(a, b) -> a.compareTo(b);
        System.out.println(BinaryOperator.maxBy(comparator).apply(2, 3));
        System.out.println(BinaryOperator.minBy(comparator).apply(2, 3));
    }
}
