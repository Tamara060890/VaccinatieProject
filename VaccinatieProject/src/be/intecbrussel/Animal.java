package be.intecbrussel;

import java.util.HashMap;
import java.util.Map;

public abstract class Animal implements Treatable, Vaccinateable{
    protected int animalNumber;
    protected String name;
    protected int age;
    protected boolean isClean;
    protected Map<Disease, Boolean> isVaccinated;
    protected static int animalId = 1;

    //Constructors
    public Animal() {
        this.isClean = isClean;
        this.isVaccinated = new HashMap<>();
        for (Disease d : Disease.values()){
            isVaccinated.put(d,false);
        }
    }

    public Animal(String name, int age, boolean isClean) {
        this.name = name;
        this.age = age;
        this.isClean = isClean;
        this.isVaccinated = new HashMap<>();
        for (Disease d : Disease.values()){
            isVaccinated.put(d,false);
        }
    }

    //Getters en Setters
    public int getAnimalNumber() {
        return animalNumber;
    }

    public void setAnimalNumber(int animalNumber) {
        this.animalNumber = animalNumber;
    }

    public String getName() {return name;}

    public void setName(String name) {this.name = name;}

    public boolean isClean() {return isClean;}

    public void setClean(boolean clean) {isClean = clean;}

    public int getAge() {return age;}

    public void setAge(int age) {this.age = age;}

    public Map<Disease, Boolean> getIsVaccinated() {return isVaccinated;}

    public void setIsVaccinated(Map<Disease, Boolean> isVaccinated) {this.isVaccinated = isVaccinated;}

    public static int getAnimalId() {return animalId;}

    public static void setAnimalId(int animalId) {Animal.animalId = animalId;}

    //Controleert of dier gevaccineerd voor opgegeven ziekte
    public boolean isVaccinated(Disease d){return isVaccinated.getOrDefault(d, false);}

    //Markeert dier als gevaccineerd voor opgegeven ziekte
    @Override
    public void vaccinateAnimal(Disease d) {
        isVaccinated.put(d, true);
    }

    //Markeert dier als behandeld
    public void treatAnimal() {
        this.isClean = true;
    }

    //toString() met naam, leeftijd en nummer
    @Override
    public String toString() {
        return animalNumber + ". " + name + " is " + age + " jaar oud." ;
    }
}
