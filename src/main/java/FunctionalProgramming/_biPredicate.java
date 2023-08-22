package FunctionalProgramming;

import java.util.function.BiPredicate;

public class _biPredicate {
    public static void main(String[] args) {
        System.out.println(biPredicate.test("Neethu",101));
        System.out.println(biPredicate.test("Roy",100));

    }

    public static BiPredicate<String, Integer> biPredicate= (name,num)->
            name.contains("N") && num>100;
}
