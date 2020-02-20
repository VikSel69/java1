package ru.progwards.java1.lessons.test;

public class Person {
    // свойства
    private String name;
    private int age;
    private String country;
    // конструктор
    public Person () {
        this.country = "RU";
    }
    public Person (String name, int age) {
        this();
        this.name = name;
        this.age = age;
    }
    // методы
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public String getCountry() {
       return country ;
    }

    public static void main(String[] args) {
        Person person = new Person("Viktor", 50);
        System.out.println(person.getCountry());
        System.out.println(person.getName());
        System.out.println(person.getAge());
    }
}
