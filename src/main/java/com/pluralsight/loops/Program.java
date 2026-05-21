package com.pluralsight.loops;

import com.pluralsight.Person;
import java.util.ArrayList;
import java.util.Scanner;


public class Program {

    public static void main(String[] args) {

        // Create list of people
        ArrayList<Person> people = new ArrayList<>();

        // Add people to the list
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

// Create scanner for user input
        Scanner scanner = new Scanner(System.in);

// Ask user for a name to search
        System.out.print("Enter a first or last name to search: ");
        String searchName = scanner.nextLine();

// Create list for matches
        ArrayList<Person> matches = new ArrayList<>();

// Search through people list
        for (Person person : people) {

            if (person.firstName.equalsIgnoreCase(searchName)
                    || person.lastName.equalsIgnoreCase(searchName)) {

                matches.add(person);
            }
        }

// Display matches
        System.out.println("\nMatching People:");

        for (Person person : matches) {
            System.out.println(person.firstName + " "
                    + person.lastName + " - Age: " + person.age);
        }

        // Variables for age calculations
        int totalAge = 0;
        int oldestAge = people.get(0).age;
        int youngestAge = people.get(0).age;

// Loop through all people
        for (Person person : people) {
            totalAge += person.age;

            if (person.age > oldestAge) {
                oldestAge = person.age;
            }

            if (person.age < youngestAge) {
                youngestAge = person.age;
            }
        }

// Calculate average age
        double averageAge = (double) totalAge / people.size();

// Display results
        System.out.println("\nAge Summary:");
        System.out.println("Average age: " + averageAge);
        System.out.println("Oldest age: " + oldestAge);
        System.out.println("Youngest age: " + youngestAge);
        // Display all people
        for (Person person : people) {
            System.out.println(person.firstName + " " +
                    person.lastName + " - Age: " + person.age);
        }
        // Calculate average age using streams
        double averageAge = people.stream()
                .map(person -> person.age)
                .reduce(0, Integer::sum) / (double) people.size();

        System.out.println("\nAverage age: " + averageAge);
    }


}