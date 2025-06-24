package be.intecbrussel;

import java.util.SortedMap;

public class App {
    public static void main(String[] args) {
        AnimalShelter shelter = new AnimalShelter();

        shelter.addAnimal(new Cat("Minoes", 4));
        shelter.addAnimal(new Monkey("George", 10));
        shelter.addAnimal(new Dog("Bello", 6));
        shelter.addAnimal(new Dog("Anny", 1));
        shelter.addAnimal(new Cat("Soni", 3));
        shelter.addAnimal(new Monkey("Milli", 8));

        System.out.println("--Alle dieren printen--");
        shelter.printAnimals();
        System.out.println("--Dieren sorteren op oplopende leeftijd--");
        shelter.sortAnimalByAge();
        System.out.println("--Dieren sorteren alfabetisch op naam--");
        shelter.sortAnimalsByName();
        System.out.println("--Dieren sorteren op dierennummer--");
        shelter.sortAnimals();
        System.out.println("Er zijn " + shelter.countAnimals() + " dieren.");
        System.out.println("--Zoek dier op naam--");
        System.out.println(shelter.findAnimal("Bello"));
        System.out.println("--Zoek dier met opgegeven diernummer--");
        System.out.println(shelter.findAnimal(1));
        System.out.println("--Behandelt alle dieren--");
        shelter.treatAllAnimals();
        System.out.println("--Behandelt dier met gegeven diernummer--");
        shelter.treatAnimal(2);
        System.out.println("--Behandelt dier met gegeven naam--");
        shelter.treatAnimal("Bello");
        System.out.println("--Toon het oudste dier--");
        System.out.println(shelter.findOldestAnimal());
    }
}
