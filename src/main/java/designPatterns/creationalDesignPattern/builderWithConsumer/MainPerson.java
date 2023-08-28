package designPatterns.creationalDesignPattern.builderWithConsumer;

public class MainPerson {

    public static void main(String[] args) {

        Person Neethu = new PersonBuilder().builder(
                personBuilder -> {
                    personBuilder.name="Neethu";
                    personBuilder.age=33;
                    personBuilder.isFemale=true;
                }
        ).build();

        System.out.println(Neethu);
    }
}
