package FunctionalProgramming.functions;

import java.util.function.Consumer;

public class _consumer {

    public static void main(String[] args) {

        greet.accept(new Customer("Neethu",90909));


    }
    static Consumer<Customer> greet= customer -> System.out.println("Hey "+customer.name()+
            ", thanks for registering with phone number "+ customer.phone());
}

record Customer (String name, int phone){}
