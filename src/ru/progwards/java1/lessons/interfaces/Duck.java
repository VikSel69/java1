package ru.progwards.java1.lessons.interfaces;

public class Duck extends Animal {
    Duck(double weight) {
        super(weight);
    }

    @Override
    public AnimalKind getKind() {
        return AnimalKind.DUCK;
    }

    @Override
    public FoodKind getFoodKind() {
        return FoodKind.CORN;
    }

    @Override
    public double getFoodCoeff() {
        return 0.04;
    }

    public static void main(String[] args) {
        Duck typeAnimal = new Duck(60);
        Duck typeAnimal2 = new Duck(80);
        System.out.println(typeAnimal);
        System.out.println(typeAnimal.getFoodKind());
        System.out.println(typeAnimal.getFood1kgPrice());
        System.out.println(typeAnimal.getFoodPrice());
        System.out.println(typeAnimal.compareFoodPrice(typeAnimal));
        System.out.println(typeAnimal.compareFoodPrice(typeAnimal2));
    }
}