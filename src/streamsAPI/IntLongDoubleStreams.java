package streamsAPI;

import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class IntLongDoubleStreams {
    public static void main(String[] args) {

        IntStream.range(1,5).forEach(System.out::println);
        LongStream.rangeClosed(1,5).forEach(System.out::println);
        IntStream.range(1,5).asDoubleStream().forEach(System.out::println);
    }
}
