public class Dog extends Animal {

    @Override
    public void makeSound() {
        System.out.println("wuf");
    }
    public boolean eat(String apple){
        return true;
    }

    @Override
    public String mood(boolean value) {
        String happy = "Logrer";
        String angry = "Knurer";
        if (value){
            return happy;
        }
       return angry;
    }
}
