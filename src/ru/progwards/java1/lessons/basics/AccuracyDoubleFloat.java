package ru.progwards.java1.lessons.basics;

public class AccuracyDoubleFloat {

    static final double PI = 3.14; //задали коонстанту пи
    static final double R_EARTH = 6371.2; //радиус Земли

    public static double volumeBallDouble(double radius) {
        return 4.0 / 3.0 * PI * Math.pow(radius, 3); //объем сферы тип double
    }

    public static float volumeBallFloat(float radius) {
        return 4.0f / 3.0f * (float) PI * (float) Math.pow(radius, 3); //объем сферы тип float
    }

    public static double calculateAccuracy(double radius) {
        return volumeBallDouble(radius) - volumeBallFloat((float) radius); //разница вычислений типом double и float
    }

    public static void main(String[] args) {
        System.out.println(volumeBallDouble(R_EARTH));
        System.out.println(volumeBallFloat((float) R_EARTH));
        System.out.print(calculateAccuracy(R_EARTH));
    }
}
