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
        if (value){
            System.out.println("Spinder");
        } else {
            System.out.println("Hvæser");
        }

        System.out.println("Katten reagere og " + (value?"Spinder":"hvæser"));
    }

}
