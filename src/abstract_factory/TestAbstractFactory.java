package abstract_factory;

public class TestAbstractFactory {
    public static void main(String[] args) {
        AnimalFactory animalFactory = new AnimalFactory();
        Animal animal = animalFactory.getAnimal("TIGER");

        System.out.println(animal.makeSound());
        System.out.println(animal.getAnimal());

    }
}
