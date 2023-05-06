package streamsAPI;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class BoxUnBox {
    public static void main(String[] args) {
        List<Integer> wrapperInteger= IntStream.range(1,10).boxed().collect(Collectors.toList());
        System.out.println(wrapperInteger.stream().mapToInt(Integer::intValue).sum());
        System.out.println(wrapperInteger.stream().mapToLong(i->i).sum());
        System.out.println(wrapperInteger.stream().mapToDouble(i->i).sum());
        System.out.println(IntStream.range(1,10).mapToObj(i->{return new Integer(i);}).collect(Collectors.toList()));
    }
}
