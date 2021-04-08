package abstract_factory;

public class Tiger implements Animal {
    @Override
    public String makeSound() {
        return "G R U M M M";
    }

    @Override
    public String getAnimal() {
        return "TIGER";
    }
}
