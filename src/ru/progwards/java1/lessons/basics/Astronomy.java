package ru.progwards.java1.lessons.basics;

public class Astronomy {

    static final float PI = 3.14f; //задали коонстанту пи
    static final double R_EARTH = 6371.2; //радиус Земли
    static final double R_MERCURY = 2439.7; //радиус Меркурия
    static final double R_JUPITER = 71492.0; //радиус Юпитера

    public static Double sphereSquare(Double r) {
        return 4 * PI * Math.pow(r, 2); //площадь сферы
    }

    public static Double earthSquare() {
        return sphereSquare(R_EARTH); //площадь поверхности Земли
    }

    public static Double mercurySquare() {
        return sphereSquare(R_MERCURY); //площадь поверхности Меркурия
    }

    public static Double jupiterSquare() {
        return sphereSquare(R_JUPITER);
    }

    public static Double earthVsMercury() {
        return earthSquare() / mercurySquare(); //отношение площади Земли и Меркурия
    }

    public static Double earthVsJupiter() {
        return earthSquare() / jupiterSquare();
    }

    public static void main(String[] args) {
        System.out.println(earthSquare());
        System.out.println(mercurySquare());
        System.out.println(jupiterSquare());
        System.out.println(earthVsMercury());
        System.out.println(earthVsJupiter());
    }
}
