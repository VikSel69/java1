package ru.progwards.java1.lessons.interfaces;

import java.util.Objects;

class Animal implements FoodCompare, CompareWeight {
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
    @Override
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
    @Override
    public boolean equals(Object anObject) {
        if (this == anObject)
            return true;
        if (anObject == null || getClass() != anObject.getClass())
            return false;
        Animal animal = (Animal) anObject;
        return Double.compare(animal.weight, weight) == 0;
    }
    @Override
    public int hashCode() {
        return Objects.hash(weight);
    }

    public double getFood1kgPrice() {
        switch (getFoodKind()) {
            case UNKNOWN: return 0;
            case HAY: return 20;
            case CORN: return 50;
        }
        return 0;
    }
    public double getFoodPrice() {
        return calculateFoodWeight() * getFood1kgPrice();
    }
    @Override
    public int compareFoodPrice(Animal aminal) {
        return Double.compare(this.getFoodPrice(), aminal.getFoodPrice());
    }

    public static void main(String[] args) {
        Animal resalt = new Animal(50);
        System.out.println(resalt);
        System.out.println(resalt.toStringFull());
        System.out.println(resalt.getKind());
        System.out.println(resalt.getFoodKind());
        System.out.println(resalt.getWeight());
        System.out.println(resalt.compareWeight(resalt));
    }

}
