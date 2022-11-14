public class Cat extends Animal{
    @Override
    public void makeSound() {
        System.out.println("Miow");
    }

    public boolean eat(String apple){
        return true;
    }

    @Override
    public String mood(boolean value) {
        String happy = "Spinder";
        String angry = "Hvæser";
        if (value){
            return happy;
        }
        return angry;
    }
}
