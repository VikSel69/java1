package ru.progwards.java1.lessons.interfaces;

public interface CompareWeight {

    public enum CompareResult {
        LESS, EQUAL, GREATER
    }

    public double getWeight();
    default public CompareResult compareWeight(CompareWeight smthHasWeigt) {
        int compareWeight = Double.compare(getWeight(), smthHasWeigt.getWeight());
        switch (compareWeight) {
            case 1: return CompareResult.GREATER;
            case 0: return CompareResult.EQUAL;
            case -1: return CompareResult.LESS;
        }
        return null;
    }
}
