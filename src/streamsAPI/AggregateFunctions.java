package streamsAPI;

import java.util.OptionalDouble;
import java.util.OptionalLong;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class AggregateFunctions {
    public static void main(String[] args) {
        System.out.println(IntStream.range(1, 12).sum());
        OptionalLong maxVal = LongStream.rangeClosed(1, 23).max();
        System.out.println(maxVal.isPresent()?maxVal.getAsLong():"No val");
        OptionalDouble minVal = IntStream.range(1, 12).asDoubleStream().min();
        System.out.println(minVal.isPresent()?minVal.getAsDouble():"No Val");
        OptionalDouble avgVal = LongStream.rangeClosed(1, 23).average();
        System.out.println(avgVal.isPresent()?avgVal.getAsDouble():"No Val");
    }
}
