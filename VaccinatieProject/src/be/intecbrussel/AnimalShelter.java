package be.intecbrussel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class AnimalShelter {
    private List<Animal> animals = new ArrayList<>();
    private int animalId = 1;

    public int getAnimalId() {
        return animalId;
    }

    //Voegt dier toe en wijst uniek diernummer toe
    public void addAnimal(Animal animal){
        animal.animalNumber = animalId++;
        animals.add(animal);
    }

    //Retourneert het aantal dieren in de shelter
    public int countAnimals(){
        return animals.size();
    }

    //Sorteert dieren op dierennummer
    public void sortAnimals(){
        animals.stream()
                .sorted(Comparator.comparingInt(Animal::getAnimalNumber))
                .forEach(animal -> System.out.println(animal.getAnimalNumber() + " - " + animal.getName() +" - " + animal.getAge() + " jaar"));
    }

    //Sorteert dieren alfabetisch op naam
    public void sortAnimalsByName(){
        animals.stream()
                .sorted(Comparator.comparing(Animal::getName))
                .forEach(animal -> System.out.println(animal.getName() + " - " + animal.getAge() + " jaar."));
    }

    //Sorteert dieren op oplopende leeftijd
    public void sortAnimalByAge(){
       animals.stream()
                .sorted(Comparator.comparingInt(Animal::getAge))
                .forEach(animal -> System.out.println(animal.getAge() + " jaar" + " - " + animal.getName()));
    }

    //Toont alle dieren in de shelter
    public void printAnimals(){
        animals.stream().forEach(System.out::println);
    }

    //Print dieren die niet gevaccineerd zijn
    public void printAnimalsNotVaccinated(Disease disease){
        animals.stream()
                .filter(animal -> !animal.isVaccinated(disease))
                .forEach(System.out::println);
    }

    //Zoekt dier met opgegeven diernummer
    public Animal findAnimal(int number){
        return animals.stream()
                .filter(animal -> animal.getAnimalNumber() == number)
                .findFirst()
                .orElse(null);
    }

    //Zoekt dier op naam
    public Animal findAnimal(String name){
        return animals.stream()
                .filter(animal -> animal.getName().equalsIgnoreCase(name))
                .findFirst()
                .orElse(null);
    }

    //Behandeld dier met gegeven diernummer
    public void treatAnimal(int number){
        for(Animal animal:animals){
            if(animal.getAnimalNumber() == number){
                animal.treatAnimal();
                System.out.println(getAnimalId()+ ". " + animal.getName() + " is behandeld.");
            }
        }
    }

    //Behandeld dier met gegeven naam
    public void treatAnimal(String name){
        for(Animal animal: animals) {
            if (animal.getName().equalsIgnoreCase(name)) {
                animal.treatAnimal();
                System.out.println(getAnimalId() + ". " + animal.getName() + " is behandeld.");
            }
        }
    }

    //Behandeld alle dieren in de shelter
    public void treatAllAnimals(){
        for(Animal animal: animals){
            animal.treatAnimal();
            System.out.println(animal.getName() + " is behandeld.");
        }
    }

    //Retourneert het oudste dier in de shelter
    public Animal findOldestAnimal(){
        return animals.stream()
                .max(Comparator.comparingInt(Animal::getAge))
                .orElse(null);
    }
}
