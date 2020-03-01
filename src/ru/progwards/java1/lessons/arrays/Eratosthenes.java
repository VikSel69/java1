package ru.progwards.java1.lessons.arrays;
import java.util.Arrays;

public class Eratosthenes {
    private boolean[] sieve;
    int sizeArray;
    public Eratosthenes(int N) {
        sizeArray = N;
        sieve = new boolean[sizeArray];
        Arrays.fill(sieve, true);
        sift();
    }
    private void sift() {
        for (int i = 2; i < sizeArray + 2; i++) {
            for ( int j = i; i * j < sizeArray + 2; j++) {
                if (j * i < sizeArray + 2) {
                    sieve[i * j - 2] = false;
                }
            }
        }
    }
    public boolean isSimple(int n) {
        return sieve[n - 2];
    }

    public static void main(String[] args) {
        Eratosthenes test = new Eratosthenes(10);
        System.out.println(Arrays.toString(test.sieve));
        System.out.println(test.isSimple(2));
    }
}
