package Lambda;

import java.util.Comparator;

public class ComparatorInterfaceExample {
    public static void main(String[] args) {

        //Prior to Java 8 -- using Anonymous Methods
        Comparator<Integer> integerComparator=new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return  o1.compareTo(o2);
            }
        };

        //Java 8 -- using Lambda
        Comparator<Integer> integerComparator1 =(Integer o1,Integer o2)->o1.compareTo(o2);

        // Dropping Input parameter types - we can drop the types of parameters if compiler is able to resolve them
        Comparator<Integer> integerComparator2 =(o1,o2)->o1.compareTo(o2);


    }
}
