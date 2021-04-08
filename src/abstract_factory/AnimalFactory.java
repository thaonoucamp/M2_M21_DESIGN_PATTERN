package abstract_factory;

import java.awt.*;

public class AnimalFactory implements AnimalAbstract {
    @Override
    public Animal getAnimal(String animalType) {
        if ("TIGER".equals(animalType)) {
            return new Tiger();
        } else if ("LION".equals(animalType)) {
            return new Lion();
        }
        return null;
    }

    @Override
    public Color getColor(String colorType) {
        throw new UnsupportedOperationException();
    }
}
