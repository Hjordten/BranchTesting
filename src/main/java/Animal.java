public abstract class Animal {
    private String name;

    public String getName() {
        return name;
    }
    public abstract void makeSound();

    public abstract boolean eat(String foodType);

    public abstract String mood(boolean mood);
}
