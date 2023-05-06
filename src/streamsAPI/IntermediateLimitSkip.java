package streamsAPI;

import java.util.Arrays;
import java.util.List;

public class IntermediateLimitSkip {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,2,3,4,5,6);

        //limit
        int sumFirstThree=list.stream().limit(3).reduce(0,(x,y)->x+y);
        System.out.println(sumFirstThree);
        //skip
        int sumLastThree=list.stream().skip(3).reduce(0,(x,y)->x+y);
        System.out.println(sumLastThree);
    }
}
