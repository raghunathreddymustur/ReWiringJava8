package FunctionalInterfaces.consumer;

import java.util.Locale;
import java.util.function.Consumer;

public class ConsumerExample {
    public static void main(String[] args) {
        Consumer<String> consumer=(input)->System.out.println(input.toUpperCase());
        consumer.accept("Raghu");
    }
}
