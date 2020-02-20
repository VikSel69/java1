package ru.progwards.java1.lessons.classes;

public class ComplexNum {
    int a, b;
    public ComplexNum(int a, int b) {
        this.a = a;
        this.b = b;
    }
    public String toString() {
        return (a + "+" + b + "i");
    }
    public ComplexNum add(ComplexNum num) {
        return new ComplexNum(a + num.a, b + num.b);
    }
    public ComplexNum sub(ComplexNum num) {
        return new ComplexNum(a - num.a, b - num.b);
    }
    public ComplexNum mul(ComplexNum num) {
        return new ComplexNum(a * num.a - b*num.b, b * num.a + a*num.b);
    }
    public ComplexNum div(ComplexNum num) {
        return new ComplexNum((a * num.a + b * num.b) / (num.a * num.a+num.b * num.b),
                (b * num.a - a * num.b) / (num.a * num.a + num.b * num.b));
    }
}
