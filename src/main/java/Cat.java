public class Cat extends Animal{
    @Override
    public void makeSound() {
        System.out.println("Miow");
    }

    public boolean eat(String apple){
        return true;
    }

    @Override
    public void mood(boolean value) {
        if (value == true){
            System.out.println("Sur");
        } else {
            System.out.println("glad");
        }
    }
}
