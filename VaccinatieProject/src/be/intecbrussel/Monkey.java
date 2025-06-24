package be.intecbrussel;

public class Monkey extends Animal{
    private boolean isHyperActive;

    public Monkey(String name, int age) {
        super(name, age);
    }

    //hasLongNails = false, isClean = true
    @Override
    public void treatAnimal() {
        this.isHyperActive = false;
        this.isClean = true;
    }
}
