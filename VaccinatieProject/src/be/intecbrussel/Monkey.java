package be.intecbrussel;

public class Monkey extends Animal{
    private boolean isHyperActive;

    public Monkey(String name, int age, boolean isClean, boolean isHyperActive) {
        super(name, age, isClean);
        this.isHyperActive = isHyperActive;
    }

    @Override
    public void treatAnimal() {
        super.treatAnimal();
        this.isHyperActive = false;
    }
}
