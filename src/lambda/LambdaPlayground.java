package lambda;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static lambda.Person.Sex.FEMALE;
import static lambda.Person.Sex.MALE;

public class LambdaPlayground {

    /**
     * Lambda Expressions were added in Java 8.
     *
     * A lambda expression is a short block of code which takes in parameters and returns a value.
     * Lambda expressions are similar to methods, but they do not need a name and they can be implemented right in the body of a method.
     *
     * The simplest lambda expression contains a single parameter and an expression:
     * parameter -> expression
     * (parameter1, parameter2) -> expression
     *
     * Expressions are limited. They have to immediately return a value, and they cannot contain variables, assignments or statements such as if or for.
     * In order to do more complex operations, a code block can be used with curly braces.
     * If the lambda expression needs to return a value, then the code block should have a return statement.
     * (parameter1, parameter2) -> { code block }
     *
     */

    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("John Smith", LocalDate.of(1990, 5, 15), MALE, "john.smith@example.com", 31));
        people.add(new Person("Emily Davis", LocalDate.of(1988, 9, 22), FEMALE, "emily.davis@example.com", 22));
        people.add(new Person("David Lee", LocalDate.of(2000, 2, 10), MALE, "david.lee@example.com", 23));

        System.out.println("Persons between the ages of 14 and 30 (without lambda):");
        printPersonsWithinAgeRangeWithoutLambda(people, 14, 30);
        System.out.println("");

        System.out.println("Persons between the ages of 20 and 35 (with lambda):");
        printPersonsWithinAgeRangeWithLambda(people, 20, 35);
        System.out.println("");

        System.out.println("Check for eligibility:");
        eligiblePerson(people, 20, 35);
        System.out.println("");

    }

    // Without lambda
    public static void printPersonsWithinAgeRangeWithoutLambda(List<Person> roster, int low, int high) {
        for (Person p : roster) {
            if (low <= p.getAge() && p.getAge() < high) {
                System.out.println(p.getName() + " -> " + p.getAge());
            }
        }
    }

    // With lambda
    public static void printPersonsWithinAgeRangeWithLambda(List<Person> roster, int low, int high) {
        roster.stream()
                .filter(person -> person.getAge() >= low && person.getAge() <= high)
                .forEach(person -> System.out.println(person.getName() + " -> " + person.getAge()));
    }

    // With lambda
    public static void eligiblePerson(List<Person> roster, int low, int high) {
        roster
                .stream()
                .filter(
                        p -> p.getGender() == Person.Sex.MALE
                                && p.getAge() >= low
                                && p.getAge() <=high)
                .map(p -> p.getEmailAddress())
                .forEach(email -> System.out.println(email));
    }
}
