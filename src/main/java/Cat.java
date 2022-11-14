public class Cat extends Animal{
    @Override
    public void makeSound() {
        System.out.println("Miow");
    }

    public boolean eat(String apple){
        return true;
    }
}
