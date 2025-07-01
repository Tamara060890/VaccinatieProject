package be.intecbrussel;

public class Cat extends Animal{
    private boolean hasLongNails;

    public Cat(String name, int age, boolean isClean, boolean hasLongNails) {
        super(name, age, isClean);
        this.hasLongNails = hasLongNails;
    }

    @Override
    public void treatAnimal() {
        super.treatAnimal();
        this.hasLongNails = false;
    }
}
