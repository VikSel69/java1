package ru.progwards.java1.lessons.test;

public class Test2 {
    static int addAsStrings(int n1, int n2) {
        String str1 = String.valueOf(n1);
        String str2 = String.valueOf(n2);
        return Integer.parseInt (str1 + str2);
    }
    public static void main(String[] args) {
        System.out.println(addAsStrings(101, 202));
    }
}
