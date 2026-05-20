package com.pluralsight.loops;

import java.util.ArrayList;

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

        // Display all people
        for (Person person : people) {
            System.out.println(person.firstName + " " +
                    person.lastName + " - Age: " + person.age);
        }
    }
}
