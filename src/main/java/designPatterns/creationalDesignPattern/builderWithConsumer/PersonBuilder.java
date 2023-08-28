package designPatterns.creationalDesignPattern.builderWithConsumer;

import java.util.function.Consumer;

public class PersonBuilder {
    public String name;
    public String address;
    public int age;
    public boolean isFemale;

    public PersonBuilder builder(Consumer<PersonBuilder> personConsumer){
        personConsumer.accept(this);
        return this;
    }

    public Person build(){
        return new Person(name,address,age,isFemale);
    }
}
