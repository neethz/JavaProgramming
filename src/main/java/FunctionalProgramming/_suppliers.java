package FunctionalProgramming;

import java.util.function.Supplier;

public class _suppliers {

    public static void main(String[] args) {
        System.out.println(getDbName.get());

    }

    public static Supplier<String> getDbName = () -> "helloworldDB";
}
