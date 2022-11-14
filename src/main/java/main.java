public class main {
    public static void main(String[] args) {


    Animal animal = new Dog();
    Animal animal1 = new Cat();

    animal.makeSound();
    animal1.makeSound();

    System.out.println(animal.eat("cactus"));
    System.out.println(animal1.eat("raw onion"));


    animal.mood(false);
    animal1.mood(false);


    }
}
