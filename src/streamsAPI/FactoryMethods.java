package streamsAPI;

import java.util.Random;
import java.util.stream.Stream;

public class FactoryMethods {
    public static void main(String[] args) {

        //of
        Stream<String> movies = Stream.of("HUNT","CRIME SCENE","CASE U");
        movies.forEach(System.out::println);

        //iterate
        Stream.iterate(1,x->x+2).limit(10).forEach(System.out::println);

        //generate
        Stream.generate(new Random()::nextInt).limit(10).forEach(System.out::println);
    }
}
