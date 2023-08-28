package FunctionalProgramming.functions;

import java.util.function.Predicate;

public class _predicate {
    public static void main(String[] args) {

        System.out.println(lengthCheck.test("78777"));
        System.out.println(lengthCheck.test("787"));
        System.out.println(containsCheck.test("6763"));
        System.out.println(containsCheck.test("787"));
        System.out.println(lengthCheck.and(containsCheck).test("12343"));
        System.out.println(lengthCheck.or(containsCheck).test("32"));

    }

    public static Predicate<String> lengthCheck = phoneNum -> phoneNum.length()==5;

    public static Predicate<String> containsCheck = phoneNum -> phoneNum.contains("3");
}

