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
        Duck typeAnimal1 = new Duck(60);
        Duck typeAnimal2 = new Duck(80);
        System.out.println(typeAnimal1);
        System.out.println(typeAnimal1.getFoodKind());
        System.out.println(typeAnimal1.getFood1kgPrice());
        System.out.println(typeAnimal1.getFoodPrice());
        System.out.println(typeAnimal1.compareFoodPrice(typeAnimal1));
        System.out.println(typeAnimal1.compareFoodPrice(typeAnimal2));
        System.out.println(typeAnimal1.compareWeight(typeAnimal2));
    }
}
