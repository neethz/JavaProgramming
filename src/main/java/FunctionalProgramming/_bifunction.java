package FunctionalProgramming;

import java.util.function.BiFunction;
import java.util.function.Function;

public class _bifunction {
    public static void main(String[] args) {
        System.out.println(incrementAndMultiply.apply(1,10));
        System.out.println(culminate.apply(1,10));

    }

    public static BiFunction<Integer, Integer, Integer> incrementAndMultiply = (a, b)-> (++a)*b;

    public static Function<Integer, String> simple= num -> "Hello "+num;

    public static BiFunction<Integer,Integer,String> culminate= incrementAndMultiply.andThen(simple);


}
