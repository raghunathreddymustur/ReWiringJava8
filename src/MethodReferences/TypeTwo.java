package MethodReferences;

import java.util.function.BinaryOperator;

class Calculator
{
    static int mulitiply(int operandOne, int operandTwo)
    {
        return operandOne * operandTwo;
    }

}

// referencing to a static method of a class
public class TypeTwo {
    public static void main(String[] args) {
        BinaryOperator<Integer> binaryOperator=Calculator::mulitiply;
        System.out.println(binaryOperator.apply(2, 3));
    }
}
