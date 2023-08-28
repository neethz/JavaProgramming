package FunctionalProgramming.functions;

import java.util.function.Function;

public class _function {
    public static void main(String[] args) {

        System.out.println(increment.apply(3));
        System.out.println(incrementMultiply.apply(4));
    }

    static Function<Integer, Integer> increment = num -> ++num;
    static Function<Integer, Integer> multiply= num -> num*10;
    static Function<Integer,Integer> incrementMultiply = increment.andThen(multiply);
}
