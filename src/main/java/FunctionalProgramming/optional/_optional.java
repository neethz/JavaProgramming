package FunctionalProgramming.optional;

import java.util.Optional;

public class _optional {
    public static void main(String[] args) {

        Optional.ofNullable("Neethu")
                .ifPresentOrElse(name-> System.out.println("Hello "+name),
                        ()-> System.out.println("Null value"));
    }
}
