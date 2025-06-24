package be.intecbrussel;

public class Dog extends Animal {
    private boolean hasFoulBreath = false;

    public Dog(String name, int age) {
        super(name, age);
    }

    //hasLongNails = false, isClean = true
    @Override
    public void treatAnimal() {
        this.hasFoulBreath = false;
        this.isClean = true;
    }
}
