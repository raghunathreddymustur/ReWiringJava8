package ImparativeDeclarative;

import java.util.stream.IntStream;

public class ExampleOne {
    public static void main(String[] args) {

        // Imperative way of writing code
        int sum=0;
        for(int i=0;i<=100;i++)
        {
            sum=sum+i;
        }
        System.out.println("Imperative sum "+ sum);

        // Declarative way of writing code with java 8
        int sumOfFirstHundered= IntStream.rangeClosed(0,100).sum();

        System.out.println("Declarative Way "+sumOfFirstHundered);
    }
}
