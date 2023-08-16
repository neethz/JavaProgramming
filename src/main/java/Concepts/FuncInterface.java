package Concepts;

//Anonymous class and functional interface. Lambda functions as well

@FunctionalInterface
interface World {
    void helloWorld();
}

public class FuncInterface {


    public static void main(String[] args) {
        World world = () -> {
            System.out.println("Hey there");
        };
        world.helloWorld();

        World world1 = () -> {
            System.out.println("Second world");
        };
        world1.helloWorld();
    }

}
