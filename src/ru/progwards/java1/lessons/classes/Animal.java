package ru.progwards.java1.lessons.classes;

class Animal {
    double weight;
    enum AnimalKind {
        ANIMAL, COW, HAMSTER, DUCK
    }
    enum FoodKind {
        UNKNOWN, HAY, CORN
    }
    public Animal(double weight) {
        this.weight = weight;
    }
    public AnimalKind getKind() {
        return AnimalKind.ANIMAL;
    }
    public FoodKind getFoodKind() {
        return FoodKind.UNKNOWN;
    }
    public String toString() {
        return ("I am " + this.getKind() + ", eat " + this.getFoodKind());
    }
    public double getWeight() {
        return this.weight;
    }
    public double getFoodCoeff() {
        return 0.02;
    }
    public double calculateFoodWeight() {
        return this.weight * this.getFoodCoeff();
    }
    public String toStringFull() {
        return ("I am " + this.getKind() + ", eat " + this.getFoodKind() + this.calculateFoodWeight());
    }
}

class Cow extends Animal {
    Cow(double weight) {
        super(weight);
    }
    @Override
    public AnimalKind getKind() {
        return AnimalKind.COW;
    }
    @Override
    public FoodKind getFoodKind() {
        return FoodKind.HAY;
    }
    @Override
    public double getFoodCoeff() {
        return 0.05;
    }
}

class Hamster extends Animal {
    Hamster(double weight) {
        super(weight);
    }

    @Override
    public AnimalKind getKind() {
        return AnimalKind.HAMSTER;
    }

    @Override
    public FoodKind getFoodKind() {
        return FoodKind.CORN;
    }
    @Override
    public double getFoodCoeff() {
        return 0.03;
    }
}
class Duck extends Animal {
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
    public static void main(String[] args) {
        Animal typeAnimal = new Animal(60);
        System.out.println(typeAnimal);
    }
    @Override
    public double getFoodCoeff() {
        return 0.04;
    }
}
