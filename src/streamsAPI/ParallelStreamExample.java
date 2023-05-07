package streamsAPI;

import java.util.function.Supplier;
import java.util.stream.IntStream;

public class ParallelStreamExample {
    public static void main(String[] args) {
        System.out.print("Parallel ");
        calTime(ParallelStreamExample::sumParallel,10000);
        System.out.print("Sequential ");
        calTime(ParallelStreamExample::sumSeq,10000);
    }
    public static void calTime(Supplier<Integer> supplier,int iterations)
    {
        long startTime = System.currentTimeMillis();
        for(int i=0;i<iterations;i++)
        {
            supplier.get();
        }
        System.out.println("TotalTime "+ (System.currentTimeMillis()-startTime));
    }
    public static int sumSeq()
    {
        return IntStream.rangeClosed(1, 15693678).sum();
    }
    public static int sumParallel()
    {
        return IntStream.rangeClosed(1, 15693678).parallel().sum();
    }
}
