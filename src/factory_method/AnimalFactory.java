package factory_method;

public class AnimalFactory {
    public Animal getAnimal(String type){
        if ("dataType".equals(type)){
            return new Dog();
        }
        else {
            return new Cat();
        }
    }
}
