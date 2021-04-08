package abstract_factory;

public class Lion implements Animal {
    @Override
    public String makeSound() {
        return "R O A D...";
    }

    @Override
    public String getAnimal() {
        return "LION";
    }
}
