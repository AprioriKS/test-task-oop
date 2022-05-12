import model.impl.animal.Cow;
import model.impl.animal.Lion;
import model.impl.food.Grass;
import model.impl.food.Meat;

public class Main {

    public static void main(String[] args) {
        Cow cowBurenka = new Cow("Burenka", 3);
        Cow cowZorka = new Cow("Zorka", 1);
        Lion lionAxe = new Lion("Axe", 5);

        Grass grassSilos = new Grass("Silos", 25);
        Meat meatBeef = new Meat("Beaf", 100);

        cowBurenka.eat(grassSilos, 5);
        cowZorka.eat(grassSilos, 15);
        lionAxe.eat(meatBeef, 40);
    }
}
