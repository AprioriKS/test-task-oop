package model.impl.animal;

import model.Animal;
import model.Food;

public class Cow extends Animal {

    public Cow(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat(Food food, int amount) {
        System.out.println("Cow eating " + amount + " " + food.getTitle());
        food.setAmount(food.getAmount()-amount);
        System.out.println(food.getTitle() + " left " + food.getAmount());
    }


}
