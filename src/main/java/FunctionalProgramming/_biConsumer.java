package FunctionalProgramming;

import java.util.function.BiConsumer;

public class _biConsumer {
    public static void main(String[] args) {

        greet1.accept(new Customer1("Neethu",989898),false);

    }

    public static BiConsumer<Customer1, Boolean> greet1= ((customer1, aBoolean) ->
            System.out.println("Hi "+customer1.name()+" Thanks for registering with phone number "+
                    (aBoolean?customer1.phone():"*******")));
}



record Customer1 (String name, int phone){}
