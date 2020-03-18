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
        return ("I am " + getKind() + ", eat " + getFoodKind());
    }
    public double getWeight() {
        return weight;
    }
    public double getFoodCoeff() {
        return 0.02;
    }
    public double calculateFoodWeight() {
        return getWeight() * getFoodCoeff();
    }
    public String toStringFull() {
        return ("I am " + getKind() + ", eat " + getFoodKind() + " " + calculateFoodWeight());
    }

    public static void main(String[] args) {
        Animal resalt = new Animal(50);
        System.out.println(resalt);
        System.out.println(resalt.toStringFull());
    }
}
