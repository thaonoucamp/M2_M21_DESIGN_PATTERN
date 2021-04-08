package abstract_factory;

import java.awt.*;

public interface AnimalAbstract {
    Animal getAnimal(String animalType);
    Color getColor(String colorType);
}
