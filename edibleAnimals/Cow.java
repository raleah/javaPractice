public class Cow extends Animal implements Edible{

    @Override
    public String sound() {
        return "Moo";
    }

    @Override
    public String howToEat() {
        return "Roast";
    }
}
