package ru.progwards.java1.lessons.classes;

public class Duck extends Animal {
    Duck(double weight) {
        super(weight);
    }

    @Override
    public Animal.AnimalKind getKind() {
        return Animal.AnimalKind.DUCK;
    }

    @Override
    public Animal.FoodKind getFoodKind() {
        return Animal.FoodKind.CORN;
    }

    @Override
    public double getFoodCoeff() {
        return 0.04;
    }

    public static void main(String[] args) {
        Duck typeAnimal = new Duck(60);
        System.out.println(typeAnimal);
        System.out.println(typeAnimal.getFoodKind());
    }
}
