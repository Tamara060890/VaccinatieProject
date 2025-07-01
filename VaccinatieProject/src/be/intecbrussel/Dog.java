package be.intecbrussel;

public class Dog extends Animal {
    private boolean hasFoulBreath;

    public Dog(String name, int age, boolean isClean, boolean hasFoulBreath) {
        super(name, age, isClean);
        this.hasFoulBreath = hasFoulBreath;
    }

    @Override
    public void treatAnimal() {
        super.treatAnimal();
        this.hasFoulBreath = false;
    }
}
