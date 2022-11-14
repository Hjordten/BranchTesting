public class Dog extends Animal {

    @Override
    public void makeSound() {
        System.out.println("wuf");
    }

    public boolean eat(String apple) {
        return true;
    }

    @Override
    public void mood(boolean value) {
        if (value) {
            System.out.println("Sur");
        } else {
            System.out.println("glad");

        }
    }
}
