package com.pluralsight.streams;

import com.pluralsight.Person;
import java.util.ArrayList;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        // Create list of people
        ArrayList<Person> people = new ArrayList<>();

        // Add people
        people.add(new Person("John", "Smith", 25));
        people.add(new Person("Emma", "Johnson", 30));
        people.add(new Person("Michael", "Brown", 19));
        people.add(new Person("Sophia", "Davis", 42));
        people.add(new Person("Daniel", "Wilson", 35));
        people.add(new Person("Olivia", "Taylor", 28));
        people.add(new Person("James", "Anderson", 50));
        people.add(new Person("Ava", "Thomas", 22));
        people.add(new Person("William", "Jackson", 60));
        people.add(new Person("Mia", "White", 18));

        // Scanner input
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a first or last name to search: ");
        String searchName = scanner.nextLine();
        // Search using stream and filter
        ArrayList<Person> matches = people.stream()
                .filter(person -> person.firstName.equalsIgnoreCase(searchName)
                        || person.lastName.equalsIgnoreCase(searchName))
                .collect(ArrayList::new, ArrayList::add, ArrayList::addAll);

// Display matches
        System.out.println("\nMatching People:");

        for (Person person : matches) {
            System.out.println(person.firstName + " "
                    + person.lastName + " - Age: " + person.age);
        }
        // Calculate average age using streams
        double averageAge = people.stream()
                .map(person -> person.age)
                .reduce(0, Integer::sum) / (double) people.size();

        System.out.println("\nAverage age: " + averageAge);



    }

}
