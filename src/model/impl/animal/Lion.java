package model.impl.animal;

import model.Animal;
import model.Food;

public class Lion extends Animal {

    public Lion(String name, int age) {
        super(name, age);
    }


    @Override
    public void eat(Food food, int amount) {
        System.out.println("Lion eating " + amount + " " + food.getTitle());
        food.setAmount(food.getAmount()-amount);
        System.out.println(food.getTitle() + " left " + food.getAmount());
    }
}
