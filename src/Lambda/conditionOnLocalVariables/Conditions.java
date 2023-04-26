package Lambda.conditionOnLocalVariables;

import java.util.function.Function;

public class Conditions {
    public static void main(String[] args) {
        int a=10;
        //Function<Integer,Integer> function=(a)->a*2;  re declaring - Not allowed

//        Function<Integer,Integer> function=(a)-> { re declaring- Not allowed
//            int a =20;
//        };

//        Function<Integer,Integer> function=(num)-> {
//            int b=a++; // Not allowed
//        };

//        Function<Integer,Integer> function=(num)-> {
//            int b=10;
//            num=b*a;
//            return num;
//        };
//
//        a++; // Not allowed since a is being used in lambda

        Function<Integer,Integer> function=(num)-> {
            return num*a; //here a is effective final
        };


    }
}
