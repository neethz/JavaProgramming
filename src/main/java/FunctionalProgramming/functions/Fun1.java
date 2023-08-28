package FunctionalProgramming.functions;


import java.util.List;
import java.util.stream.Collectors;

public class Fun1 {
    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person("Neethu", Gender.FEMALE),
                new Person("Roy", Gender.MALE),
                new Person("Cristal", Gender.FEMALE)
        );

        List<Person> female= people.stream()
                .filter(person -> person.gender()==Gender.FEMALE)
                .collect(Collectors.toList());

        female.forEach(System.out::println);
    }
}

record Person(String fname, Gender gender){}

enum Gender{
    MALE,
    FEMALE
}
