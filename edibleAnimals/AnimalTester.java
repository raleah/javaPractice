public class AnimalTester {
    public static void main(String[] args){
        Cow cow = new Cow();
        Dog dog = new Dog();
        System.out.println("The sound a cow makes is: ");
        System.out.println(cow.sound());

        System.out.println("How to eat a cow: ");
        System.out.println(cow.howToEat());

        System.out.println("The sound a dog makes is: ");
        System.out.println(dog.sound());

    }
}
