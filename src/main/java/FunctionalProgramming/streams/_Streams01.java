package FunctionalProgramming.streams;


import java.util.List;
import java.util.stream.Collectors;

import static FunctionalProgramming.streams.Gender.FEMALE;
import static FunctionalProgramming.streams.Gender.MALE;

public class _Streams01 {

    public static void main(String[] args) {
        List<Person> people= List.of(
                new Person("Neethu", FEMALE),
                new Person("Roy", MALE),
                new Person("Cristal",FEMALE)
        );

        people.stream()
                .map(person -> person.gender())
                .collect(Collectors.toSet())
                .forEach(System.out::println);

        people.stream()
                .map(person -> person.name())
                .map(person1 -> person1.length())
                .filter(length -> length>4)
                .collect(Collectors.toList())
                .forEach(System.out::println);

        System.out.println("List contains females ? "+
                people.stream()
                        .anyMatch(person -> person.gender().equals(FEMALE)));
        System.out.println("List contains only males ?"+
                people.stream()
                        .allMatch(person -> person.gender().equals(MALE)));

        System.out.println("List contains preferred gender ? "+
                people.stream()
                        .noneMatch(person -> person.gender().equals("NOT")));

    }
}

record Person(String name, Gender gender){}
enum Gender{
    MALE,
    FEMALE
}
