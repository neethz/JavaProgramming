package Concepts;


import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

class Person{
    private String name;
    private int age;
    private Gender gender;

    public Person(String name, int age, Gender gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                '}';
    }
}
public class Streams {

    public static void main(String[] args) {

        List<Person> people= getPeople();

        //Filter all females
        List<Person> females= people.stream()
                .filter(person -> person.getGender().equals(Gender.FEMALE))
                .collect(Collectors.toList());

        System.out.println("-------------------------------------");
        System.out.println("Filter operation");
        females.forEach(System.out::println);

        //Sort
        List<Person> sorted= people.stream()
                .sorted(Comparator.comparing(Person::getAge).thenComparing(Person::getName))
                .collect(Collectors.toList());

        System.out.println("-------------------------------------");
        System.out.println("Sort operation");
        sorted.forEach(System.out::println);

        //All match
        Boolean allMatch = people.stream()
                .allMatch(person -> person.getAge()>1);

        System.out.println("-------------------------------------");
        System.out.println("All match operation");
        System.out.println(allMatch);

        //Any match
        Boolean anyMatch = people.stream()
                .anyMatch(person -> person.getAge()==110);

        System.out.println("-------------------------------------");
        System.out.println("Any match operation");
        System.out.println(anyMatch);

        //None match
        Boolean noneMatch = people.stream()
                .noneMatch(person -> person.getAge()>101);

        System.out.println("-------------------------------------");
        System.out.println("None match operation");
        System.out.println(noneMatch);

        //Max

        Optional<Person> max= people.stream()
                .max(Comparator.comparing(Person::getAge));

        System.out.println("-------------------------------------");
        System.out.println("Max person "+max);

        //Min

        Optional<Person> min = people.stream()
                .min(Comparator.comparing(Person::getName));

        System.out.println("-------------------------------------");
        System.out.println("Min operation "+min);

    }

    private static List<Person> getPeople(){
        return List.of(
                new Person("Z",10,Gender.FEMALE),
                new Person("B",22,Gender.MALE),
                new Person("C",3,Gender.FEMALE),
                new Person("D",32,Gender.MALE),
                new Person("E",14,Gender.FEMALE),
                new Person("F",8,Gender.MALE),
                new Person("G",9,Gender.FEMALE),
                new Person("A",10,Gender.MALE)
        );
    }
}
