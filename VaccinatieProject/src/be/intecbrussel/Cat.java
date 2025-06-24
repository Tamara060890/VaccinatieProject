package be.intecbrussel;

public class Cat extends Animal{
    private boolean hasLongNails;

    public Cat(String name, int age) {
        super(name, age);
    }

    //hasLongNails = false, isClean = true
    @Override
    public void treatAnimal() {
        this.hasLongNails = false;
        this.isClean = true;
    }
}
